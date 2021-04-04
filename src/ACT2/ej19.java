package ACT2;

import java.util.Scanner;

public class ej19 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int num;
		boolean esDeUnSoloDigito = false;
		boolean esImpar = false;
		boolean estaEnAmbos = false;
		boolean noEstaEnNinguno = false;
		System.out.println("Ingresa un numero");
		num = Integer.parseInt(entrada.nextLine());
		if(num<10) {
			esDeUnSoloDigito = true;
		}
		if(num%2 != 0) {
			esImpar = true;
		}
		if(esDeUnSoloDigito && esImpar) {
			estaEnAmbos = true;
		}
		if(!esDeUnSoloDigito && !esImpar){
			noEstaEnNinguno = true;
		}

	}
	/* PRUEBAS:
	 * 8 - estaEnAmbos: false, noEstaEnNinguno: false
	 * 12 - estaEnAmbos: false, noEstaEnNinguno: true
	 * 5 - estaEnAmbos: true, noEstaEnNinguno: false */
}
