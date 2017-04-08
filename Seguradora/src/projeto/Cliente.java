package projeto;

import java.util.Scanner;

public class Cliente {
	Scanner ler = new Scanner(System.in);
	public String nome;
	public int valImovel;
	public int tipoPessoa;
	public static void main(String[] args){
		Cliente pessoa = new Cliente();
		System.out.println("Pessoa fisica(1) ou Juridica(2) >>");
		tipoPessoa = ler.nextInt();
		
		if (tipoPessoa == 1){
			// pessoa fisica
		}
		if (tipoPessoa == 2){
			// pessoa juridica
		}
	}

	
}


