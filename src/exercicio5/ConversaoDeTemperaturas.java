package exercicio5;

import java.util.Scanner;

public class ConversaoDeTemperaturas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a temperatura em Fahrenheit: ");
        double temperaturaEmFahrenheit = input.nextDouble();
        input.close();

        double infomação = (temperaturaEmFahrenheit - 32) * 5 / 9;
        System.out.printf("A conversão de Fahrenheit, para graus Celsius é:  %.2f °C ", infomação);
    }
}
