package br.si.design.abstractfactory.application;

import java.util.Scanner;

import br.si.design.abstractfactory.entities.AbstractFactory;
import br.si.design.abstractfactory.entities.Picape;
import br.si.design.abstractfactory.entities.Suv;
import br.si.design.abstractfactory.entities.chevrolet.ChevroletAbstractFactory;
import br.si.design.abstractfactory.entities.volkswagen.VolkswagenAbstractFactory;

public class Program {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int montadora, categoria;

			System.out.println("Marca do Veiculo:");
			System.out.println("1. Chevrolet");
			System.out.println("2. Volkswagen");
			montadora = sc.nextInt();

			if (montadora == 1) {
				AbstractFactory af = new ChevroletAbstractFactory();

				System.out.println("Categoria do veiculo:");
				System.out.println("1. SUV");
				System.out.println("2. Picape");
				categoria = sc.nextInt();
				System.out.println();
				System.out.print("Fabricado: ");

				if (categoria == 1) {
					Suv suv = af.fabricarCarroSuv();
					System.out.println(suv.getNome() + ", cor " + suv.getCor());

				} else if (categoria == 2) {
					Picape picape = af.fabricarCarroPicape();
					System.out.println(picape.getNome() + ", cor " + picape.getCor());

				} else {
					System.out.println("Categoria inexistente!");
				}

			} else if (montadora == 2) {
				AbstractFactory af = new VolkswagenAbstractFactory();

				System.out.println("Categoria do veiculo:");
				System.out.println("1. SUV");
				System.out.println("2. Picape");
				categoria = sc.nextInt();
				System.out.println();
				System.out.print("Fabricado: ");

				if (categoria == 1) {
					Suv suv = af.fabricarCarroSuv();
					System.out.println(suv.getNome() + ", cor " + suv.getCor());

				} else if (categoria == 2) {
					Picape picape = af.fabricarCarroPicape();
					System.out.println(picape.getNome() + ", cor " + picape.getCor());

				} else {
					System.out.println("Categoria inexistente!");
				}

			} else {
				System.out.println("Montadora inexistente!");
			}
		}

	}

}
