package ACT1;
import java.util.Scanner;


public class ej6 {
	final static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
	System.out.println("Ingrese el monto total de las ventas realizadas:");
	double ventas= Integer.parseInt(entrada.nextLine());
	ventas = ventas*0.16;
	System.out.println("El importe a total a cobrar por el vendedor es: " + (44000+ventas) );
	}
}
