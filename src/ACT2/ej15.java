package ACT2;

import java.util.Scanner;

public class ej15 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
	String nombre;
	int edad;
	double altura;
	System.out.println("Inserte su nombre: ");
	nombre = entrada.nextLine();
	System.out.println("Inserte su edad: ");
	edad = Integer.parseInt(entrada.nextLine());
	System.out.println("Inserte su altura: ");
	altura = Double.parseDouble(entrada.nextLine());
	
	if(edad>6 || altura>1.50) {
	System.out.println("pasas");
	}
	else {
	System.out.println("no pasas");
	}
	}

}
