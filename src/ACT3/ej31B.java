package ACT3;

import java.util.Scanner;

public class ej31B {
	final static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
	char respuesta;
	do{
		System.out.println("Deseas continuar? [S/N]");
		respuesta = entrada.nextLine().charAt(0);
	}
	while(respuesta!='S' && respuesta!='N'); 
	System.out.println("FINALIZADO");
	}

}
