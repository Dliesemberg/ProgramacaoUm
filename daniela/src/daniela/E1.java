package daniela;

import java.util.Scanner;

public class E1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o curso: ");
        String curso = sc.nextLine();
        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();
        System.out.print("Digite a média final: ");
        double mediaFinal = sc.nextDouble();
        System.out.print("Está matriculado? (true/false): ");
        boolean matriculado = sc.nextBoolean();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Altura: " + altura);
        System.out.println("Média final: " + mediaFinal);
        System.out.println("Está matriculado: " + matriculado);
        sc.close();
    }
}
