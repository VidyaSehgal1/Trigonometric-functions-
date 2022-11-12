package Test;

import org.junit.Assert;
import org.junit.Test;

import Main.ConversionUtility;
import Main.FactorialException;
import Main.TrignometricFunctions;

public class TrignometricFunctionsTest {

	
	@Test
	public void test_Cos_Function_Value_1() {
		Assert.assertEquals(Math.cos(1),TrignometricFunctions.calculateCosX(1),0.01);
	}
	
	@Test
	public void test_Cos_Function_Value_Negative() {
		Assert.assertEquals(Math.cos(-1),TrignometricFunctions.calculateCosX(-1),0.01);
	}
	
	@Test
	public void test_sin_Function_Value_1() {
		Assert.assertEquals(Math.sin(1),TrignometricFunctions.calculateSineX(1),0.01);
	}
	
	@Test
	public void test_sin_Function_Value_Negative() {
		Assert.assertEquals(Math.sin(-1),TrignometricFunctions.calculateSineX(-1),0.01);
	}
	
	@Test
	public void test_sin_Function_Value_Infinity() {
		Assert.assertEquals(Math.sin(Double.POSITIVE_INFINITY),TrignometricFunctions.calculateSineX(Double.POSITIVE_INFINITY),0.01);
	}
	
	@Test
	public void test_sin_Function_Value_Negative_Infinity() {
		Assert.assertEquals(Math.sin(Double.NEGATIVE_INFINITY),TrignometricFunctions.calculateSineX(Double.NEGATIVE_INFINITY),0.01);
	}
	
	@Test
	public void test_tan_Function_Value_1() {
		Assert.assertEquals(Math.tan(1),TrignometricFunctions.calculateTanX(1),0.01);
	}
	
	@Test
	public void test_sin_Function_Value_90_degree() {
		Assert.assertEquals(Math.toDegrees(Math.sin(Math.toRadians(90))),TrignometricFunctions.calculateSinValueForDegree(90),0.01);
	}
	
	@Test
	public void test_cos_Function_Value_90_degree() {
		Assert.assertEquals(Math.toDegrees(Math.cos(Math.toRadians(90))),TrignometricFunctions.calculateCosValueForDegree(90),0.01);
	}
	
	@Test
	public void test_caclulatePowerOfNumber_Negative() {
		Assert.assertEquals(-8,ConversionUtility.calculatePowerOfNumber(-2, 3),0);
	}
	
	@Test
	public void test_caclulatePowerOfNumber_Positive() {
		Assert.assertEquals(8,ConversionUtility.calculatePowerOfNumber(2, 3),0);
	}
	
	@Test
	public void test_caclulatePowerOfNumber_Infinite() {
		Assert.assertEquals(Double.POSITIVE_INFINITY,ConversionUtility.calculatePowerOfNumber(Double.POSITIVE_INFINITY, 3),0);
	}
	
	@Test
	public void test_radianTodegreeConversion() {
		Assert.assertEquals(Math.toDegrees(5),ConversionUtility.radianToDegree(5),0.01);
	}
	
	@Test
	public void test_degreeToRadianConversion() {
		Assert.assertEquals(Math.toRadians(90),ConversionUtility.degreesToRadian(90),0.01);
	}
	
	@Test(expected = FactorialException.class)
	public void test_FactorialCalulcation_Negative() throws FactorialException {
		Assert.assertEquals(6,ConversionUtility.factorial(-3),0.01);
	}

}