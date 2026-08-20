package daniela;

import java.util.Scanner;

public class E18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a média: ");
        double media = sc.nextDouble();

        String situacao = media >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(situacao);
        sc.close();
    }
}
