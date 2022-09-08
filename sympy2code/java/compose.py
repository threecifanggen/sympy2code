from functools import reduce
from typing import Tuple

from sympy import Add, Mul, Integer, Float, Symbol, Basic, Pow, floor, ceiling, Max, Min, Rational

def java_code_method(formula: Basic, name: str) -> str:
    symbol_set = sorted([i for i in  formula.atoms() if isinstance(i, Symbol)], key=lambda x: x.__repr__())
    variables_str = "double " + ", double ".join(s.__repr__() for s in symbol_set)
    return f"""\
public static double {name}({variables_str}) {{
    return {java_code(formula)};
}};
"""

def add_code_helper(s: str, arg1: Basic):
    if arg1.func == Mul and arg1.args[0] == -1:
        return f"{s} - ({java_code(Mul(*arg1.args[1:]))})"
    else:
        return f"{s} + {java_code(arg1)}"

def mul_code_helper(s: str, arg1: Basic):
    if arg1.func == Pow and arg1.args[0] == -1:
        return f"{s} / ({java_code(arg1.args[1])})"
    else:
        return f"{s} * {java_code(arg1)}"

def java_code(formula: Basic) -> str:
    if isinstance(formula, Add):
        args = formula.args
        return reduce(add_code_helper, args[1:], java_code(args[0]))
        # return reduce(lambda s, arg1: f"{s} + {java_code(arg1)}", args[1:], java_code(args[0]))
    elif isinstance(formula, Mul):
        args = formula.args
        # return reduce(lambda s, arg1: f"{s} * {java_code(arg1)}", args[1:], java_code(args[0]))
        return reduce(mul_code_helper, args[1:], java_code(args[0]))
    elif isinstance(formula, Pow):
        args = formula.args
        return f"Math.pow({java_code(args[0])}, {java_code(args[1])})"
    elif formula.func == floor:
        args = formula.args
        return f"Math.floor({java_code(args[0])})"
    elif formula.func == ceiling:
        args = formula.args
        return f"Math.ceiling({java_code(args[0])})"
    elif formula.func == Max:
        args = formula.args
        return reduce(lambda s, arg1: "Math.max(" + s + f", {java_code(arg1)})", args[1:], java_code(args[0]))
    elif formula.func == Min:
        args = formula.args
        return reduce(lambda s, arg1: "Math.min(" + s + f", {java_code(arg1)})", args[1:], java_code(args[0]))
    elif isinstance(formula, Integer) or isinstance(formula, Float) or isinstance(formula, Rational):
        return f"{formula.evalf()}"
    elif isinstance(formula, Symbol):
        return f"{formula.__repr__()}"
