package daniela2;

import java.util.Scanner;

public class E10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Digite o curso: ");
        String curso = sc.nextLine();
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        System.out.println("==============================");
        System.out.println("Aluno: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("==============================");
        sc.close();
    }
}
