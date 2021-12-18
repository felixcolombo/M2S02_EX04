package com.github.felixcolombo.jogoadivinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
	private static Scanner keyboard = new Scanner(System.in);
	
	private static int numEscolhido;
	private static int numSorteado;
	private static int numTentativas;
	
	static Random sorteio = new Random();
	
	public void jogo() {
		
		do {
			System.out.println("Digite um número de 1 - 5");
			numEscolhido = keyboard.nextInt();
					
			numSorteado = sorteio.nextInt(5)+1;
					
			if(numEscolhido==numSorteado) {
				System.out.printf("Parabéns, você acertou em %s tentativas!", numTentativas);
			}else {
				System.out.println("Você errou, o número sorteado foi: "+numSorteado);
				numTentativas++;
			}
		}while (numEscolhido!=numSorteado);
	}
}
