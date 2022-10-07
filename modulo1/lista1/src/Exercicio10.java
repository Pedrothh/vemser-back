/*
Escrever um algoritmo que lê o número de identificação, as 3 notas obtidas por um aluno nas 3 verificações e a média dos exercícios que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula:
MA = (Nota1 + Nota2 x 2 + Nota3 x 3 + ME )/7
A atribuição de conceitos obedece a tabela abaixo:
Média de Aproveitamento     Conceito
9,0                         A
7,5 e < 9,0                 B
6,0 e < 7,5                 C
4,0 e < 6,0                 D
< 4,0                       E
O algoritmo deve escrever o número de identificação do aluno, suas notas, a média dos exercícios, a média de aproveitamento, o conceito correspondente e a mensagem: APROVADO se o conceito for A, B ou C e REPROVADO se o conceito for D ou E.
 */

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input da identificação do aluno
        System.out.println("Digite o número da sua identificação: ");
        int numeroIdentificacao = input.nextInt();
        input.nextLine();

        // input da primeira nota
        System.out.println("Digite a primeira nota: ");
        double nota1 = input.nextDouble();
        input.nextLine();

        // input da segunda nota
        System.out.println("Digite a segunda nota: ");
        double nota2 = input.nextDouble();
        input.nextLine();

        // input da primeira nota
        System.out.println("Digite a terceira nota: ");
        double nota3 = input.nextDouble();
        input.nextLine();

        double mediaExercicios = (nota1 + nota2 + nota3)/3;
        double mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios)/7;
        String conceito;

        if (mediaAproveitamento >= 9) {
            conceito = "A";
        } else if (mediaAproveitamento >= 7.5) {
            conceito = "B";
        } else if (mediaAproveitamento >= 6) {
            conceito = "C";
        } else if (mediaAproveitamento >= 4) {
            conceito = "D";
        } else {
            conceito = "E";
        }


        System.out.println("Número de identificação: " + numeroIdentificacao);
        System.out.println("Nota 1: " + nota1 + "\n" +
                            "Nota 2: " + nota2 + "\n" +
                            "Nota 3: " + nota3);
        System.out.println("Média dos exercícios: " + mediaExercicios);
        System.out.println("Media de aproveitamento: " + mediaAproveitamento);
        System.out.println("Conceito: " + conceito);

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
