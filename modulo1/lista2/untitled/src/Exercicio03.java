/*
Desenvolver um algoritmo que peça nome, altura, idade, peso dos jogadores de basquete, enquanto o nome do jogador for diferente da palavra SAIR o programa deverá pedir essas informações, após cadastrados deverá aparecer as seguintes informações: Quantidade de jogadores cadastrados; Altura do maior Jogador; Jogador mais velho; Jogador mais pesado; Média das alturas jogadores.
 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        double alturaMaiorJogador = 0;
        int jogadorMaisVelho = 0;
        String nomeJogadorMaisVelho = "";
        double jogadorMaisPesado = 0;
        String nomeJogadorMaisPesado = "";
        double alturasAcumuladas = 0;
        double mediaDasAlturas = 0;
        String nomeJogador;
        int contador = 1;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o nome do " + contador + "° Jogador (ou SAIR para encerrar): ");
            nomeJogador = input.nextLine().toUpperCase();

            if (nomeJogador.equals("SAIR")) {
                break;
            }

            System.out.println("Digite a altura do " + contador + "° Jogador: ");
            double alturaJogador = input.nextDouble();

            System.out.println("Digite a idade do " + contador + "° Jogador: ");
            int idadeJogador = input.nextInt();
            input.nextLine();

            System.out.println("Digite o peso do " + contador + "° Jogador: ");
            double pesoJogador = input.nextDouble();

            if (contador == 1) {
                alturaMaiorJogador = alturaJogador;
                jogadorMaisVelho = idadeJogador;
                nomeJogadorMaisVelho = nomeJogador;
                jogadorMaisPesado = pesoJogador;
                nomeJogadorMaisPesado = nomeJogador;
                alturasAcumuladas = alturaJogador;
                mediaDasAlturas = alturasAcumuladas / contador;
            } else {
                // if do jogador mais alto
                if (alturaMaiorJogador < alturaJogador) {
                    alturaMaiorJogador = alturaJogador;
                }

                // if do jogador mais velho
                if (jogadorMaisVelho < idadeJogador) {
                    jogadorMaisVelho = idadeJogador;
                    nomeJogadorMaisVelho = nomeJogador;
                }

                // if do jogador mais pesado
                if (jogadorMaisPesado < pesoJogador) {
                    jogadorMaisPesado = pesoJogador;
                    nomeJogadorMaisPesado = nomeJogador;
                }
            }
            contador += 1;
            alturasAcumuladas += alturaJogador;
        }
        while (true);

        System.out.println("Quantidade de jogadores cadastrados: " + (contador-1));
        System.out.println("Altura do maior Jogador é: " + alturaMaiorJogador + " metros.");
        System.out.println("Jogador mais velho: " + nomeJogadorMaisVelho + ", com " + jogadorMaisVelho + " anos!");
        System.out.println("Jogador mais pesado: " + nomeJogadorMaisPesado + ", com " + jogadorMaisPesado + " kilos!");
        System.out.println("Média das alturas jogadores: " + mediaDasAlturas + " metros.");
    }
}
