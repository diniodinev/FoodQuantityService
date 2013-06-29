package main.java.bg.fmi.ws;

import javax.jws.WebService;

@WebService(targetNamespace = "http://ws.fmi.bg.java.main/", endpointInterface = "main.java.bg.fmi.ws.CalculateNewQuantitySEI", portName = "CalculateQuantityPort", serviceName = "CalculateQuantityService")
public class CalculateNewQuantity implements CalculateNewQuantitySEI {

	public String calculateQuantity(double oldQuantity, double newQuantity,
			double protein, double carbs, double fats, double energy) {
		if (oldQuantity <= 0) {
			return new String();
		}
		double factor = newQuantity / oldQuantity;

		StringBuilder result = new StringBuilder();
		char separator=';';
		result.append(newQuantity).append(separator);
		result.append(protein * factor).append(separator);
		result.append(carbs * factor).append(separator);
		result.append(fats * factor).append(separator);
		result.append(energy * factor);
		return result.toString();
	}
}
