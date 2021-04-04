package ACT3;

import java.util.Scanner;

public class ej36 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int numIngresado;
		int sumaNumeros = 0;
		int cantNumeros = 0;
		double promedio = 0;
		while(promedio<20) {
		System.out.println("Ingresa un numero:");
		numIngresado = Integer.parseInt(entrada.nextLine());
		sumaNumeros += numIngresado;
		cantNumeros++;
		promedio = (sumaNumeros/cantNumeros);
		}
		System.out.println("promedio mayor a 20. Numeros ingresados: " + cantNumeros);
	}

}
