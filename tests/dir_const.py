import os

def get_root_dir():
    return os.path.join(os.path.dirname(__file__), "..")

java_module_dir = os.path.join(
    get_root_dir(),
    "java_test",
    "src",
    "main",
    "java",
    "sympy"
)

java_test_dir = os.path.join(
    get_root_dir(),
    "java_test",
    "src",
    "test",
    "java",
    "sympytest"
)