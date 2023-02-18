package br.si.design.singleton;

public class VisaConnection {

	private static VisaConnection instance = new VisaConnection();
	// VisaConnection instance = null;
	
	private VisaConnection() {
	}
	
	public static VisaConnection getInstance() {
		/*
		 * if (instance == null) { 
		 * 		instance = new VisaConnection();
		 * } 
		 */
		return instance;
	}
	
	
	
}
