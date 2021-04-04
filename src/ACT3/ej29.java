package ACT3;

import java.util.Scanner;

public class ej29 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Ingresa una nota:");
		int nota;
		nota = Integer.parseInt(entrada.nextLine());
		while(nota<0 || nota>10){
		System.out.println("Incorrecto, ingresa otra:");
		nota = Integer.parseInt(entrada.nextLine());
 	}
		
	}

}
