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
		System.out.println("6- Listar Sinistro");
		System.out.println("7- Listar Contratos sem Sinistro");
		System.out.println("8- Persistencia com Serializacao");
		
		System.out.println("Entre com uma opcão: ");
		opcao = ler.nextInt();
		
		if (opcao == 1){
			
		}
		if (opcao == 2){
			
		}
		if (opcao == 3){
			
		}
		if (opcao == 4){
			
		}
		if (opcao == 5){
			
		}
		if (opcao == 6){
			
		}
		if (opcao == 7){
		
		}
		if (opcao == 8){
		
		}
		if (opcao <=0 || opcao > 8){
		Ststem.out.println("Erro, favor escolher opcao valida")
		}
		System.out.println("Cadestre seu nome");
		nome = ler.nextLine();

	}

}
