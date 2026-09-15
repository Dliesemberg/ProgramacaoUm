package daniwhile;

import java.util.Scanner;

public class E6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de início: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o número de finalização: ");
        int fim = sc.nextInt();

        int numero = inicio;

        do {
            System.out.println(numero);
            numero++;
        } while (numero <= fim);

        sc.close();
    }
}
