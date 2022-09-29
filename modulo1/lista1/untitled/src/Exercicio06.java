/*
Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
 */

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input do total de eleitores
        System.out.println("Digite o total de eleitores: ");
        int numeroTotalEleitores = input.nextInt();
        input.nextLine();

        // input do número de votos brancos
        System.out.println("Digite número de votos brancos: ");
        double numeroVotosBrancos = input.nextDouble();

        // input do número de votos nulos
        System.out.println("Digite número de votos nulos: ");
        double numeroVotosNulos = input.nextDouble();

        // input do número de votos validos
        System.out.println("Digite número de votos válidos: ");
        double numeroVotosValidos = input.nextDouble();

        System.out.println("O percentual de votos brancos foi de: " + (int)((numeroVotosBrancos/numeroTotalEleitores)*100) + "%");

        System.out.println("O percentual de votos nulos foi de: " + (int)((numeroVotosNulos/numeroTotalEleitores)*100) + "%");

        System.out.println("O percentual de votos válidos foi de: " + (int)((numeroVotosValidos/numeroTotalEleitores)*100) + "%");
    }
}