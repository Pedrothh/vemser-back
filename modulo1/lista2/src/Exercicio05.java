/*
Faça um programa que leia uma matriz de 5x4 inteiros contendo as seguintes informações do tipo inteiro:
a. Primeira coluna: número da matrícula
b. Segunda coluna: media das provas
c. Terceira coluna: média dos trabalhos
d. Quarta coluna: nota final
Elabore um programa que:
a. Leia as 3 primeiras informações de cada aluno
b. Calcule a nota final = (media das provas * 0,6 + media dos trabalhos * 0,4)
c. Imprima a matrícula que obteve a maior nota final
d. Imprima a média das notas finais
 */

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double matriz[][] = new double[5][4];
        double somaNotas = 0;
        double maiorNotaFinal = 0;
        double matriculaMaiorNota = 0;
        double mediaNotasFinais;

        for (int contador = 0; contador < matriz.length; contador++) {
            System.out.println("Digite o número de matricula do " + (contador+1) + "° aluno: ");
            matriz[contador][0] = input.nextDouble();

            System.out.println("Digite a média das provas do " + (contador+1) + "° aluno: ");
            matriz[contador][1] = input.nextDouble();

            System.out.println("Digite a média dos trabalhos do " + (contador+1) + "° aluno: ");
            matriz[contador][2] = input.nextDouble();

            matriz[contador][3] = ((matriz[contador][1]*0.6)+(matriz[contador][2]*0.4));

            if (contador == 0) {
                maiorNotaFinal = matriz[contador][3];
                matriculaMaiorNota = matriz[contador][0];
            } else {
                if (maiorNotaFinal < matriz[contador][3]) {
                    maiorNotaFinal = matriz[contador][3];
                    matriculaMaiorNota = matriz[contador][0];
                }
            }

            somaNotas += matriz[contador][3];
        }

        mediaNotasFinais = somaNotas / 5;

        System.out.println("A matrícula que obteve a maior nota final foi: " + (int)matriculaMaiorNota);
        System.out.println("A média das notas finais foi: " + String.format("%.2f", mediaNotasFinais));
    }
}
