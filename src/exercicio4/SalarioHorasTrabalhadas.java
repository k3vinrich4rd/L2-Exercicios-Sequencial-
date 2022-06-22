package exercicio4;

import java.util.Scanner;

public class SalarioHorasTrabalhadas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora: ");
        double ganhoPorHora = input.nextDouble();

        System.out.print("Quantas horas você trabalhou neste mês: ");
        double horasTrabalhadas = input.nextDouble();
        input.close();

        double salario = ( ganhoPorHora * horasTrabalhadas);
        System.out.printf("O seu salário no mês é: R$ %.0f ",salario);


    }
}
