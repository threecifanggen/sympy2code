package sympytest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import sympy.SympyCode;
class SympyJUnit5Test {
	@Test
	public void add1Test() {
		assertEquals(SympyCode.add1(-24483), -24482.0);
		assertEquals(SympyCode.add1(-68582), -68581.0);
		assertEquals(SympyCode.add1(89173), 89174.0);
		assertEquals(SympyCode.add1(80339), 80340.0);
		assertEquals(SympyCode.add1(-3317), -3316.0);
		assertEquals(SympyCode.add1(-18155), -18154.0);
		assertEquals(SympyCode.add1(-87742), -87741.0);
		assertEquals(SympyCode.add1(4215), 4216.0);
		assertEquals(SympyCode.add1(92133), 92134.0);
		assertEquals(SympyCode.add1(-59675), -59674.0);
};

	@Test
	public void minus1Test() {
		assertEquals(SympyCode.minus1(40209), 40207.0);
		assertEquals(SympyCode.minus1(-95830), -95832.0);
		assertEquals(SympyCode.minus1(30438), 30436.0);
		assertEquals(SympyCode.minus1(36527), 36525.0);
		assertEquals(SympyCode.minus1(1013), 1011.0);
		assertEquals(SympyCode.minus1(39719), 39717.0);
		assertEquals(SympyCode.minus1(24759), 24757.0);
		assertEquals(SympyCode.minus1(-36308), -36310.0);
		assertEquals(SympyCode.minus1(-10622), -10624.0);
		assertEquals(SympyCode.minus1(87936), 87934.0);
};

	@Test
	public void mul1Test() {
		assertEquals(SympyCode.mul1(63821), 191463.0);
		assertEquals(SympyCode.mul1(-13050), -39150.0);
		assertEquals(SympyCode.mul1(23925), 71775.0);
		assertEquals(SympyCode.mul1(14732), 44196.0);
		assertEquals(SympyCode.mul1(-36061), -108183.0);
		assertEquals(SympyCode.mul1(-17149), -51447.0);
		assertEquals(SympyCode.mul1(-55198), -165594.0);
		assertEquals(SympyCode.mul1(-62198), -186594.0);
		assertEquals(SympyCode.mul1(-14298), -42894.0);
		assertEquals(SympyCode.mul1(-494), -1482.0);
};

	@Test
	public void div1Test() {
		assertEquals(SympyCode.div1(87656), 21914.0);
		assertEquals(SympyCode.div1(85097), 21274.25);
		assertEquals(SympyCode.div1(-2867), -716.75);
		assertEquals(SympyCode.div1(-69105), -17276.25);
		assertEquals(SympyCode.div1(-22057), -5514.25);
		assertEquals(SympyCode.div1(-94149), -23537.25);
		assertEquals(SympyCode.div1(-44032), -11008.0);
		assertEquals(SympyCode.div1(83090), 20772.5);
		assertEquals(SympyCode.div1(91130), 22782.5);
		assertEquals(SympyCode.div1(-72917), -18229.25);
};

	@Test
	public void floor1Test() {
		assertEquals(SympyCode.floor1(-30010), -6002.0);
		assertEquals(SympyCode.floor1(-79898), -15980.0);
		assertEquals(SympyCode.floor1(58385), 11677.0);
		assertEquals(SympyCode.floor1(-19965), -3993.0);
		assertEquals(SympyCode.floor1(20224), 4044.0);
		assertEquals(SympyCode.floor1(-39702), -7941.0);
		assertEquals(SympyCode.floor1(63823), 12764.0);
		assertEquals(SympyCode.floor1(-91828), -18366.0);
		assertEquals(SympyCode.floor1(33837), 6767.0);
		assertEquals(SympyCode.floor1(-73859), -14772.0);
};

	@Test
	public void complexFormula1Test() {
		assertEquals(SympyCode.complexFormula1(-55197, -86107), -638430024386929.4);
		assertEquals(SympyCode.complexFormula1(52491, -93249), -810832361443244.0);
		assertEquals(SympyCode.complexFormula1(-23544, 92450), 12.0);
		assertEquals(SympyCode.complexFormula1(48061, 55747), 12.0);
		assertEquals(SympyCode.complexFormula1(44173, 49154), 12.0);
		assertEquals(SympyCode.complexFormula1(26962, -93665), -821734702936395.6);
		assertEquals(SympyCode.complexFormula1(-33148, 97673), 12.0);
		assertEquals(SympyCode.complexFormula1(-43641, 60695), 12.0);
		assertEquals(SympyCode.complexFormula1(-99364, -97607), -929904358135575.6);
		assertEquals(SympyCode.complexFormula1(-32324, 35966), 12.0);
};

	@Test
	public void hItemFromBigBoxMCritTest() {
		assertEquals(SympyCode.hItemFromBigBoxMCrit(-9633, 75373), 7780.0);
		assertEquals(SympyCode.hItemFromBigBoxMCrit(56461, 79143), 7760.0);
		assertEquals(SympyCode.hItemFromBigBoxMCrit(-83913, -58298), 7760.0);
		assertEquals(SympyCode.hItemFromBigBoxMCrit(90524, -6424), 380.0);
		assertEquals(SympyCode.hItemFromBigBoxMCrit(-64925, -8395), 7770.0);
		assertEquals(SympyCode.hItemFromBigBoxMCrit(-79339, 58558), 7800.0);
		assertEquals(SympyCode.hItemFromBigBoxMCrit(43908, 57390), 7750.0);
		assertEquals(SympyCode.hItemFromBigBoxMCrit(-98482, 15989), 7790.0);
		assertEquals(SympyCode.hItemFromBigBoxMCrit(-28322, -21416), 7750.0);
		assertEquals(SympyCode.hItemFromBigBoxMCrit(-90673, 52915), 7800.0);
};


};
