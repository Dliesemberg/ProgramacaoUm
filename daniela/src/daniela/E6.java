package daniela;

import java.util.Scanner;

public class E6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a distância em quilômetros: ");
        double quilometros = sc.nextDouble();

        double metros = quilometros * 1000;

        System.out.println("Distância em metros: " + metros);
        sc.close();
    }
}
