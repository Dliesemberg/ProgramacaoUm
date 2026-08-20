package daniela;

import java.util.Scanner;

public class E8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma temperatura: ");
        double temperatura = sc.nextDouble();

        int temperaturaInteira = (int) temperatura;
        double temperaturaDouble = temperaturaInteira;

        System.out.println("Valor inicial: " + temperatura);
        System.out.println("Valor convertido para int: " + temperaturaInteira);
        System.out.println("Valor convertido novamente para double: " + temperaturaDouble);
        sc.close();
    }
}
