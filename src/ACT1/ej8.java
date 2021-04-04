package TP1;

import java.util.Scanner;

public class ej8 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Ingresa un numero natural:");
		int num1 = Integer.parseInt(entrada.nextLine());
		System.out.println("Ingresa otro natural:");
		int num2 = Integer.parseInt(entrada.nextLine());
		System.out.println("La suma da: " + (num1+num2) + " la resta da:" + (num1-num2) + " la multiplicacion da: " + (num1*num2) + "la division da: " + (num1/num2));
	}

}
