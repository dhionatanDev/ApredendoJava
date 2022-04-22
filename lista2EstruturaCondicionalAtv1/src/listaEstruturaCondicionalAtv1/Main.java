package listaEstruturaCondicionalAtv1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		Desenvolver um algoritmo que leia os coeficientes (A,B e C) de uma
		equa��o do segundo grau ( Ax2 + Bx + C =0) e que calcule
		suas ra�zes. O algoritmo deve mostrar, quando poss�vel, o valor das
		ra�zes calculadas e a classifica��o das mesmas: �RA�ZES
		IMAGIN�RIAS�, �RAIZ �NICA� ou �RA�ZES DISTINTAS�.
		 */
		double valorA, valorB, valorC, delta, x1, x2;
		valorA = 0;
		valorB = 0;
		valorC = 0;
		delta = 0;
		x1 = 0;
		x2 = 0;
		
		Scanner lerTeclado = new Scanner(System.in);
		System.out.println("Informe o valor de A: ");
		valorA = lerTeclado.nextDouble();
		System.out.println("Informe o valor de B: ");
		valorB = lerTeclado.nextDouble();
		System.out.println("Informe o valor de C: ");
		valorC = lerTeclado.nextDouble();
		
		delta = Math.pow(valorB, 2) - (4 * valorA * valorC);
		
		
		if(delta < 0) {
			System.out.println("N�o existe Raiz Real");
		}
		else {
			if(delta == 0) {
				
				x1 = (- valorB + Math.sqrt(delta)) / (2 * valorA);
				System.out.printf("Raiz �nica %.2f",x1);
				
			}
			else {
				
				x1 = (- valorB + Math.sqrt(delta))/ (2 * valorA);
				x2 = (- valorB - Math.sqrt(delta))/ (2 * valorA);
				System.out.printf("Raizes distintas X': %.2f  x'': %.2f ",x1 , x2);
			}
		}
		
		
		
		
	}

}
