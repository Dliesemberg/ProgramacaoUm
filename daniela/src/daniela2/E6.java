package daniela2;

import java.util.Scanner;

public class E6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor em dólares: ");
        double valorEmDolares = sc.nextDouble();
        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = sc.nextDouble();

        double valorEmReais = valorEmDolares * cotacaoDolar;

        System.out.printf("O monitor custa %.2f reais%n", valorEmReais);
        sc.close();
    }
}
