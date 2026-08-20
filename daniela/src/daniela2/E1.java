package daniela2;

import java.util.Scanner;

public class E1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();
        System.out.print("Digite o peso: ");
        double peso = sc.nextDouble();
        System.out.print("Digite o sexo (M/F): ");
        char sexo = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("Digite a situação da matrícula: ");
        String matricula = sc.nextLine();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Sexo: " + sexo);
        System.out.println("Situação da matrícula: " + matricula);
        sc.close();
    }
}
