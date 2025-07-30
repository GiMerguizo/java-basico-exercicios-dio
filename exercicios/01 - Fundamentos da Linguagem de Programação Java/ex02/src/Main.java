/*
Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
- fórmula: área=lado X lado
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 2");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        Scanner input = new Scanner(System.in);

        System.out.println("Vamos calcular a área de um quadrado.");
        System.out.println("Lado do quadrado: ");
        double lado = input.nextFloat();

        double area = Math.pow(lado, 2);

        System.out.printf("Área total (%s x %s) = %s", lado, lado, area);

    }
}
