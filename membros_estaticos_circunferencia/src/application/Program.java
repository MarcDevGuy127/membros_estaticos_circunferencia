package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {


	public static void main(String[] args) {
		/*
		 *  Fazer um programa para ler um valor numerico qualquer, e dai mostrar
		 *  quanto seria o valor de uma circunferencia e do volume de uma esfera
		 *  para um raio daquele valor. Informar tambem o valor de pi com duas
		 *  casas decimais.
		 *  
		 *  Versao 3
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f \n", c);
		System.out.printf("Volume: %.2f \n", v);
		System.out.printf("PI value: %.2f \n", Calculator.PI);
		
		sc.close();
	}

}
