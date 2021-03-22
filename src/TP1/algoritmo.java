package TP1;

import java.util.Scanner;
public class algoritmo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String numPaginas = "";
		System.out.println("Indique cuales paginas quiere imprimir:");
		String respUsuario = input.nextLine();
		if (respUsuario.contains("-")) {
			int start = respUsuario.indexOf("-") - 1;
			int end = respUsuario.indexOf("-") + 1;

			for (int i = respUsuario.charAt(start) - '0' + 1; i < respUsuario.charAt(end) - '0'; i++) {
				numPaginas = numPaginas + "," + Integer.toString(i);
			}
			System.out.println("imprimiendo paginas:" + respUsuario.split("-")[0] + numPaginas + "," + respUsuario.split("-")[1]);

		}else {
			System.out.println("Imprimiendo paginas: " + respUsuario);
		}

	}

}
