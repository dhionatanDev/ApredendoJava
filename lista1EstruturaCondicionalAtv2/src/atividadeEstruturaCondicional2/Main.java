package atividadeEstruturaCondicional2;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
			/* 2. Fazer um algoritmo que calcule e imprima o sal�rio reajustado de um
			funcion�rio de acordo com as seguintes regras:
			� Sal�rios de at� R$ 1050,00 reajuste de 50%;
			� Sal�rios maiores que R$ 1050,00 reajuste de 30%.*/
		float salario;
		salario =0;
				
		Scanner lerTeclado = new Scanner(System.in);
		System.out.println("Informe o valor do S�lario do funcionario: ");
		salario = lerTeclado.nextFloat();
		if (salario <= 1050) {
			salario = (float) (salario + salario * 0.5);
			System.out.printf("O valor do salario reajustado � de R$ %.2f", salario);	
		}
		/* Resolu��o da quest�o com 2 If�s 
		 if (salario > 1050) {
			salario = (float) (salario + salario * 0.3);
			System.out.printf("O valor do salario reajustado � de R$ %.2f", salario);	
		}
		 */
		
		else {
			salario = (float) (salario + salario * 0.3);
			System.out.printf("O valor do salario reajustado � de R$ %.2f", salario);
		}
	}

}
