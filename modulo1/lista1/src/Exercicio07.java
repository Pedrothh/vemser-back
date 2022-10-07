/*
Um vendedor precisa de um algoritmo que calcule o preço total devido por um cliente. O algoritmo deve receber o código de um produto e a quantidade comprada e calcular o preço total, usando a tabela abaixo. Mostre uma mensagem no caso de código inválido.
 */

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input do código
        System.out.println("Digite o código do produto: ");
        String codigo = input.nextLine().toUpperCase();

        // input da quantidade
        System.out.println("Digite a quantidade que deseja comprar: ");
        int quantidade = input.nextInt();
        input.nextLine();

        // condições
        if (codigo.equals("ABCD")) {
            System.out.println("Você irá pagar: R$ " + (quantidade*5.3));
        } else if (codigo.equals("XYPK")) {
            System.out.println("Você irá pagar: R$ " + (quantidade*6));
        }  else if (codigo.equals("KLMP")) {
            System.out.println("Você irá pagar: R$ " + (quantidade*3.2));
        } else if (codigo.equals("QRST")) {
            System.out.println("Você irá pagar: R$ " + (quantidade*2.5));
        } else {
            System.out.println("Você digitou um código inválido!");
        }
    }
}