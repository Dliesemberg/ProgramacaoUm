package daniela2;

import java.util.Scanner;

public class E11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = sc.nextLine();
        System.out.print("Digite a nota: ");
        int nota = sc.nextInt();
        System.out.print("Digite a frequência: ");
        int frequencia = sc.nextInt();

        String resultado = nota >= 7 && frequencia >= 75 ? "Aprovado" : "Reprovado";

        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
