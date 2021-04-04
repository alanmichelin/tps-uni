package ACT3;

import java.util.Scanner;

public class ej24 {
	final static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int num1;
		int num2;
		System.out.println("Ingrese un numero: ");
	 	num1 = Integer.parseInt(entrada.nextLine());
	 	System.out.println("Ingrese otro numero: ");
	 	num2 = Integer.parseInt(entrada.nextLine());
	 	
	 	if(num1<=num2) {
	 		System.out.println("secuencia de números excluyendolos:");
	 		for(int i = num1+1;i<num2;i++) {
	 			System.out.println(i);
	 		}
	 		System.out.println("secuencia de números incluyendolos:");
	 		for(int i = num1;i<=num2;i++) {
	 			System.out.println(i);
	 		}
	 	}
	 	else {
	 		System.out.println(num1+ " es mayor que " + num2);
	 	}
	}

}
