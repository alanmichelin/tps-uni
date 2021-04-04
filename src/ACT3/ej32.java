package ACT3;

import java.util.Scanner;

public class ej32 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int cant;
		int num =0;
		int numMayor = 0;
		int posicion =0;
		System.out.println("Ingrese un numero de cuantas notas quiere ingresar: ");
		cant = Integer.parseInt(entrada.nextLine());
		for(int i=1;i<=cant;i++) {
			 System.out.println("Ingrese el numero " + i + " de " + cant);
			 num = Integer.parseInt(entrada.nextLine());
			 
			 if(num!=1|| num!=3 || num!=0 || num<=10) {
				 
			 if(num>numMayor) {
				 numMayor = num;
				 posicion = i;
			 }
			}
			
		}
		System.out.println("La nota mayor fue: " + num + " , la posicion del numero fue: " + posicion);

	}

}
