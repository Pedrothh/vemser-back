/*
Receba uma matriz 5x4 onde as linhas são as disciplinas do aluno e as colunas são as notas daquela disciplina. Calcule a média dessas disciplinas e a média geral obtida pelo aluno em todas as disciplinas.
 */

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double  matriz[][] = new double[5][4];
        double mediaPorDisciplina[]  = new double[5];
        double mediaGeral = 0;

        // inicializando loop da linha da matriz
        for(int contador = 0; contador < matriz.length; contador++){
            double acumuladorDeNotasPorAluno = 0;

            // inicializando loop da coluna da matriz
            for(int contador2 = 0; contador2 < matriz[contador].length; contador2++){
                // input dos dados da matriz
                System.out.println("Informe a " + (contador2+1) +"° nota da " + (contador+1) + "ª disciplina: ");
                matriz[contador][contador2] = input.nextDouble();

                acumuladorDeNotasPorAluno += matriz[contador][contador2];
            }

            mediaPorDisciplina[contador] = acumuladorDeNotasPorAluno/4;
            mediaGeral += mediaPorDisciplina[contador];
        }

        int contador3 = 1;
        for(double valor : mediaPorDisciplina){
            System.out.println("A média da " + contador3 + "ª disciplina foi " + valor);
            contador3++;
        }
        System.out.println("A média geral de todas as notas foi de " + (mediaGeral/5));
    }
}