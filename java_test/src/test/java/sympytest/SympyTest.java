package sympytest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import sympy.SympyCode;
class SympyJUnit5Test {
	@Test
	public void add1Test() {
		assertEquals(SympyCode.add1(-60438), -60437.0);
		assertEquals(SympyCode.add1(-42835), -42834.0);
		assertEquals(SympyCode.add1(-71372), -71371.0);
		assertEquals(SympyCode.add1(90711), 90712.0);
		assertEquals(SympyCode.add1(70955), 70956.0);
		assertEquals(SympyCode.add1(-49853), -49852.0);
		assertEquals(SympyCode.add1(-46406), -46405.0);
		assertEquals(SympyCode.add1(-93984), -93983.0);
		assertEquals(SympyCode.add1(-45955), -45954.0);
		assertEquals(SympyCode.add1(74564), 74565.0);
	};

	@Test
	public void minus1Test() {
		assertEquals(SympyCode.minus1(-82670), -82672.0);
		assertEquals(SympyCode.minus1(-61402), -61404.0);
		assertEquals(SympyCode.minus1(-658), -660.0);
		assertEquals(SympyCode.minus1(-1507), -1509.0);
		assertEquals(SympyCode.minus1(25952), 25950.0);
		assertEquals(SympyCode.minus1(72772), 72770.0);
		assertEquals(SympyCode.minus1(-24868), -24870.0);
		assertEquals(SympyCode.minus1(-59567), -59569.0);
		assertEquals(SympyCode.minus1(-37160), -37162.0);
		assertEquals(SympyCode.minus1(39392), 39390.0);
	};

	@Test
	public void mul1Test() {
		assertEquals(SympyCode.mul1(-43982), -131946.0);
		assertEquals(SympyCode.mul1(68036), 204108.0);
		assertEquals(SympyCode.mul1(-69954), -209862.0);
		assertEquals(SympyCode.mul1(27009), 81027.0);
		assertEquals(SympyCode.mul1(-11507), -34521.0);
		assertEquals(SympyCode.mul1(-18081), -54243.0);
		assertEquals(SympyCode.mul1(8761), 26283.0);
		assertEquals(SympyCode.mul1(-77490), -232470.0);
		assertEquals(SympyCode.mul1(11588), 34764.0);
		assertEquals(SympyCode.mul1(-85092), -255276.0);
	};

	@Test
	public void div1Test() {
		assertEquals(SympyCode.div1(-86811), -21702.75);
		assertEquals(SympyCode.div1(59846), 14961.5);
		assertEquals(SympyCode.div1(-93228), -23307.0);
		assertEquals(SympyCode.div1(57999), 14499.75);
		assertEquals(SympyCode.div1(-63854), -15963.5);
		assertEquals(SympyCode.div1(77420), 19355.0);
		assertEquals(SympyCode.div1(17437), 4359.25);
		assertEquals(SympyCode.div1(-18297), -4574.25);
		assertEquals(SympyCode.div1(-89784), -22446.0);
		assertEquals(SympyCode.div1(-2610), -652.5);
	};

	@Test
	public void floor1Test() {
		assertEquals(SympyCode.floor1(-75147), -15030.0);
		assertEquals(SympyCode.floor1(-16641), -3329.0);
		assertEquals(SympyCode.floor1(4311), 862.0);
		assertEquals(SympyCode.floor1(37188), 7437.0);
		assertEquals(SympyCode.floor1(-91416), -18284.0);
		assertEquals(SympyCode.floor1(64429), 12885.0);
		assertEquals(SympyCode.floor1(-42612), -8523.0);
		assertEquals(SympyCode.floor1(-26066), -5214.0);
		assertEquals(SympyCode.floor1(47210), 9442.0);
		assertEquals(SympyCode.floor1(-49341), -9869.0);
	};

	@Test
	public void complexFormula1Test() {
		assertEquals(SympyCode.complexFormula1(-24233, -13755), -2601859110164.0);
		assertEquals(SympyCode.complexFormula1(-55471, 61998), 12.0);
		assertEquals(SympyCode.complexFormula1(26366, 59930), 12.0);
		assertEquals(SympyCode.complexFormula1(-72679, -97050), -914079795420302.0);
		assertEquals(SympyCode.complexFormula1(38995, 76803), 12.0);
		assertEquals(SympyCode.complexFormula1(-19473, -12749), -2071805032262.6667);
		assertEquals(SympyCode.complexFormula1(-22056, 41688), 12.0);
		assertEquals(SympyCode.complexFormula1(2174, -52852), -147633278785542.34);
		assertEquals(SympyCode.complexFormula1(37014, -32573), -34558593691171.668);
		assertEquals(SympyCode.complexFormula1(17357, -66921), -299700059704812.0);
	};

	@Test
	public void hItemFromBigBoxMCritTest() {
		assertEquals(SympyCode.hItemFromBigBoxMCrit(72458, -92003), 380.0);
		assertEquals(SympyCode.hItemFromBigBoxMCrit(-90904, -66330), 7760.0);
		assertEquals(SympyCode.hItemFromBigBoxMCrit(-91914, -44401), 7770.0);
		assertEquals(SympyCode.hItemFromBigBoxMCrit(9576, 30271), 7760.0);
		assertEquals(SympyCode.hItemFromBigBoxMCrit(-31802, -45027), 380.0);
		assertEquals(SympyCode.hItemFromBigBoxMCrit(25779, -22841), 380.0);
		assertEquals(SympyCode.hItemFromBigBoxMCrit(-65220, -89600), 380.0);
		assertEquals(SympyCode.hItemFromBigBoxMCrit(-94076, -93416), 7480.0);
		assertEquals(SympyCode.hItemFromBigBoxMCrit(46782, 98009), 7770.0);
		assertEquals(SympyCode.hItemFromBigBoxMCrit(56023, 15612), 380.0);
	};


};
