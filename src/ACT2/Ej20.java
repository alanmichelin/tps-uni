package TP1;
import java.util.Scanner;
public class Ej20 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num1;
	int num2;
	char operador;
	double resultado = 0;
	boolean hayError = false;
	System.out.println("Inserte un numero entero:");
	num1 = Integer.parseInt(input.nextLine());
	System.out.println("Inserte otro numero entero:");
	num2 = Integer.parseInt(input.nextLine());
	System.out.println("Indique un operador:");
	operador = input.nextLine().charAt(0);
	switch(operador) {
	//los char van con comilla simple, los string con comilla doble!
	case '+': 
		resultado = num1+num2;
		break;
	case '-': 
		resultado = num1-num2;
		break;
	case '*': 
		resultado = num1*num2;
		break;
	case '/': 
		if(num2 != 0) {
		resultado = num1/num2;
		}else {
		hayError = true;
		}
		break;
	default:
		hayError = true;
		break;
	}
	if(hayError == false) {
	System.out.println("El resultado de la operacion es:" + resultado);
}else {
	System.out.println("Error en la operacion");
}
	}

}
