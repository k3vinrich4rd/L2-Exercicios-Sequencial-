package exercicio7;

import java.util.Scanner;

public class InformacoesSalariais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora: ");
        double ganhoPorHora = input.nextDouble();

        System.out.print("Quantas horas você trabalhou neste mês: ");
        double horasTrabalhadas = input.nextDouble();
        input.close();

        double salario = (ganhoPorHora * horasTrabalhadas);
        double impostoDeRenda = salario * 11/100; // 0,11
        double inss = salario * 8/100; // 0,08
        double sindicato = salario * 5/100; // 0,05
        double valorLiquido = salario - (impostoDeRenda + inss + sindicato);

        System.out.printf("O seu salário bruto é de: R$ %.2f", salario);
        System.out.println();
        System.out.printf("O Valor que você pagou ao inss é de: R$ %.2f", inss);
        System.out.println();
        System.out.printf("Valor que você pagou ao sindicato é de: R$ %.2f",sindicato);
        System.out.println();
        System.out.printf("O seu salário liquído é de: R$ %.2f",valorLiquido);
    }
}
