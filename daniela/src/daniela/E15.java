package daniela;

import java.util.Scanner;

public class E15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o produto: ");
        String produto = sc.nextLine();
        System.out.print("Digite o preço: ");
        String preco = sc.nextLine();
        System.out.print("Digite o estoque: ");
        String estoque = sc.nextLine();

        System.out.println("=========================");
        System.out.println("Produto: " + produto);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + estoque + " unidades");
        System.out.println("=========================");
        sc.close();
    }
}
