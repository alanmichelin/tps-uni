package ACT3;

import java.util.Scanner;

public class ej28 {
	final static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int cant;
		int num =0;
		int numMayor = 0;
		int posicion =0;
		System.out.println("Ingrese un numero: ");
		cant = Integer.parseInt(entrada.nextLine());
		for(int i=1;i<=cant;i++) {
			 System.out.println("Ingrese el numero " + i + " de " + cant);
			 num = Integer.parseInt(entrada.nextLine());
			 if(num>numMayor) {
				 numMayor = num;
				 posicion = i;
			 }
			
		}
		System.out.println("El numero mayor fue: " + num + " , la posicion del numero fue: " + posicion);

	}

}
