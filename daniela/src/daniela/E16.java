package daniela;

import java.util.Scanner;

public class E16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o funcionário: ");
        String funcionario = sc.nextLine();
        System.out.print("Digite o cargo: ");
        String cargo = sc.nextLine();
        System.out.print("Digite o salário: ");
        String salario = sc.nextLine();

        System.out.println("*************************");
        System.out.println("Funcionário: " + funcionario);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + salario);
        System.out.println("*************************");
        sc.close();
    }
}
