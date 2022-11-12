package Main;
public class TrignometricFunctions {
	
	private static int  PRECISION = 11;
	
	public static double  calculateSineX(double degree) {
		
		//this is done to ensure that function is in the range from 0 to 2pi
		degree =ConversionUtility.convertValueInTheRange(degree);
		
		//double radianValue = ConversionUtility.degreesToRadian(degree);
		
		double sineValue =0;
		//since sine is defined as below
		//x-(x3/3!)+(x5/5!)+..... 
		for (int i = 1; i <= PRECISION; i++) {
			try {
				sineValue = sineValue + (ConversionUtility.calculatePowerOfNumber(-1, i-1)*
						ConversionUtility.calculatePowerOfNumber(degree, (2*i)-1)/ ConversionUtility.factorial((2*i)-1));
			} catch (FactorialException e) {
				e.printStackTrace();
			}
		}
		
		
		return sineValue;
	}

	public static double calculateCosX(double degree) {
		
		//this is done to ensure that function is in the range from 0 to 2pi
		degree =ConversionUtility.convertValueInTheRange(degree);
		
		//double radianValue = ConversionUtility.degreesToRadian(degree);
		
		double cosValue =0;
		for (int i = 1; i <= PRECISION; i++) {
			
			try {
				cosValue = cosValue + (ConversionUtility.calculatePowerOfNumber(-1, i-1)*
						ConversionUtility.calculatePowerOfNumber(degree, 2*(i-1))/ConversionUtility.factorial(2*(i-1)));
			} catch (FactorialException e) {
				e.printStackTrace();
			}
		}
		
		return cosValue;
	}
	
	public static double calculateTanX(double degree) {
		return calculateSineX(degree)/calculateCosX(degree);
	}
	
	public static double calculateSinValueForDegree(double degreeVal) {
		
		double result= calculateSineX(ConversionUtility.degreesToRadian(degreeVal));
		return ConversionUtility.radianToDegree(result);
	}
	
	public static double calculateCosValueForDegree(double degreeVal) {
		
		double result= calculateCosX(ConversionUtility.degreesToRadian(degreeVal));
		return ConversionUtility.radianToDegree(result);
	}
	
	public static double calculateTanValueForDegree(double degreeVal) {
		
	return calculateSinValueForDegree(degreeVal)/calculateCosValueForDegree(degreeVal);
	}
}
