/*
Escrever um algoritmo que lê a hora de início e hora de término de um jogo, ambas subdivididas em dois valores distintos: horas e minutos. Calcular e escrever a duração do jogo, também em horas e minutos, considerando que o tempo máximo de duração de um jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
 */

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input da hora de início do jogo
        System.out.println("Digite a hora de início do jogo: ");
        int horaInicio = input.nextInt();
        input.nextLine();

        // input do minuto de início do jogo
        System.out.println("Digite o minuto de início do jogo: ");
        int minutoInicio = input.nextInt();
        input.nextLine();

        // input da hora de término do jogo
        System.out.println("Digite a hora de termino do jogo: ");
        int horaTermino = input.nextInt();
        input.nextLine();

        // input do minuto de término do jogo
        System.out.println("Digite a hora de termino do jogo: ");
        int minutoTermino = input.nextInt();
        input.nextLine();

        int horaTotal;
        int minutoTotal;

        if (horaInicio > horaTermino) {
            horaTotal = 24 - horaInicio + horaTermino;
        } else {
            horaTotal = horaTermino - horaInicio;
        }

        if (minutoInicio > minutoTermino) {
            minutoTotal = 60 - minutoInicio + minutoTermino;
        } else {
            minutoTotal = minutoTermino - minutoInicio;
        }

        if ((horaTotal < 24) && (horaTotal > 0)) {
            System.out.println("O jogo durou " + horaTotal + " horas e " + minutoTotal + " minutos.");
        } else {
            System.out.println("Erro! duração máxima do jogo é de 24 horas!");
        }
    }
}
