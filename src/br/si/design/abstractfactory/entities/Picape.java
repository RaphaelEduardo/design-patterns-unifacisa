package br.si.design.abstractfactory.entities;

public abstract class Picape {
	
	private String nome;
	private String cor;
	private Integer ano;
	private Double motor;
	private Double capacidade;

	public Picape(String nome, String cor, Integer ano, Double motor, Double capacidade) {
		this.setNome(nome);
		this.cor = cor;
		this.ano = ano;
		this.motor = motor;
		this.capacidade = capacidade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Double getMotor() {
		return motor;
	}

	public void setMotor(Double motor) {
		this.motor = motor;
	}

	public Double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Double capacidade) {
		this.capacidade = capacidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
