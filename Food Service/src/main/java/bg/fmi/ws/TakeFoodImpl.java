package main.java.bg.fmi.ws;

import javax.jws.WebService;


@WebService(targetNamespace = "http://ws.fmi.bg.java.main/", endpointInterface = "main.java.bg.fmi.ws.TakeFoodSEI", portName = "TakeFoodImplPort", serviceName = "TakeFoodImplService")
public class TakeFoodImpl implements TakeFoodSEI {
	MySQLAccess mySQLAccess ;
	
	public TakeFoodImpl(){
		mySQLAccess = new MySQLAccess();
	}

	public String takeFood(String foodName) {
		return mySQLAccess.readDataBase(foodName);
	}
	
}
