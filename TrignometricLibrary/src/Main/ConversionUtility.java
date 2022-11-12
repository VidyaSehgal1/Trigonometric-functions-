package Main;
public class  ConversionUtility {

	private static double PII = 3.141592653;
	
	
	public static double degreesToRadian(double radianVal) {
		return (radianVal*PII)/180;
	}
	
	public static double calculatePowerOfNumber(double number,double exponent) {
		double  calulatedValue = 1;
		if(exponent == 0) {
			return 1;
		}
		for (int i = 1; i <= exponent; i++) {
			calulatedValue =calulatedValue*number;
			
		}
		
		return calulatedValue;
	}
	
	public static int factorial(int number) throws FactorialException{    
	    	if(number<0) {
			throw new FactorialException("Can not caculate Factorial for Negative Numbers");
		   }
		  if (number == 0)    
		    return 1;    
		  else    
		    return(number * factorial(number-1));    
		 }    
	 
	public static double convertValueInTheRange(double value) {
			//since the function is in 2 pi
		 return value % (PII*2);
		 
	 }

	 public static double radianToDegree(double value) {
		return (value * 180)/PII;
	}
}
