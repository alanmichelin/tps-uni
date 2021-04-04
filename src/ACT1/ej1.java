package ACT1;
import java.util.Scanner;
public class ej1 {
	final static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Pone tu nombre:");
		String username = entrada.nextLine();
		System.out.println("Bienvenido " + username + "!");
	}

}
