package daniela2;

import java.util.Scanner;

public class E7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();

        int salarioInteiro = (int) salario;
        double salarioDouble = salarioInteiro;

        System.out.println("Valor inicial: " + salario);
        System.out.println("Valor inteiro: " + salarioInteiro);
        System.out.println("Valor novamente em double: " + salarioDouble);
        sc.close();
    }
}
