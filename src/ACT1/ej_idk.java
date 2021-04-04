package ACT1;

import java.util.Scanner;


public class ej_idk {

	public static void main(String[] args) {
	String answer;
	int numAntes;
	int numDesp;
	String intervalo ="";

	Scanner input = new Scanner(System.in);
	System.out.println("que paginas quiere impirmir");
	answer = input.nextLine();
	
		if(answer.contains("-")) {
			numAntes = answer.indexOf("-")-1;
			numDesp = answer.indexOf("-")+1;
			
				for(int i = answer.charAt(numAntes) - '0' + 1; i< answer.charAt(numDesp) - '0'; i++) {
				intervalo = intervalo + "," + Integer.toString(i);
				}
		System.out.println(answer.split("-")[0] + intervalo + "," + answer.split("-")[1]);
			
		}
	
	}

}
