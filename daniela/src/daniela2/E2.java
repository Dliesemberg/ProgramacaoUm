package daniela2;

import java.util.Scanner;

public class E2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Digite o código: ");
        int codigo = sc.nextInt();
        System.out.print("Digite o preço: ");
        double preco = sc.nextDouble();
        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = sc.nextInt();

        System.out.println("Produto: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
        sc.close();
    }
}
