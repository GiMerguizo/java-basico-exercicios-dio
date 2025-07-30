/*
Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 4");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        Scanner input = new Scanner(System.in);

        System.out.println("Vamos calcular a diferença de idade de vocês.");
        System.out.println("Nome 1: ");
        String nome1 = input.next();
        System.out.println("Idade 1: ");
        int idade1 = input.nextInt();
        System.out.println("Nome 2: ");
        String nome2 = input.next();
        System.out.println("Idade 2: ");
        int idade2 = input.nextInt();

        int diferenca = idade1 - idade2;

        System.out.printf("%s tem %s anos e %s tem %s anos. A diferença de idade entre eles é de %s ano(s).",  nome1, idade1, nome2, idade2, diferenca);
    }
}