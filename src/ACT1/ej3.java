package TP1;
import java.util.Scanner;

public class ej3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double numUser;
		
		System.out.println("Ingrese un numero entero:");
		numUser = Double.parseDouble(entrada.nextLine());
		System.out.println( numUser + "*5 = " + numUser*5 + "\n" + numUser +"/2 = " + numUser/2);
	}
}
