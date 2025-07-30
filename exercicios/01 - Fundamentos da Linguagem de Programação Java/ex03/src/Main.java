/*
Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela
- fórmula: área = base X altura
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 3");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        Scanner input = new Scanner(System.in);

        System.out.println("Vamos caluclar a área de um retângulo. Digite os valores...");
        System.out.println("Base: ");
        double base = input.nextInt();
        System.out.println("Altura: ");
        double altura = input.nextInt();

        double area = (base * altura) / 2;

        System.out.printf("Área total (%s x %s) = %s", base, altura, area);

    }
}