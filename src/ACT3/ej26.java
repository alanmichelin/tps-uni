package ACT3;

import java.util.Scanner;

public class ej26 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int cantMultiplos;
		System.out.println("Ingrese un numero: ");
		cantMultiplos = Integer.parseInt(entrada.nextLine());
	 	for(int i=1;i<=cantMultiplos;i++) {
	 		if(i%3==0 && i%5!=0) {
	 			System.out.println(i);
	 		}
	 	}
	 	
	}

}
