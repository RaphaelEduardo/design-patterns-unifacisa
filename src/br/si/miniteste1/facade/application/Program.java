package br.si.miniteste1.facade.application;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha por onde quer enviar a mensagem: ");
		System.out.println("1. Whatsappp [1]");
		System.out.println("2. Telegram [2]");
		System.out.println("3. SMS [3]");
		System.out.print("Escolha: ");
		int escolha = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Digite a mensagem: ");
		String mensagem = sc.nextLine();
		
		MensagemFacade.Mensagem(escolha, mensagem);
		
		sc.close();
	}

}
