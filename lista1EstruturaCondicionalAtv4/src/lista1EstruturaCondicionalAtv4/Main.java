package lista1EstruturaCondicionalAtv4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		N�meros quadrados perfeitos s�o aqueles cuja raiz quadrada � um
		n�mero inteiro. Exemplo 144. Fazer um algoritmo que dado um
		n�mero inteiro positivo, calcule e escreva se este � ou n�o quadrado
		perfeito.
		 		*/
		int numero; 
		float calculo, raiz;
		numero = 0;
		calculo = 0;
		raiz = 0;
		
		Scanner lerTeclado = new Scanner(System.in);
		
		System.out.println("Informe um numero inteiro positivo: ");
		
		numero = lerTeclado.nextInt();
		raiz =  (float) Math.sqrt(numero);
		calculo = (float) numero % raiz;
		
		
		if(calculo == 0) {
			System.out.println("O numero � um quadrado perfeito e sua raiz �: " + raiz);
			
		}
		/* resolu��o com 2 if�s
		if(calculo != 0) {
			System.out.println("O numero n�o forma um quadrado perfeito");
			
		}*/
		else { System.out.println("O numero n�o forma um quadrado perfeito");
		}

	}
}