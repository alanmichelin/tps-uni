package ACT3;

import java.util.Scanner;

public class ej37 {
	final static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
	int cantDatos= 1;
	int sueldoMensual= 0;
	int totalSueldo = 0;
	while(cantDatos<=12 && sueldoMensual>=0) {
		System.out.println("Ingresa sueldo mensual numero " + cantDatos + ":");
		sueldoMensual = Integer.parseInt(entrada.nextLine());
		totalSueldo += sueldoMensual;
		cantDatos++;
		
	}
	System.out.println("Sueldo total es de: " + totalSueldo);
	}

}
