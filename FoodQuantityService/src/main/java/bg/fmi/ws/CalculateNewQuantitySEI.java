package main.java.bg.fmi.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "CalculateNewQuantitySEI", targetNamespace = "http://ws.fmi.bg.java.main/")
public interface CalculateNewQuantitySEI {

	public String calculateQuantity(@WebParam(name = "arg0") double oldQuantity, @WebParam(name = "arg1") double newQuantity,
			@WebParam(name = "arg2") double protein, @WebParam(name = "arg3") double carbs, @WebParam(name = "arg4") double fats, @WebParam(name = "arg5") double energy);

}