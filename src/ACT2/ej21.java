package ACT2;

import java.util.Scanner;

public class ej21 {
	final static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int num;
		System.out.println("ingrese un numero: ");
		num = Integer.parseInt(entrada.nextLine());
		switch (num) {
			case 1: System.out.println("Dia: " + num + " es Domingo");
			break;
			case 2: System.out.println("Dia: " + num + " es Lunes");
			break;
			case 3: System.out.println("Dia: " + num + " es Martes");
			break;
			case 4: System.out.println("Dia: " + num + " es Miercoles");
			break;
			case 5: System.out.println("Dia: " + num + " es Jueves");
			break;
			case 6: System.out.println("Dia: " + num + " es Viernes");
			break;
			case 7: System.out.println("Dia: " + num + " es Sabado");
			break;
			default: System.out.println( num + " es incorrecto");
		}
	}

}
