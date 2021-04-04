package ACT2;

import java.util.Scanner;

public class ej16 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {

	int inscriptos;
	int asientos;
	System.out.println("Ingresar la cantidad de inscriptos:");
	inscriptos = Integer.parseInt(entrada.nextLine());
	System.out.println("Ingresar la cantidad de asientos:");
	asientos = Integer.parseInt(entrada.nextLine());
	
	if(inscriptos>asientos) {
		System.out.println("No hay suficiente lugar, faltan: " + (inscriptos-asientos) + " asientos");
	}
	else {
		System.out.println("Hay lugar suficiente");
	}
	}

}
