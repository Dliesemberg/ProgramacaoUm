package daniwhile;

import java.util.Scanner;

public class E10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int quantidade = 0;
        String resposta;

        do {
            System.out.print("Digite o nome do aluno: ");
            String nome = sc.nextLine();

            System.out.print("Digite a nota de " + nome + ": ");
            double nota = sc.nextDouble();
            sc.nextLine();

            soma += nota;
            quantidade++;

            System.out.print("Deseja cadastrar outro aluno? (S/N): ");
            resposta = sc.nextLine();

        } while (resposta.equalsIgnoreCase("S"));

        double media = soma / quantidade;

        System.out.println("Média das notas = " + media);

        sc.close();
    }
}
