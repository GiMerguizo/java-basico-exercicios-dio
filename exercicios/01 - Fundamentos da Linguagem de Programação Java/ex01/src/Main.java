/*
1. Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem:
"Olá 'Fulano' você tem 'X' anos"
*/

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 1");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        Scanner input = new Scanner(System.in);
        int anoAtual = OffsetDateTime.now().getYear();

        System.out.println("Seja Bem-vindo!");
        System.out.println("Digite o seu nome: ");
        String nome = input.next();
        System.out.println("Digite o seu ano de nascimento: ");
        int anoNascimento = input.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.printf("Olá, %s! Você tem %s anos.", nome, idade);

    }
}
