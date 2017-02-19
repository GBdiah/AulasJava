package media.alunos;

import java.util.Scanner;

public class MediaAlunos {

	public static void main(String[] args) {
		// new metodo sempre
		Scanner ler = new Scanner(System.in);
		String nome;
		float nota1, nota2, nota3, media;

		System.out.println("Digite seu nome: ");
		nome = ler.nextLine();
		System.out.println("Digite a nota 1: ");
		nota1 = ler.nextFloat();
		System.out.println("Digite a nota 2: ");
		nota2 = ler.nextFloat();
		System.out.println("Digite a nota 3: ");
		nota3 = ler.nextFloat();

		if (nota1 > nota2) {
			media = (nota1 + nota3) / 2;

		} else {
			media = (nota2 + nota3) / 2;
		}
		if (media >= 7) {
			System.out.println("Aluno " + nome + " aprovado com media " + media);
		}
		if ((media >= 5) & (media < 7)) {
			System.out.println("Aluno " + nome + " na final com media " + media);
		} 
		if (media <5){
			System.out.println("Aluno "+ nome + " reprovado com media "+ media);
		}
		
	}

}
