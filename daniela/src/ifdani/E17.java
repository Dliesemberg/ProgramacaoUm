package ifdani;

import java.util.Scanner;

public class E17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o usuário: ");
		String usuario = sc.nextLine();

		System.out.print("Digite a senha: ");
		String senha = sc.nextLine();

		if (!usuario.equals("admin")) {
			System.out.println("Usuário inexistente.");
		} else {
			if (senha.equals("1234")) {
				System.out.println("Acesso permitido.");
			} else {
				System.out.println("Senha incorreta.");
			}
		}
	}

}