from sympy2code import java_code_method

from .sympy_formula import *

java_code_dict = list(
    java_code_method(add_1, "add1"),
    java_code_method(minus_1, "minus2"),
    java_code_method(mul_1, "mul3"),
    java_code_method(div_1, "div4"),
    java_code_method(floor_1, "floor5"),
    java_code_method(complex_formula_1, "complexFormula1"),
)