package Modelo;

public class Conversor {
	
    private static final double USD_TO_EUR = 0.92;
    private static final double USD_TO_JPY = 146.24;
    private static final double USD_TO_GBP = 0.79;
    private static final double USD_TO_COP = 4.095;
    
	public static double DivisaConvert(double monto, String Select) {
	    switch (Select) {
        case "Dólares (USD)":
            return monto;
        case "Euros (EUR)":
            return monto * USD_TO_EUR;
        case "Yenes Japoneses (JPY)":
            return monto * USD_TO_JPY;
        case "Libras Esterlinas (GBP)":
            return monto * USD_TO_GBP;
        case "Peso Colombiano (COP)":
            return monto * USD_TO_COP;
        default:
            return 0.0;
    }
	}
}
