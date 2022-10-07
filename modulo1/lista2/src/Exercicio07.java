/*
Receba uma matriz 10x3 onde contém 10 itens de supermercado (linhas) que foram cotados em 3 mercados diferentes (colunas). Com esses dados, escreva um algoritmo que calcule qual é o mercado mais barato para se comprar considerando todos os preços listados.
 */

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double matriz[][] = new double[10][3];
        double somaPrecosMercado1 = 0;
        double somaPrecosMercado2 = 0;
        double somaPrecosMercado3 = 0;
        String mercadoMaisBarato = "";
        double somaPrecosMercadoVencedor = 0;

        for(int contador = 0; contador < matriz.length; contador++) {

            for(int contador2 = 0; contador2 < matriz[contador].length; contador2++) {
                System.out.println("Informe o " + (contador2+1) +"° produto do " + (contador+1) + "° mercado: ");
                matriz[contador][contador2] = input.nextDouble();
            }
            somaPrecosMercado1 += matriz[contador][0];
            somaPrecosMercado2 += matriz[contador][1];
            somaPrecosMercado3 += matriz[contador][2];

            if (somaPrecosMercado1 <= somaPrecosMercado2 && somaPrecosMercado1 <= somaPrecosMercado3){
                mercadoMaisBarato = "PRIMEIRO!";
                somaPrecosMercadoVencedor = somaPrecosMercado1;
            } else if (somaPrecosMercado2 <= somaPrecosMercado1 && somaPrecosMercado2 <= somaPrecosMercado3) {
                mercadoMaisBarato = "SEGUNDO!";
                somaPrecosMercadoVencedor = somaPrecosMercado2;
            } else {
                mercadoMaisBarato = "TERCEIRO!";
                somaPrecosMercadoVencedor = somaPrecosMercado3;
            }
        }
        System.out.println("O mercado mais barato é o " + mercadoMaisBarato + " com o valor total dos produtos R$" + somaPrecosMercadoVencedor);
    }
}
