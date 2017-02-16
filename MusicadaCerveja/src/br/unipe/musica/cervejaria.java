package br.unipe.musica;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class cervejaria {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int cerveja = 100;
		while (cerveja != 0) {
			
			System.out.println(cerveja+" cervejas no freezer.");
			System.out.println("Pego uma garrafa, passo pra frente.");
			cerveja -= 1;
			System.out.println("Agora são "+cerveja+" cervejas no freezer.");
			
		if (cerveja == 0){
			System.out.println("ACABOU A CERVEJA!");
			System.out.println("Adicionar mais cervejas: ");
			cerveja = leitor.nextInt();
		}
		
		}
	}

}
