package daniela;

import java.util.Scanner;

public class E2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a marca: ");
        String marca = sc.nextLine();
        System.out.print("Digite o modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Digite o ano de fabricação: ");
        int ano = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite a cor: ");
        String cor = sc.nextLine();
        System.out.print("Digite o valor: ");
        double valor = sc.nextDouble();
        System.out.print("É automático? (true/false): ");
        boolean automatico = sc.nextBoolean();

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Automático: " + automatico);
        sc.close();
    }
}
