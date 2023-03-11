package br.si.design.factorymethod.entities;

public class CarFactory {
	
	public Car criarCarro(int escolha) {
	
		Car c = null;
		
		if (escolha == 1) {
			c = new Corolla("Toyota", "Corolla", "Branco", "2.0", "2022");
			return c;
		} else if (escolha == 2) {
			c = new Civic("Honda", "Civic", "Preto", "1.8", "2018");
			return c;
		} else if (escolha == 3) {
			c = new Golf("Volkswagen", "Golf", "Vermelho", "1.4", "2015");
			return c;
		} else {
			System.out.println("Alternativa inexistente!");
			return null;
		}
	}
	
}
