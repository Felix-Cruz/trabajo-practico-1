package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int numero = scanner.nextInt();
		
		if ((numero % 2) == 0) {
			System.out.println(numero*3);
		} else {
			System.out.println(numero*2);
		}
		scanner.close();
	}

}
