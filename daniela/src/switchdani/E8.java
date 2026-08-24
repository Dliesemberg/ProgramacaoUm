package switchdani;

import java.util.Scanner;

public class E8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1 - Sala 1");
		System.out.println("2 - Sala 2");
		System.out.print("Digite o número da sala: ");
		int sala = sc.nextInt();

		if (sala == 1) {
			System.out.println("1 - Aventura");
			System.out.println("2 - Comédia");
			System.out.println("3 - Ficção Científica");
		} else if (sala == 2) {
			System.out.println("1 - Terror");
			System.out.println("2 - Romance");
			System.out.println("3 - Animação");
		}

		System.out.print("Digite o número do filme: ");
		int filme = sc.nextInt();

		switch (sala) {
		case 1:
			switch (filme) {
			case 1:
				System.out.println("Aventura");
				break;
			case 2:
				System.out.println("Comédia");
				break;
			case 3:
				System.out.println("Ficção Científica");
				break;
			default:
				System.out.println("Filme inválido.");
			}
			break;
		case 2:
			switch (filme) {
			case 1:
				System.out.println("Terror");
				break;
			case 2:
				System.out.println("Romance");
				break;
			case 3:
				System.out.println("Animação");
				break;
			default:
				System.out.println("Filme inválido.");
			}
			break;
		default:
			System.out.println("Sala inválida.");
		}
	}

}