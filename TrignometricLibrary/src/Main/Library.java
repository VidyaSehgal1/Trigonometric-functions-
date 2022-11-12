package Main;

public class Library {

	public static void main(String[] args) throws FactorialException {
		TrignometricFunctions functions = new TrignometricFunctions();
		double degree = 90;
		double sineValue  =functions.calculateSineX(degree);
		double cosValue  =functions.calculateCosX(degree);
		double tanValue  =functions.calculateTanX(degree);
	}

}
