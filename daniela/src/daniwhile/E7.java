package daniwhile;

import java.util.Scanner;

public class E7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha;

        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();
        } while (senha != 1234);

        System.out.println("Senha correta!");
        System.out.println("Acesso permitido.");

        sc.close();
    }
}
