package br.si.design.factorymethod.application;

import java.util.Scanner;

import br.si.design.factorymethod.entities.Car;
import br.si.design.factorymethod.entities.CarFactory;

public class Principal {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			
			
			System.out.println("Digite o carro que deseja adiquirir: ");
			System.out.println("1. Corolla");
			System.out.println("2. Civic");
			System.out.println("3. Golf");
			int escolha = sc.nextInt();

			System.out.println();
			System.out.println("Modelo escolhido:");

			
			CarFactory cf = new CarFactory();
			Car carroNovo = new CarFactory().criarCarro(escolha);
			System.out.println(carroNovo.getModelo() + " " + carroNovo.getAno());


		}

	}
}
