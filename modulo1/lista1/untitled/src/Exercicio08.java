/*
Uma empresa concederá um aumento de salário aos seus funcionários, variável de acordo com o cargo, conforme a tabela abaixo. Faça um algoritmo que leia o salário e o cargo de um funcionário e calcule o novo salário. Se o cargo do funcionário não estiver na tabela, ele deverá, então, receber 40% de aumento. Mostre o salário antigo, o novo salário e a diferença.
Código      Cargo       Percentual
101         Gerente     10%
102         Engenheiro  20%
103         Técnico     30%
 */

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input do salario
        System.out.println("Digite o salário do funcionário: ");
        double salario = input.nextDouble();

        // input do cargo
        System.out.println("Digite o cargo do funcionário: ");
        String cargo = input.next().toUpperCase();

        if (cargo.equals("GERENTE")) {
            double novoSalario = salario+(salario*0.1);
            System.out.println("O salário antigo era R$" + salario + ", o novo salário será: R$" + (novoSalario) + ", uma diferença de mais R$" + (novoSalario - salario) + " reais!");
        } else if (cargo.equals("ENGENHEIRO")) {
            double novoSalario = salario+(salario*0.2);
            System.out.println("O salário antigo era R$" + salario + ", o novo salário será: R$" + novoSalario + ", uma diferença de mais R$" + (novoSalario - salario) + " reais!");
        } else if (cargo.equals("TECNICO") || cargo.equals("TÉCNICO")) {
            double novoSalario = salario+(salario*0.3);
            System.out.println("O salário antigo era R$" + salario + ", o novo salário será: R$" + novoSalario + ", uma diferença de mais R$" + (novoSalario - salario) + " reais!");
        } else {
            double novoSalario = salario+(salario*0.4);
            System.out.println("O salário antigo era R$" + salario + ", o novo salário será: R$" + novoSalario + ", uma diferença de mais R$" + (novoSalario - salario) + " reais!");
            }
    }
}
