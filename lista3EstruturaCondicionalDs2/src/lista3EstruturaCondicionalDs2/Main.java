package lista3EstruturaCondicionalDs2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar
		  */
		 int numero = 0 ;
		 Scanner lerTeclado = new Scanner(System.in);
		 System.out.println("Digite um numero: ");
		 numero = lerTeclado.nextInt();
		 
		 numero = numero % 2;
		 
		 if(numero == 0) {
			 System.out.println("O numero digitado � par ");
		 }
		 else {
			 System.out.println("O numero digitado � impar");
		 }
	}

}
