package lista2EstruturaCondicionalAtv4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fazer um algoritmo que dado os tr�s lados de um tri�ngulo (A, B, e
		 C) dizer se ele � equil�tero, is�sceles ou escaleno.
		  */
		double valorA, valorB, valorC, calculo;
		valorA = 0;
		valorB = 0;
		valorC = 0;
		Scanner lerTeclado = new Scanner(System.in);
		System.out.println("Informe o primeiro Numero");
		valorA = lerTeclado.nextDouble();
		System.out.println("Informe o segundo Numero");
		valorB = lerTeclado.nextDouble();
		System.out.println("Informe o terceiro Numero");
		valorC = lerTeclado.nextDouble();
		
		if(valorA + valorB > valorC && valorA + valorC > valorB && valorC + valorB > valorA) {
			if(valorA == valorB && valorA == valorC) {
				System.out.println("O tri�ngulo � equil�telo");
			}
			else {
				if(valorA != valorB && valorA != valorC && valorB != valorC) {
				System.out.println("O tri�ngulo � escaleno");
					}
				else {
					if(valorA == valorB && valorA != valorC || valorA == valorC && valorA != valorB || valorC == valorB && valorB != valorA  );
					System.out.println("O tri�ngulo � isoceles");
				
			}
		}}
		else {
			System.out.println("Os valores n�o formam um Tri�ngulo");
		}
		
	}

}
