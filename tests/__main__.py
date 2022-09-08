import os
import random
import collections
from functools import reduce

import sympy

from sympy2code import java_code_method

from .sympy_formula import *
from .dir_const import java_module_dir, java_test_dir

java_code_dict = dict(
    add1 = add_1,
    minus1 = minus_1,
    mul1 = mul_1,
    div1 = div_1,
    floor1 = floor_1,
    complexFormula1 = complex_formula_1,
    hItemFromBigBoxMCrit =  h_item_from_big_box_m_crit
)

java_code_all = "\n\t".join(
    java_code_method(v, k) for k, v in java_code_dict.items()
).replace('\n', '\n\t')

with open(os.path.join(java_module_dir, "SympyCode.java"), "w", encoding="utf8") as f:
    f.write("package sympy;\n\n")
    f.write(
    """public class SympyCode {\n"""
    f"""{java_code_all}\n"""
    """}"""
    )

java_test_code = ""
for name, formula in java_code_dict.items():
    java_test_code += f"\t@Test\n\tpublic void {name}Test() {{\n"

    for _ in range(10):
        formula_symbols = collections.OrderedDict(
            sorted({s: random.randint(-100000, 100000) for s in formula.atoms() if isinstance(s, sympy.Symbol)}.items(), key=lambda x: x[0].__repr__())
        )
        variables_str = ", ".join(f"{v}"for k, v in formula_symbols.items())
        res = float(sympy.Float(reduce(lambda f, s: f.subs(s[0], s[1]), formula_symbols.items(), formula)).evalf())
        java_test_code += f"\t\tassertEquals(SympyCode.{name}({variables_str}), {res});\n"
    java_test_code += "\t};\n\n"

test_file_str = f"""\
package sympytest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import sympy.SympyCode;
class SympyJUnit5Test {{
{java_test_code}
}};
"""

with open(os.path.join(java_test_dir, "SympyTest.java"), "w", encoding="utf8") as f:
    f.write(test_file_str)