package ACT3;

import java.util.Scanner;

public class ej30 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {


		System.out.println("Indique un operador:");
		char operador = entrada.nextLine().charAt(0);
		while(operador!='F'){
		System.out.println("Inserte un numero entero:");
		int num1 = Integer.parseInt(entrada.nextLine());
		System.out.println("Inserte otro numero entero:");
		int num2 = Integer.parseInt(entrada.nextLine());

			if(operador=='+') {
				System.out.println(num1+num2);
			}
			if(operador=='-') {
				System.out.println(num1-num2);
			}
			if(operador=='*') {
				System.out.println(num1*num2);
			}
			if(operador=='/') {
				if(num1<num2) {
					System.out.println("ERROR."+ num1 + "es menor que " + num2);
				}
				else {
					System.out.println(num1/num2);
				}
				
			}
			System.out.println("Indique un operador:");
			operador = entrada.nextLine().charAt(0);
		}
		System.out.println("Finalizado");
		
	}

}
