package daniwhile;

import java.util.Scanner;

public class E14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int soma = 0;

        for (int numero = 1; numero <= n; numero++) {
            soma += numero;
        }

        System.out.println("Soma: " + soma);

        sc.close();
    }
}
