package daniela2;

import java.util.Scanner;

public class E14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();
        System.out.print("Digite o tempo de empresa em anos: ");
        int tempoEmpresa = sc.nextInt();

        double bonus = tempoEmpresa >= 5 ? 500 : 0;
        double salarioFinal = salario + bonus;

        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Bônus: R$ " + bonus);
        System.out.println("Salário Final: R$ " + salarioFinal);
        sc.close();
    }
}
