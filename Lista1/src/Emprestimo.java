import java.util.Scanner;
// Gabriel Vasconcelos

public class Emprestimo 
{
	
	private int idade;
	private  int mesesParaPagar;
	private float valorEmprestimo, percentualJurosMes;
	private static String nomeUsuario;
	
	
	
	public void Imprimir()
	{
		System.out.println("Nome do Cliente: " +nomeUsuario);
		System.out.println("Idade do Cliente: " +idade);
		System.out.println("Prazo para pagamento em meses: " +mesesParaPagar);
		System.out.println("Juros mensal de: " +percentualJurosMes);
		System.out.println("Valor do emprestimo de: " +valorEmprestimo);
	}
	public float calcularEmprestimo(int idade, int mesesParaPagar, float percentualJurosMes, float valorEmprestimo)
	{
		if (18<=idade && idade<23) 
		{
			valorEmprestimo += (valorEmprestimo/mesesParaPagar)/ percentualJurosMes;
		} 
		
		if (23<idade && idade<=33) 
		{
			valorEmprestimo = (valorEmprestimo * 10)/100;
		}
		
		else
		{
			System.out.println("Error 404 Programa Not Found");
		}
		
		return valorEmprestimo;
	}
	public void main(String [] args){
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite seu Nome: ");
		nomeUsuario = leitor.nextLine();
				
		System.out.println("Digite sua idade: ");
		idade = leitor.nextInt();
		
		System.out.println("Digite o praso de pagamento (meses): ");
		mesesParaPagar = leitor.nextInt();
		
		System.out.println("Informe o valor do emprestimo: ");
		valorEmprestimo = leitor.nextFloat();
		
		System.out.println("Digite o percemtual de juros: ");
		percentualJurosMes = leitor.nextFloat();
		
		calcularEmprestimo(idade, mesesParaPagar, percentualJurosMes, valorEmprestimo);
		
	}
}

