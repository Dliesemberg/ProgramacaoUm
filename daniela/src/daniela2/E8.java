package daniela2;

import java.util.Scanner;

public class E8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numA = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int numB = sc.nextInt();

        int divisaoInteira = numA / numB;
        double divisaoReal = (double) numA / numB;

        System.out.println("Divisão inteira: " + divisaoInteira);
        System.out.println("Divisão real: " + divisaoReal);
        sc.close();
    }
}
