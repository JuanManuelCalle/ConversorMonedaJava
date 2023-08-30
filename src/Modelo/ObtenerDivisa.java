package Modelo;

public class ObtenerDivisa {
	public static String ObtenerModena(String divisa) {
	    switch (divisa) {
        case "Dólares (USD)":
            return "USD";
        case "Euros (EUR)":
            return "EUR";
        case "Yenes Japoneses (JPY)":
            return "JPY";
        case "Libras Esterlinas (GBP)":
            return "GBP";
        case "Peso Colombiano (COP)":
            return "COP";
        default:
            return "";
    }
	}
}
