package daniela2;

import java.util.Scanner;

public class E13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura: ");
        double temperatura = sc.nextDouble();

        String situacao = temperatura > 25 ? "Dia quente" : "Dia agradável";

        System.out.println("Temperatura: " + temperatura + "°C");
        System.out.println("Situação: " + situacao);
        sc.close();
    }
}
