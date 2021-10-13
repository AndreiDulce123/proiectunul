package app;

import java.util.Arrays;

public class Program1 {

	public static void main(String[] args) {
		
		// 100 500 345 510 600 20
		//int scor1 = 100;
		//int scor2 = 500;
		//int scor3 = 345;
		// ...
		int scoruri[] = {100, 500, 345, 510, 600, 20, 70, 700, 100, 223, 55, 44, 33}; // array
		System.out.println("Scorurile sunt: " + scoruri);
		System.out.println("Primul scor din array: " + scoruri[0]);
		System.out.println("Al doilea scor din array: " + scoruri[1]);
		System.out.println("Ultimul scor din array: " + scoruri[5]);
		
		
		System.out.println("Lungime array: " + scoruri.length);	
		
		int ultimul_scor= scoruri[scoruri.length - 1];
		System.out.println("Ultimul scor pe bune: " + ultimul_scor);
		
		System.out.println("========================================");
		for(int i=0; i<scoruri.length; i++) {
			System.out.println("i = " + i);
			System.out.println("Din array: " + scoruri[i]);
		}
		System.out.println("========================================");
		// TODO: de afisat toate numerele din scoruri mai mari sau egale cu 500  >=
		// TODO: de afisat doar numerele impare
		// de intrat pe https://codingbat.com/java
		
		int numar = 34;
		if(numar % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		System.out.println("========================================");

		System.out.println("ARRAY-ul afisat in stil Java: " + Arrays.toString(scoruri));
		
		
		System.out.println("=====================================");
		System.out.println("**END PROGRAM**");
	}
	
}
