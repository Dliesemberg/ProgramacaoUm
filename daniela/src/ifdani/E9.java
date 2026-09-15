package ifdani;

import java.util.Scanner;

public class E9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int primeiro = sc.nextInt();

		System.out.print("Digite o segundo número: ");
		int segundo = sc.nextInt();

		if (primeiro > segundo) {
			System.out.println("O primeiro número é maior.");
		} else {
			System.out.println("O segundo número é maior ou igual.");
		}
	}

}