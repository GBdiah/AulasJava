package br.unipe.java.unidade1;
//ctrl + m expande
public class Carro {// classe
	// Source -> generate -> getters and setters -> all -> finish
	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	// variaveis
	private String motor;
	private String cor;
	private float potencia; 
	private int rodas;
	private float velocidade;
	// metodos/ comportamenos
//syso system.out.ln	
	public void avancar(){
		System.out.println("Avançando");
	}

	public void retroceder(){
		System.out.println("Retrocedendo");
	}
	
	public void parar(){
		System.out.println("Parando");
	}
	
	public void abastecer(){
		System.out.println("Abastecendo");
	}
}	