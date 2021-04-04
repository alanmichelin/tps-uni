package ACT3;

import java.util.Scanner;

public class ej38 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		final String administrador = "admin";
		final String password = "123456";
		String user;
		String passIngresada; 
		int intentos = 0;
		
		while(intentos<3) {
		System.out.println("ingresar usuario");
		user = entrada.nextLine();
		System.out.println("ingresar pass");
		passIngresada = entrada.nextLine();
		
			if(user.equals(administrador) && passIngresada.equals(password)) {
				System.out.println("Correcto");
			} else {
				intentos += 1;
				System.out.println("Contra ingresada incorrecta, numero de intento: " + intentos);
				}	
		}
		System.out.println("User rechazado");
	}

}
