package switchdani;

import java.util.Scanner;

public class E7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1 - Bebidas");
		System.out.println("2 - Lanches");
		System.out.print("Digite o setor: ");
		int setor = sc.nextInt();

		if (setor == 1) {
			System.out.println("1 - Água");
			System.out.println("2 - Refrigerante");
			System.out.println("3 - Suco");
		} else if (setor == 2) {
			System.out.println("1 - Cachorro-quente");
			System.out.println("2 - Hambúrguer");
			System.out.println("3 - Pizza");
		}

		System.out.print("Digite o produto: ");
		int produto = sc.nextInt();

		switch (setor) {
		case 1:
			switch (produto) {
			case 1:
				System.out.println("Água");
				break;
			case 2:
				System.out.println("Refrigerante");
				break;
			case 3:
				System.out.println("Suco");
				break;
			default:
				System.out.println("Produto inválido.");
			}
			break;
		case 2:
			switch (produto) {
			case 1:
				System.out.println("Cachorro-quente");
				break;
			case 2:
				System.out.println("Hambúrguer");
				break;
			case 3:
				System.out.println("Pizza");
				break;
			default:
				System.out.println("Produto inválido.");
			}
			break;
		default:
			System.out.println("Setor inválido.");
		}
	}

}