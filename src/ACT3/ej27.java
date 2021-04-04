package ACT3;

import java.util.Scanner;

public class ej27 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
	
	int mayorImpar = 0;
	int contadorEdades = 0;
	final int start = 1;
	final int cantEdades = 5;
	for(int i=start;i<=cantEdades;i++) {
		System.out.println("Ingresa edad de la persona numero:" + i);
		int edad = Integer.parseInt(entrada.nextLine());
		contadorEdades += edad;
		if(edad>=18 && edad%2 !=0) {
			mayorImpar += 1;
		}
	}
	System.out.println("El promedio de las edades da: " + contadorEdades/cantEdades + " y la cantidad de edades que son mayores e impares son: " + mayorImpar);
	}

}
