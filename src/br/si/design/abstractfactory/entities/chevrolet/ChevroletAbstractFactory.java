package br.si.design.abstractfactory.entities.chevrolet;

import br.si.design.abstractfactory.entities.AbstractFactory;
import br.si.design.abstractfactory.entities.Picape;
import br.si.design.abstractfactory.entities.Suv;

public class ChevroletAbstractFactory extends AbstractFactory {

	@Override
	public Suv fabricarCarroSuv() {
		Tracker tracker = new Tracker("Tracker" ,"Branco Summit.", 2023, 1.0, "4x2");
		return tracker;
	}

	@Override
	public Picape fabricarCarroPicape() {
		Montana montana = new Montana("Montana" ,"Verde Safari", 2023, 1.2, 650.0);
		return montana;
	}

}
