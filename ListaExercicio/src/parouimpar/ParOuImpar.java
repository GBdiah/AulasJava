package parouimpar;

import java.util.Scanner;
/**
 * 
 * @author Hudson, Gabriel
 *classe que checa se o numero inserido eh par ou impar
 */

public class ParOuImpar {

	public static void main(String[] args) {
		int i = 0;
		Scanner leitor = new Scanner(System.in);
		for (i = 0; i<10; i++){
			System.out.println("Entrada numero "+ (i+1));
			System.out.println("Digite um numero");
			int numero = leitor.nextInt();
			if (numero % 2 == 0) {
				System.out.println("Numero Par");
			}
			else{
				System.out.println("Numero Impar");
			}
			
		}
		leitor.close();
}
}
