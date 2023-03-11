package br.si.design.abstractfactory.entities;

public abstract class Suv {

	private String nome;
	private String cor;
	private Integer ano;
	private Double motor;
	private String tracao;

	public Suv(String nome, String cor, Integer ano, Double motor, String tracao) {
		this.nome = nome;
		this.cor = cor;
		this.ano = ano;
		this.motor = motor;
		this.tracao = tracao;
		
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

	public String getTracao() {
		return tracao;
	}

	public void setTracao(String tracao) {
		this.tracao = tracao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
