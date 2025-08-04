/*
Escreva um código que o usuário entre com um primeiro número,
um segundo número maior que o primeiro e escolhe entre a opção par e impar,
com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados,
incluindo os números informados e em ordem decrescente;
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int segundo = 0;
        int opcao = 0;
        boolean isMenor;
        boolean opcaoValida = true;

        System.out.println("Digite o primeiro número: ");
        int primeiro = input.nextInt();

        do {
            System.out.println("Digite o segundo número: ");
            segundo = input.nextInt();

            isMenor = segundo < primeiro;

            if (isMenor) System.out.println("Valor inválido! Insira um número maior que o primeiro");

        } while (isMenor);

        System.out.println("Intervalo selecionado: " + primeiro + " - " + segundo);

        System.out.println("Selecione uma das opções.");
        System.out.println("[1] Par");
        System.out.println("[2] Impar");
        do {
            System.out.print("Opção: ");
            opcao = input.nextInt();

            if (opcao == 1 || opcao == 2) opcaoValida = false;
            else System.out.println("Opção inválida! Tente novamente.");
        } while (opcaoValida);

        switch (opcao) {
            case 1:
                System.out.println("Números pares no intervalo: ");
                for (int i = segundo; i >= primeiro; i--) if (i % 2 == 0) System.out.println(i);
                break;
            case 2:
                System.out.println("Números ímpares no intervalo: ");
                for (int i = segundo; i >= primeiro; i--) if (i % 2 != 0) System.out.println(i);
                break;
            default:
                System.out.println("Algo deu errado. Tente novamente.");
                break;
        }
    }
}
