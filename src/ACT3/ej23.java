package ACT3;

import java.util.Scanner;

public class ej23 {
	final static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int num;
		int inicio = 1;
		int fin = 10;
 	System.out.println("Ingrese un numero: ");
 	num = Integer.parseInt(entrada.nextLine());
 	for(int i=inicio;i<=fin;i++) {
 		System.out.println(num*i);
 	}
 	
	}

}
