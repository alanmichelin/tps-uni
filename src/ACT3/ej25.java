package ACT3;

import java.util.Scanner;

public class ej25 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int alto;
		int ancho;
		System.out.println("Ingrese un numero: ");
		alto = Integer.parseInt(entrada.nextLine());
	 	System.out.println("Ingrese otro numero: ");
	 	ancho = Integer.parseInt(entrada.nextLine());
	 	
	 	for(int i=1;i<alto;i++) {
	 		System.out.println("x");
	 	}
	 	for(int i=0;i<=ancho;i++) {
	 		System.out.print("x ");
	 	}
	}

}
