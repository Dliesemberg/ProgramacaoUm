package daniela;

import java.util.Scanner;

public class E9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();
        System.out.print("Digite o valor de y: ");
        int y = sc.nextInt();

        int divisaoInteira = x / y;
        double divisaoReal = (double) x / y;

        System.out.println("Divisão inteira: " + divisaoInteira);
        System.out.println("Divisão real: " + divisaoReal);
        sc.close();
    }
}
