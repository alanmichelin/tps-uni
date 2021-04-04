package ACT1;
import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		int numAux;
		System.out.println("Ingrese un numero:");
		num1= Integer.parseInt(input.nextLine());
		System.out.println("Ingrese otro numero:");
		num2= Integer.parseInt(input.nextLine());
		System.out.println("Numero 1 era: " + num1 +" y numero 2: " + num2);
		numAux= num1;
		num1= num2;
		num2= numAux;
		System.out.println("Ahora numero 1 es: " + num1 +" y numero 2 es: " + num2);
		
	}

}
