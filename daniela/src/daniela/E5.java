package daniela;

import java.util.Scanner;

public class E5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + "°F");
        sc.close();
    }
}
