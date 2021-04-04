package ACT2;

import java.util.Scanner;

public class ej18 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
	int num1;
	int num2;
	System.out.println("Ingrese un numero: ");
	num1= Integer.parseInt(entrada.nextLine());
	System.out.println("Ingrese otro numero: ");
	num2= Integer.parseInt(entrada.nextLine());
	
	if(num1>num2) {
		if(num1%num2 == 0) {
			System.out.println(num1+ " es divisible por " + num2);
		}
		else {
			System.out.println("no es divisible");
		}
	}
	else {
		if(num2%num1 == 0) {
			System.out.println(num2+ " es divisible por " + num1);
		}else {
			System.out.println("no es divisible");
		}
	}
	}

}
