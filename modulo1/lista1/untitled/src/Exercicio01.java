/*
Desenvolver um algoritmo que exiba as seguintes informações, porém o que está sublinhado será solicitado ao usuário (por meio do Scanner).
EXEMPLO: Olá seu nome é João, você tem 16 anos, é da cidade de Florianópolis, situada no estado de Santa Catarina.
*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome, idade, cidade onde mora e estado \n(PRESSIONE ENTER PARA INSERIR CADA INFORMAÇÃO EM SEQUENCIA): ");

        // input do nome
        String nome = input.nextLine();

        // input da idade
        int idade = input.nextInt();
        input.nextLine();

        // input da cidade onde mora
        String cidadeOndeMora = input.nextLine();

        // input do estado onde mora
        String estadoOndeMora = input.nextLine();

        // output da classe
        System.out.println("Olá seu nome é " +nome+ ", você tem " +idade+ " anos, é da cidade de " +cidadeOndeMora+ ", situada no estado de " +estadoOndeMora+ ".");

    }
}