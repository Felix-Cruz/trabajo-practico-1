package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese numero: ");
		int num = scanner.nextInt();
		int factorial= 1;
		if ((num <=10) && (num>=0)) {
			while (1<num) {
				factorial= factorial*num;
				num--;
			} 
			System.out.println("El factorial es: "+factorial);
		} else {
				System.out.println("El numero tiene que ser entre 0 y 10");
			}
		
		scanner.close();
	}

}
