/*
Criar um algoritmo onde o usuário possa escolher o estado e haverá uma lista com determinadas cidades daquele aquele estado. O usuário poderá escolher uma cidade, após escolher a cidade desejada irá aparecer dados sobre a mesma (população, principal festa, IDH...). OBS: Deverá conter 3 estados e para cada estado 2 cidades.
 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha um estado (APENAS SIGLAS):\n[PB], [PE] ou [RN]");

        // input do estado
        String estado = input.nextLine().toUpperCase();

        switch(estado) {
            case "PB" -> {
                System.out.println("Você escolheu o estado da Paraíba \nEscolha a cidade que deseja obter informações: \n[João Pessoa] ou [Campina Grande]");

                // input da cidade
                String cidade = input.nextLine().toUpperCase();

                switch(cidade) {
                    case "JOÃO PESSOA", "JOAO PESSOA"  -> {
                        System.out.println("A população da cidade de João Pessoa é de 817.511 habitantes.");
                        System.out.println("Sua principal festa é a Festa das Neves! (padroeira da cidade)");
                        System.out.println("O IDH de Jampa é 0,763 (dado de 2010).");
                        System.out.println("Curiosidade: Paraíba tem uma praia de nudismo, a Tambaba. É lá que acontece, todos os anos, o Campeonato Brasileiro de Surfe dos Pelados");
                    }
                    case "CAMPINA GRANDE" -> {
                        System.out.println("A população da cidade de Campina Grande é de 402.912  habitantes.");
                        System.out.println("Sua principal festa é o São João (O maior São João do mundo, desculpa Caruaru <3)");
                        System.out.println("O IDH de Campina Grande é 0,720 (dado de 2010).");
                        System.out.println("Curiosidade: o Maior São João do Mundo, que dura cerca de 30 dias, reune mais de 1 milhão de pessoas!");
                    }
                    default -> {
                        System.out.println("Você digitou algo errado!");
                    }
                }
            }
            case "PE" -> {
                System.out.println("Você escolheu o estado de Pernambuco \n" +
                        "Escolha a cidade que deseja obter informações: \n" +
                        "[Recife] ou [Caruaru]");

                // input da cidade
                String cidade = input.nextLine().toUpperCase();

                switch(cidade) {
                    case "RECIFE" -> {
                        System.out.println("A população da cidade de Recife é de 1.653.461 habitantes.");
                        System.out.println("Sua principal festa é o Carnaval do Recife! (muito forte mesmo)");
                        System.out.println("O IDH do Recife é 0,772 (dado de 2010).");
                        System.out.println("Curiosidade: O Recife é palco de um dos maiores blocos de Carnaval de todo o Brasil: o Galo da Madrugada");
                    }
                    case "CARUARU" -> {
                        System.out.println("A população da cidade de Caruaru é de 365.278 habitantes.");
                        System.out.println("Sua principal festa é o São João (e acham que é maior que o de Campina Grande <3)");
                        System.out.println("O IDH de Caruaru é 0,677 (dado de 2010).");
                        System.out.println("Curiosidade: Caruaru é conhecida como a capital do Agreste!");
                    }
                    default -> {
                        System.out.println("Você digitou algo errado!");
                    }

                }

            }
            case "RN" -> {
                System.out.println("Você escolheu o estado do Rio Grande do Norte \n" +
                        "Escolha a cidade que deseja obter informações: \n" +
                        "[Natal] ou [Tibau do Sul]");

                // input da cidade
                String cidade = input.nextLine().toUpperCase();

                switch(cidade) {
                    case "NATAL" -> {
                        System.out.println("A população da cidade de Natal é de 1.653.461 habitantes.");
                        System.out.println("Como o próprio nome da cidade já diz, sua principal festa é o Natal!");
                        System.out.println("O IDH de Natal é 0,746 (dado de 2010).");
                        System.out.println("Curiosidade: o mar que cobre a costa potiguar é o segundo mais salgado do mundo, perdendo apenas para o Mar Morto, no Oriente Médio.");
                    }
                    case "TIBAU DO SUL" -> {
                        System.out.println("A população de Tibau do Sul é de 14.440 habitantes.");
                        System.out.println("Suas principais festas acontecem na sua principal praia: Praia de Pipa!");
                        System.out.println("O IDH de Caruaru é 0,645 (dado de 2010).");
                        System.out.println("Pipa tem duas praias entre as mais procuradas do mundo. A Praia do Madeiro, uma das praias de Pipa, já foi considerada uma das praias mais lindas do mundo. Além dela, em 2021 a Baía dos Golfinhos foi considerada uma das 10 praias mais bonitas do planeta.");
                    }
                    default -> {
                        System.out.println("Você digitou algo errado!");
                    }

                }

            }
            default -> {
                System.out.println("Você digitou algo errado!");
            }
        }
    }
}
