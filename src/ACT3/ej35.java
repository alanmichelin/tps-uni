package ACT3;

import java.util.Scanner;

public class ej35 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		String nombre;
		int edad;
		int menorEdad = 0;
		String menorNombre = "";
		do{
			System.out.println("Ingresar nombre:");
			nombre = entrada.nextLine();
				if(nombre.charAt(0)!='*') 
				{
				System.out.println("Ingresar edad:");
				edad = Integer.parseInt(entrada.nextLine());
					if(edad<menorEdad || menorEdad==0) 
					{
						menorEdad = edad;
						menorNombre = nombre;
					}
				}
		
		} while(nombre.charAt(0)!='*');
		System.out.println("terminado. El menor es: " + menorNombre + " y tiene: " + menorEdad + " anios");	
	}

}
