package ifdani;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();

		if (idade >= 18) {
			System.out.println("Maior de idade.");
		}
	}

}