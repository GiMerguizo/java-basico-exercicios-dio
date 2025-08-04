/*
Escreva um código onde o usuário informa um número inicial,
posteriormente irá informar outros N números,
a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de  0 na divisão,
números menores que o primeiro número devem ser ignorados.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int numero1 =  input.nextInt();

        while (true) {
            System.out.println("Insira o próximo número: ");
            int num = input.nextInt();

            if (num > numero1) {
                System.out.println("Resto da divisão = " + num % numero1);
                if (num % numero1 == 0) {
                    System.out.println("Finalizando o programa...");
                    break;
                }
            } else {
                System.out.println(num + " < " + numero1);
                System.out.println("Insira um número maior que o primeiro.");
            }
        }
    }
}
