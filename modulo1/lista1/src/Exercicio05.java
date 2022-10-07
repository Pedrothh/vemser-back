/*
Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
 */

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        double base;
        double altura;

        Scanner input = new Scanner(System.in);

        // input da base
        System.out.println("Digite a dimensão da base do retângulo: ");
        base = input.nextDouble();

        // input da altura
        System.out.println("Digite a dimensão da altura do retângulo: ");
        altura = input.nextDouble();

        // output da área do retângulo
        System.out.println("A área do retângulo é: " + (base*altura));

    }
}
