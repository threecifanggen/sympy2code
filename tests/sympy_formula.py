from sympy import *

a = Symbol("a")
b = Symbol("b")
pve_level = Symbol("pl", integer=True)
m = Symbol("m", integer=True)

add_1 = a + 1
minus_1 = a - 2
mul_1 = a * 3
div_1 = a / 4
floor_1 = a // 5


complex_formula_1 = Min(b ** 3 + a ** 2 + b / 3 + 7, 12, a ** 2)
h_item_from_big_box_m_crit = 10 * floor(0.0769230769230769*Max(500, -9599.7*0.995**(-m + pve_level - 1) - 0.00048*m + 0.00048*pve_level + 10080.0))