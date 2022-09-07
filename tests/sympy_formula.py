from sympy import *

a = Symbol("a")
b = Symbol("b")

add_1 = a + 1
minus_2 = a - 2
mul_3 = a * 3
div_4 = a / 4
floor_5 = a // 5


complex_formula = Min(*a ** (b - 1) + a ** 2 + b / 3 + 7, 12, a ** 2)