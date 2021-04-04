package ACT2;

import java.util.Scanner;

public class ej17 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
	int edad;
	char genero;
	System.out.println("Ingrese su edad:");
	edad = Integer.parseInt(entrada.nextLine());
	while(edad>120) {
	System.out.println("Error. Rango de edad 0-120, ingresar edad de nuevo:");
	edad = Integer.parseInt(entrada.nextLine());
	}
	System.out.println("Ingrese la inicial de su genero (F/M):");
	genero = entrada.next().charAt(0);
	while(genero != 'F' && genero != 'M') {
		System.out.println("Error. Unicas entradas validas: F o M");	
		genero = entrada.next().charAt(0);
	}
	if(genero == 'M' && edad<65) {
		System.out.println("Usted no esta en edad de jubilarse");
	}
	if(genero == 'M' && edad>=65) {
		System.out.println("Usted esta en edad de jubilarse");
	}
	if(genero == 'F' && edad<60) {
		System.out.println("Usted no esta en edad de jubilarse");
	}
	if(genero == 'F' && edad>=60){
		System.out.println("Usted esta en edad de jubilarse");
	}
	
	
	}

}
