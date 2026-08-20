package daniela;

import java.util.Scanner;

public class E7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma nota: ");
        double nota = sc.nextDouble();

        int notaInteira = (int) nota;
        double notaDouble = notaInteira;

        System.out.println("Valor inicial: " + nota);
        System.out.println("Valor convertido para int: " + notaInteira);
        System.out.println("Valor convertido novamente para double: " + notaDouble);
        sc.close();
    }
}
