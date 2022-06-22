package exercicio2;

import java.util.Scanner;

public class CalculoDeMediaBimestral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Infome a sua primeira nota bimestral: ");
        double nota1 = input.nextDouble();
        System.out.print("Informe a sua segunda nota bimestral: ");
        double nota2 = input.nextDouble();
        System.out.print("Informe a sua terceira nota bimestral: ");
        double nota3 = input.nextDouble();
        System.out.print("Informe a sua quarta nota bimestral: ");
        double nota4 = input.nextDouble();
        input.close();

        double mediaDasNotas = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("O calculo da média bimestrais é: %.1f ", mediaDasNotas);


    }
}
