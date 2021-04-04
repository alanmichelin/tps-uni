package ACT3;

import java.util.Scanner;

public class ej33 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int numMin= 1;
		int numMax=0;
		int numIngresado=1;
		while(numIngresado!=0) {
			System.out.println("Ingresa un numero:");
			numIngresado = Integer.parseInt(entrada.nextLine());
			if(numIngresado>numMax) {
				numMax = numIngresado;
			}
			if(numIngresado<numMin && numIngresado != 0) {
				numMin = numIngresado;
			}
		}
		System.out.println("El numero mayor ingresado fue: " + numMax + " y el numero menor ingresado fue: " + numMin);
	}

}
