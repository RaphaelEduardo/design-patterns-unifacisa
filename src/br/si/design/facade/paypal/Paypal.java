package br.si.design.facade.paypal;

//tudo isso aqui eh codigo do paypal
//isso aqui eh como se fosse uma biblioteca do paypal
public class Paypal {

	public void processCreditCard(long cardNumber, String user, double value) {
		System.out.println(value + " approved. ");
	}

	public void processDebit(long numero, String usuario, double valor) {
		System.out.println(valor + " approved!");
	}

	public void processPix(String chave, double valor) {
		System.out.println(valor + " approved!");
	}
}
