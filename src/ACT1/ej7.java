package ACT1;
import java.util.Scanner;
public class ej7 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Inserta el ancho de un terreno:");
	int largo = Integer.parseInt(entrada.nextLine());
	System.out.println("Inserta el ancho de un terreno:");
	int ancho = Integer.parseInt(entrada.nextLine());
	System.out.println("Inserta el valor de metro cuadrado");
	int m2 = Integer.parseInt(entrada.nextLine());
	System.out.println("Necesitas: " + largo*ancho*3 + " metros de alambre para cercarlo a 3 alturas distintas");
	System.out.println("El valor total del terreno es: " + (largo*ancho*(m2*m2)));
	}

}
