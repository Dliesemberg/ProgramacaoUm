package daniela;

import java.util.Scanner;

public class E21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o salário base: ");
        double salarioBase = sc.nextDouble();
        System.out.print("Digite a quantidade de horas extras: ");
        int horasExtras = sc.nextInt();

        double valorHorasExtras = horasExtras * 35;
        double salarioFinal = salarioBase + valorHorasExtras;

        System.out.println("Nome: " + nome);
        System.out.println("Salário base: R$ " + salarioBase);
        System.out.println("Valor das horas extras: R$ " + valorHorasExtras);
        System.out.println("Salário final: R$ " + salarioFinal);
        sc.close();
    }
}
