package lista3EstruturaCondicionalDs4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode
come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas
		 */
		int inicio = 0, fim = 0, calculo = 0;
		
		Scanner lerTeclado = new Scanner(System.in);
		
		System.out.println("Informe a hora Inicio da Partida: ");
		inicio = lerTeclado.nextInt();
		System.out.println("Informe a hora Final da Partida: ");
		fim = lerTeclado.nextInt();
		
		calculo = 24 - inicio + fim;
		if(calculo > 24) {
			calculo = 24 - inicio + fim - 24;
			System.out.println("O jogo durou " + calculo + " Hora(s)");
		}
		else {
			System.out.println("O jogo durou " + calculo + " Hora(s)");
		}
	}

}
