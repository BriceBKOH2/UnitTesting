package fr.dta.testunit;

import static org.junit.Assert.assertEquals;

import org.junit.*;

// local
import fr.dta.testunit.exception.NegativeNumberException;

public class CalcTest {

	private static Calc calcTest;
	
	@BeforeClass
	public static void init() {
		calcTest = new Calc();
	}
	
	// Null
	
	@Test
	public void testParameterFirstParamNull() {		
		Assert.assertEquals(new Long(0L), calcTest.substract(null, 0L));
	}
	
	@Test
	public void testParameterSecondParamNull() {		
		Assert.assertEquals(new Long(10L), calcTest.substract(10L, null));
	}
	
	@Test
	public void testParameterAllParamNull() {		
		Assert.assertEquals(new Long(0L), calcTest.substract(null, null));
	}
	
	// Negative
	@Test (expected = NegativeNumberException.class)
	public void testParamaterFirstParamNegative() {
		calcTest.substract(-2L, 0L);
	}
	
	@Test (expected = NegativeNumberException.class)
	public void testParamaterSecondParamNegative() {
		calcTest.substract(20L, -5L);
	}
	
	@Test (expected = NegativeNumberException.class)
	public void testParameterBothParamNegative() {
		calcTest.substract(-20L, -25L);
	}
	
	@Test (expected = NegativeNumberException.class)
	public void testResultNegative () {
		calcTest.substract(1L, 5L);
	}
	
	// Other
	
	@Test
	public void testSubstract_LimitOk() {
		assertEquals(new Long(0L), calcTest.substract(12898L, 12898L));
	}

}
