package ACT2;

import java.util.Scanner;

public class ej11 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int num;
		System.out.println("Inserte un numero entero:");
		num = Integer.parseInt(entrada.nextLine());
		if(num%2==0) {
			System.out.println("El numero " + num + " es par ");
		}
		else {
			System.out.println("El numero " + num + " es impar ");
		}
	}

}
