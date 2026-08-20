package daniela;

import java.util.Scanner;

public class E3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a distância em km: ");
        double distancia = sc.nextDouble();
        System.out.print("Digite a quantidade de litros: ");
        double litros = sc.nextDouble();

        double consumoMedio = distancia / litros;
        double litrosPara100Km = 100 / consumoMedio;

        System.out.println("Consumo médio: " + consumoMedio + " km/l");
        System.out.println("Litros necessários para 100 km: " + litrosPara100Km);
        sc.close();
    }
}
