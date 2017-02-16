package br.unipe.java.unidade1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		Cachorro pitbull = new Cachorro();
		
		System.out.println("informe o nome do cahcorro:");
		pitbull.nome = leitor.nextLine();
		pitbull.latir();
		
		Carro ferrari = new Carro();
		ferrari.avancar();
		ferrari.retroceder();
		
		Carro fusca = new Carro();
		fusca.abastecer();
		fusca.parar();
	}

}
