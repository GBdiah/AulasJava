package projeto;

import java.util.Scanner;

public class Seguradora {
	public int tipoCliente;
	public String nome;
	
	public void main(String[] args) {
		int opcao;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("===========SEGURADORA SE FUDEU==========");
		System.out.println("1- Fazer Cadastro");
		System.out.println("2- Cadastrar Contrato");
		System.out.println("3- Listar Cliente");
		System.out.println("4- Listar Contrato");
		System.out.println("5- Cadastrar Sinistro");
		//TODO System.out.println("6- Listar Cliente");
		//TODO System.out.println("7- Listar Cliente");
		//TODO System.out.println("8- Listar Cliente");
		
		System.out.println("Entre com uma opcão: ");
		opcao = ler.nextInt();
		
		if (opcao == 1){
			
		}
		
		System.out.println("Cadestre seu nome");
		nome = ler.nextLine();

	}

}
