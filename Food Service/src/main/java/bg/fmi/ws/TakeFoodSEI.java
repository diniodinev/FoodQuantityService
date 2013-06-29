package main.java.bg.fmi.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "TakeFoodSEI", targetNamespace = "http://ws.fmi.bg.java.main/")
public interface TakeFoodSEI {

	public String takeFood(@WebParam(name = "arg0") String foodName);

}