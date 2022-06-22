package exercicio6;

import java.util.Scanner;

public class LeitorDeNumeroInteiro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = input.nextInt();
        input.close();

        int antecessor = numeroInteiro - 1;
        System.out.println("O antecessor do número "+ numeroInteiro+ " é: "+antecessor);
        int sucessor = numeroInteiro + 1;
        System.out.println("O sucessor do número "+ numeroInteiro+ " é: "+sucessor);

    }
}
