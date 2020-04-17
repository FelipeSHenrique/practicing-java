package util;

public class CurrencyConverter {

	public static final double IOF = 6.0;
	
	public static double convertDollar(double dollarQuotation, double valueDollar) {
		
		double convertedValue = dollarQuotation * valueDollar;
		return convertedValue + convertedValue * IOF /100;
		
	}
	
}
