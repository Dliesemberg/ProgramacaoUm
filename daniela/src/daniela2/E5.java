package daniela2;

import java.util.Scanner;

public class E5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do arroz: ");
        double arroz = sc.nextDouble();
        System.out.print("Digite o valor do feijão: ");
        double feijao = sc.nextDouble();
        System.out.print("Digite o valor do óleo: ");
        double oleo = sc.nextDouble();

        double total = arroz + feijao + oleo;
        double media = total / 3;

        System.out.println("Valor total: R$ " + total);
        System.out.println("Valor médio: R$ " + media);
        sc.close();
    }
}
