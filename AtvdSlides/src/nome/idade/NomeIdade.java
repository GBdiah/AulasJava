package nome.idade;

import java.util.Scanner;

public class NomeIdade {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		int ano, idade;
		
		System.out.println("digite o seu nome: ");
		nome = ler.nextLine();
		
		System.out.println("digite seu ano de nascimento: ");
		ano = ler.nextInt();
		idade = ano - 2017;
		
		System.out.println("Você tem "+ idade+" anos "+ nome);
}
}