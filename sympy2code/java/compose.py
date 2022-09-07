from functools import reduce

from sympy import Add, Mul, Integer, Float, Symbol, Basic, Pow, floor, ceiling, Max, Min

def java_code_method(formula: Basic, name: str) -> str:
    symbol_set = {i for i in  formula.atoms() if isinstance(i, Symbol)}
    variables_str = "Double " + ", Double ".join(s.__repr__() for s in symbol_set)
    return f"""\
public static Double {name}({variables_str}) {{
    return {java_code(formula)};
}};
"""


def java_code(formula: Basic) -> str:
    if isinstance(formula, Add):
        args = formula.args
        return f"{java_code(args[0])} + {java_code(args[1])}"
    elif isinstance(formula, Mul):
        args = formula.args
        return f"{java_code(args[0])} * {java_code(args[1])}"
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
    elif isinstance(formula, Integer) or isinstance(formula, Float):
        return f"{formula.evalf()}"
    elif isinstance(formula, Symbol):
        return f"{formula.__repr__()}"
