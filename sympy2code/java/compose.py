from functools import reduce

from sympy import Add, Mul, Integer, Float, Symbol, Basic, Pow, floor, ceiling, Max, Min, Rational

def java_code_method(formula: Basic, name: str) -> str:
    symbol_set = sorted([i for i in  formula.atoms() if isinstance(i, Symbol)], key=lambda x: x.__repr__())
    variables_str = "double " + ", double ".join(s.__repr__() for s in symbol_set)
    return f"""\
public static double {name}({variables_str}) {{
    return {java_code(formula)};
}};
"""


def java_code(formula: Basic) -> str:
    if isinstance(formula, Add):
        args = formula.args
        return reduce(lambda s, arg1: f"{s} + {java_code(arg1)}", args[1:], java_code(args[0]))
    elif isinstance(formula, Mul):
        args = formula.args
        return reduce(lambda s, arg1: f"{s} * {java_code(arg1)}", args[1:], java_code(args[0]))
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
