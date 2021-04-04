package ACT2;

import java.util.Scanner;

public class ej12 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
	int num1;
	int num2;

	System.out.println("Ingresar un numero: ");
	num1 = Integer.parseInt(entrada.nextLine());
	System.out.println("Ingresar otro numero: ");
	num2 = Integer.parseInt(entrada.nextLine());
	if(num1>num2) {

		System.out.println("El numero mayor es el numero uno");
	}
	else {

		System.out.println("El numero mayor es el numero dos");
	}
	
	}

}
