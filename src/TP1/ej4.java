package TP1;
import java.util.Scanner;

public class ej4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double valorHora;
		double cantHoras;
		
		System.out.println("Ingrese un valor para la hora de trabajo:");
		valorHora = Double.parseDouble(entrada.nextLine());
		System.out.println("Ingrese la cantidad de horas:");
		cantHoras = Double.parseDouble(entrada.nextLine());
		System.out.println("Salario semanal es de $"  +  (valorHora*cantHoras)*5.5);
	}

}
