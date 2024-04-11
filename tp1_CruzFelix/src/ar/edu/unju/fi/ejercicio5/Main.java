package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero entre 1 y 9:");
		int numero= scanner.nextInt();
		if ((numero>0)&&(numero<=9)) {
			for (int i= 0; i<=10; i++) {
				int resultado= numero*i;
				System.out.println(numero+" x "+i+"= "+resultado);
			}
		} else {
			System.out.println("Numero fuera de rango");
		}
		
		scanner.close();
	}

}
