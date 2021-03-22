package TP1;
import java.util.Scanner;

public class ej2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota1;
		int nota2;
		int nota3;
		System.out.println("Ingresa la primer nota:");
		nota1 = Integer.parseInt(entrada.nextLine());
		System.out.println("Ingresa la segunda nota:");
		nota2= Integer.parseInt(entrada.nextLine());
		System.out.println("Ingresa la tercer nota:");
		nota3= Integer.parseInt(entrada.nextLine());
		System.out.println("Las notas: " + nota1 + ", " + nota2 + ", " + nota3 + " dan un promedio de:" + (nota1+nota2+nota3)/3);

	}

}
