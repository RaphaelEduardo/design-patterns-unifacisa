package br.si.design.abstractfactory.entities.volkswagen;

import br.si.design.abstractfactory.entities.AbstractFactory;
import br.si.design.abstractfactory.entities.Picape;
import br.si.design.abstractfactory.entities.Suv;

public class VolkswagenAbstractFactory extends AbstractFactory {

	@Override
	public Suv fabricarCarroSuv() {		
		Nivus nivus = new Nivus("Nivus" ,"Cinza Moonstone", 2023, 1.0, "4x2");
		return nivus;
	}

	@Override
	public Picape fabricarCarroPicape() {
		Saveiro saveiro = new Saveiro("Saveiro" ,"Azul Night", 2023, 1.6, 715.0);
		return saveiro;
	}

}
