package sympy;

public class SympyCode {
public static double add1(double a) {
	    return 1.00000000000000 + a;
	};
	
		public static double minus1(double a) {
	    return -2.00000000000000 + a;
	};
	
		public static double mul1(double a) {
	    return 3.00000000000000 * a;
	};
	
		public static double div1(double a) {
	    return 0.250000000000000 * a;
	};
	
		public static double floor1(double a) {
	    return Math.floor(0.200000000000000 * a);
	};
	
		public static double complexFormula1(double a, double b) {
	    return Math.min(Math.min(12.0000000000000, Math.pow(a, 2.00000000000000)), 7.00000000000000 + Math.pow(a, 2.00000000000000) + Math.pow(b, 3.00000000000000) + 0.333333333333333 * b);
	};
	
		public static double hItemFromBigBoxMCrit(double m, double pl) {
	    return 10.0000000000000 * Math.floor(0.0769230769230769 * Math.max(500.000000000000, 10080.0000000000 + 0.000480000000000000 * pl + -9599.70000000000 * Math.pow(0.995000000000000, -1.00000000000000 + pl - (m)) + -0.000480000000000000 * m));
	};
	
}