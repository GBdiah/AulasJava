package cunsumo.carro;
import java.util.Scanner;

public class ConsumoComb {
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		
		float distancia, consumido, consumo;
		System.out.println("digite a kilometragem: ");
		distancia = leitor.nextFloat();
		System.out.println("Digite o consumo em litros: ");
		consumido = leitor.nextFloat();
		
		consumo = distancia/consumido;
		
		
		System.out.println("O consumo foi "+ consumo + "Km/L");
	}
	

}
