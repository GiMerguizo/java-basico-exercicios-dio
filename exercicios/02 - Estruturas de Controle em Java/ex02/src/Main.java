/*
Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
   - Se for menor ou igual a 18,5 "Abaixo do peso";
   - se for entre 18,6 e 24,9 "Peso ideal";
   - Se for entre 25,0 e 29,9 "Levemente acima do peso";
   - Se for entre 30,0 e 34,9 "Obesidade Grau I";
   - Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
   - Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Exercício 2");
        System.out.println("-=-=-=-=-=-=-=-=-=-");

        System.out.println("\nVamos fazer o cálculo do seu IMC.");
        System.out.println("Digite o seu altura (em metros): ");
        float altura = input.nextFloat();
        System.out.println("Digite o seu peso: ");
        float peso = input.nextFloat();

        float imc = peso/(altura * altura);

        System.out.println("IMC: " + imc);
        var mensagem = "";
        
        if (imc <= 18.5) mensagem = "Abaixo do peso.";
        else if (imc > 18.5 && imc < 25) mensagem = "Peso ideal.";
        else if (imc >= 25 && imc < 30) mensagem = "Levemente acima do peso.";
        else if (imc >= 30 && imc < 35) mensagem = "Obesidade Grau I.";
        else if (imc >= 35 && imc < 40) mensagem = "Obesidade Grau II (Severa).";
        else if (imc >= 40) mensagem = "Obesidade Grau III.";
        else mensagem = "Algo deu errado. Tente novamente.";

        System.out.println(mensagem);
    }
}
