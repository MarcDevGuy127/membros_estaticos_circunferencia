package util;

public class Calculator {


	// declarando um membro estatico, como uma constante(valor inalteravel) atraves de: final
	// nomes de constantes devem ser maiusculas ou se precisar com underlines!
	public final double PI = 3.14159;
	
	public double circumference(double radius) {
		
		return 2.0 * PI * radius;
	}

	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
}
