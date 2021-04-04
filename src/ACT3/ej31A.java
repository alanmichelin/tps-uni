package ACT3;

import java.util.Scanner;

public class ej31A {
	final static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Deseas continuar? [S/N]");
	char respuesta = entrada.nextLine().charAt(0);
	while(respuesta!='S' && respuesta!='N') {
		System.out.println("Deseas continuar? [S/N]");
		respuesta = entrada.nextLine().charAt(0);
	}
	System.out.println("FINALIZADO");
	}

}
