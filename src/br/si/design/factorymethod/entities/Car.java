package br.si.design.factorymethod.entities;

public abstract class Car {

	private String marca;
	private String modelo;
	private String cor;
	private String motor;
	private String ano;

	public Car() {
	}
	
	public Car(String marca, String modelo, String cor, String motor, String ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.motor = motor;
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Car [marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", motor=" + motor + ", ano=" + ano
				+ "]";
	}
	
}
