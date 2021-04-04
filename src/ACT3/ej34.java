package ACT3;

import java.util.Scanner;

public class ej34 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		double estatura;
		double contador = 0;
		double total = 0;
		System.out.println("Ingrese estatura: \n0 para terminar");
		estatura = Double.parseDouble(entrada.nextLine());
		while(estatura!=0) {
		System.out.println("Ingrese estatura: \n0 para terminar");
		estatura = Double.parseDouble(entrada.nextLine());
		if(estatura!=0) {
		contador += 1;
		total += estatura;
		}
		}
		System.out.println("Estatura promedio: " + (total/contador));
	}

}
