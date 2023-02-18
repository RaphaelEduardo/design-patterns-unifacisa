package br.si.design.singleton;

public class Main {

	public static void main(String[] args) {
		
		VisaConnection vc3 = VisaConnection.getInstance();
		VisaConnection vc4 = VisaConnection.getInstance();
		
		System.out.println(vc3);
		System.out.println(vc4);

	}

}
