package javaBasic1;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		/* 1. Fazer um algoritmo que leia um n�mero inteiro e mostre uma
		mensagem indicando se este n�mero � par ou �mpar.*/
		
		int numero, calculo;
		numero = 0;
		calculo =0;
		
		Scanner lerTeclado = new Scanner (System.in);
		
		System.out.println("Informe o numero: ");
		numero = lerTeclado.nextInt();
		calculo = numero % 2;
		if (calculo == 0) {
			System.out.println("O num�ro � par");
		}
		/* Programa com Else 
		 else {
			System.out.println("O numero � impar");
		}*/
		// Abaixo programa com outro If
		if(calculo != 0) {
			System.out.println("Onumero � impar");
		}
		lerTeclado.close();
		
	}

}
