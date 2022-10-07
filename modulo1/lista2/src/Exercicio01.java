/*
Elabore um programa para uma papelaria que leia o nome e o valor de um produto. Em seguida, faça uma lista de 1 a 10 unidades do produto, sendo que o desconto de uma unidade desse produto seja de 5% e de 2 seja 10% de 3 = 15% etc... Até alcançar os 50% de desconto
 */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // input do nome do produto
        System.out.println("Digite o nome do produto: ");
        String nomeProduto = input.nextLine();

        // input do valor do produto
        System.out.println("Digite o valor do produto: ");
        double precoProduto = input.nextDouble();

        // prints obrigatórios
        System.out.println("Produto.: " + nomeProduto);
        System.out.println("Preço R$.: " + precoProduto);
        System.out.println("Promoção: " + nomeProduto);
        System.out.println("----------------");

        // parte lógica
        double desconto = 0;
        for (int controle = 1; controle < 11; controle++) {
            desconto += 0.05;
            System.out.println(controle + " x R$ " + String.format("%.2f" , precoProduto-(precoProduto*desconto)) + " = R$" + String.format("%.2f" , controle*(precoProduto-(precoProduto*desconto))));
        }
    }
}