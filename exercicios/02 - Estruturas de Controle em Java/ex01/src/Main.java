/*
Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 1");
        System.out.println("-=-=-=-=-=-=-=-=-=-");

        Scanner input = new Scanner(System.in);
        System.out.println("Vamos fazer a tabuada!");
        System.out.println("Informe o número: ");
        int numero = input.nextInt();

        System.out.println("---------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        System.out.println("---------------");

        if (numero == 0) {
            System.out.println("Qualquer número * 0 é igual a 0.");
        }
    }
}
