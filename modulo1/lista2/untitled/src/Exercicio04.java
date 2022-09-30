/*
Faça um algoritmo que leia 20 valores e os escreva na ordem contrária à que foram digitados.
 */

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String array[] = new String[20];

        for (int contador = 0; contador < 20; contador++) {
            System.out.println("Digite o " + (contador+1) + " valor: ");
            array[contador] = input.nextLine();
        }

        int contador = array.length;
        while (contador > 0) {
            System.out.println(array[contador-1]);
            contador--;
        }
    }
}
