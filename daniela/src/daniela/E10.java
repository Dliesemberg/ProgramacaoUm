package daniela;

import java.util.Scanner;

public class E10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o total de alunos: ");
        int totalAlunos = sc.nextInt();
        System.out.print("Digite a quantidade de grupos: ");
        int grupos = sc.nextInt();

        int divisaoInteira = totalAlunos / grupos;
        double divisaoReal = (double) totalAlunos / grupos;

        System.out.println("Divisão inteira: " + divisaoInteira);
        System.out.println("Divisão real: " + divisaoReal);
        sc.close();
    }
}
