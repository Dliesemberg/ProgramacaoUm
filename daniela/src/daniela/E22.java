package daniela;

import java.util.Scanner;

public class E22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String produto = sc.nextLine();
        System.out.print("Digite o valor unitário: ");
        double valorUnitario = sc.nextDouble();
        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();
        System.out.print("Digite a quantidade de parcelas: ");
        int parcelas = sc.nextInt();

        double valorTotal = valorUnitario * quantidade;
        double valorParcela = valorTotal / parcelas;

        System.out.println("Nome do produto: " + produto);
        System.out.println("Valor unitário: R$ " + valorUnitario);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: R$ " + valorTotal);
        System.out.println("Quantidade de parcelas: " + parcelas);
        System.out.println("Valor de cada parcela: R$ " + valorParcela);
        sc.close();
    }
}
