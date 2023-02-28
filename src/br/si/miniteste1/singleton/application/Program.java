package br.si.miniteste1.singleton.application;

public class Program {

	public static void main(String[] args) {
		
		Notificacao notificacao1 = Notificacao.getInstance();
		System.out.println(notificacao1);
		
		Notificacao notificacao2 = Notificacao.getInstance();
		System.out.println(notificacao2);
		
		Notificacao notificacao3 = Notificacao.getInstance();
		System.out.println(notificacao3);
		
		Notificacao notificacao4 = Notificacao.getInstance();
		System.out.println(notificacao4);
	}

}
