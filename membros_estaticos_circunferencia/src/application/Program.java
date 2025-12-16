package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	// declarando um membro estatico, como uma constante(valor inalteravel) atraves de: final
	// nomes de constantes devem ser maiusculas ou se precisar com underlines!
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		/*
		 *  Fazer um programa para ler um valor numerico qualquer, e dai mostrar
		 *  quanto seria o valor de uma circunferencia e do volume de uma esfera
		 *  para um raio daquele valor. Informar tambem o valor de pi com duas
		 *  casas decimais.
		 *  
		 *  Versao 1
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius); // recebendo circunferencia do raio informado atraves de uma funcao
		
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f \n", c);
		System.out.printf("Volume: %.2f \n", v);
		System.out.printf("PI value: %.2f \n", PI);
		
		sc.close();
	}

	public static double circumference(double radius) {
		
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
