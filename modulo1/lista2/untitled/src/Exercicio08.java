/*
Desenvolver um vetor que contenha 10 números (não será pedido ao usuário). Com esse vetor faça:
a. Peça um número ao usuário e armazene-o;
b. Imprima quantas vezes o número digitado existe no vetor;
c. Imprima quantos números menores que o número digitado;
d. Imprima quantos números maiores que o número digitado;
 */

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numero;
        int numerosIguais = 0;
        int numerosMenores = 0;
        int numerosMaiores = 0;

        System.out.println("Digite um número inteiro: ");
        numero = input.nextInt();
        input.nextLine();

        for(int valor : vetor){
            if(valor == numero){
                numerosIguais++;
            }
            else if(valor>numero){
                numerosMaiores++;
            }
            else {
                numerosMenores++;
            }
        }

        System.out.println("O número digitado existe " + numerosIguais + " vez(es) no vetor." );
        System.out.println("Existem " + numerosMenores + " números menores que " + numero + " no vetor.");
        System.out.println("Existem " + numerosMaiores + " números maiores que " + numero + " no vetor.");
    }
}
