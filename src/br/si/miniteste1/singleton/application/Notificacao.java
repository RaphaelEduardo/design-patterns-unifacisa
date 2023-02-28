package br.si.miniteste1.singleton.application;

public class Notificacao {

	private static String titulo = "miniteste1";
	private static String detalhe = "miniteste1";
	private static String origem = "unifacisa";
	private static String destino = "unifacisa";
	private static Notificacao instance;

	private Notificacao(String titulo,String detalhe,String origem,String destino) {
	}

	public static Notificacao getInstance() {
		if (instance == null) {
			instance = new Notificacao(titulo, detalhe, origem, destino);
			return instance;
		} 
		else {
			return instance;
		}
	}

}
