package ACT2;

import java.util.Scanner;

public class ej13 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
	int num1;
	int num2;
	int num3;
	int numMayor = 0;
	System.out.println("Ingresar primer numero: ");
	num1 = Integer.parseInt(entrada.nextLine());
	System.out.println("Ingresar segundo numero: ");
	num2 = Integer.parseInt(entrada.nextLine());
	System.out.println("Ingresar tercer numero: ");
	num3 = Integer.parseInt(entrada.nextLine());
		if(num1>num2 && num1>num3) {
			numMayor= num1;
		}
		if(num2>num1 && num2>num3) {
			numMayor= num2;
		}
		if(num3>num1 && num3>num2) {
			numMayor= num3;
		}	
			
	System.out.println("El numero mayor es: " + numMayor);
	}

}
