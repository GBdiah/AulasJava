package soma.numeros;

import java.util.Scanner;

public class Soma {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int val1,val2, soma;
		
		System.out.println("Digite o primeiro numero");
		val1 = ler.nextInt();
		
		System.out.println("Digite o segundo numero");
		val2 = ler.nextInt();
		
		soma = (val1 + val2);
		
		System.out.println("A soma dos números é "+ soma);
	}

}