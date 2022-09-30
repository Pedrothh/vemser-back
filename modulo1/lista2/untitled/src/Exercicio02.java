/*
Isso lembrará uma brincadeira de escola...Uma pessoa escolhe um número e pede para outro adivinhar, faça um programa que tenha a mesma ideia, você informará um número e quando alguém for tentar adivinhá-lo o programa deverá informar se acertou o número ou se errou, se errou o programa deverá apresentar uma das seguintes frases: O número a ser encontrado é menor do que você digitou ou O número a ser encontrado é maior do que você digitou.
OBS: o programa deve parar quando a pessoa acertar o número adivinhado.
 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // input do número a ser encontrado
        System.out.println("Digite o número a ser encontrado: ");
        int numeroSecreto = input.nextInt();
        input.nextLine();

        // input da tentativa de número
        System.out.println("Digite o número que você acha que é: ");
        int numeroTentativa = input.nextInt();
        input.nextLine();

        // parte lógica
        while (numeroSecreto != numeroTentativa) {
            if (numeroTentativa > numeroSecreto) {
                System.out.println("O número a ser encontrado é menor do que você digitou!");
            } else if (numeroTentativa < numeroSecreto) {
                System.out.println("O número a ser encontrado é maior do que você digitou!");
            }
            System.out.println("Digite o número que você acha que é: ");
            numeroTentativa = input.nextInt();
            input.nextLine();
        }
        System.out.println("Parabéns, o número a ser encontrado era " + numeroSecreto + ", você acertou o número!");
    }
}
