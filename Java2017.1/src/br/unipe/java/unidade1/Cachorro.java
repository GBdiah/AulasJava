package br.unipe.java.unidade1;

public class Cachorro {
	public String nome;
	
	public String getNome(){
		return nome;

}
	public void setNome(String nome){
		this.nome = nome;
}
	public void latir(){
		System.out.println("AU AU AU!!!");
	}
}