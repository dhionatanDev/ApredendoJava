package lista2EstruturaCondicionalAtv2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	Fazer um algoritmo que leia tr�s valores A, B, e C. O programa deve
			verificar se estes valores formam um tri�ngulo.
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
			System.out.println("Os valores formam um Tri�ngulo");
					}
		else {
			System.out.println("Os valores n�o formam um Tri�ngulo");
		}
		

	}

}
