package TP1;

import java.util.Scanner;

public class ej10 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Primer persona, ingresa tu nombre:");
		String nombre1 = entrada.nextLine();
		System.out.println("Cuanto aportaste?");
		int aporte1 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Segunda persona, ingresa tu nombre:");
		String nombre2 = entrada.nextLine();
		System.out.println("Cuanto aportaste?");
		int aporte2 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Tercer persona, ingresa tu nombre:");
		String nombre3 = entrada.nextLine();
		System.out.println("Cuanto aportaste?");
		int aporte3 = Integer.parseInt(entrada.nextLine());
		int resultado = aporte1 + aporte2 + aporte3;
		System.out.println("Entre los 3 aportaron: " + (resultado));
		System.out.println(nombre1 + " aportaste el : " + (aporte1*100/resultado) + " porciento. " + nombre2 + " aportaste el: " + (aporte2*100/resultado) + " porciento. " + nombre3 + " aportaste el: " + (aporte3*100/resultado) + " porciento" );
	}

}
