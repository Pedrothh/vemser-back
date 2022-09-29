/*
Criar um tradutor que traduza as seguintes palavras de inglês para português e de português para inglês.
Cachorro - Dog
Tempo - Time
Amor - Love
Cidade - City
Feliz - Happy
Triste - Sad
Deveria - Should
Poderia - Could
OBS: Caso o usuário informe alguma outra palavra o programa deverá informar a seguinte mensagem: Essa palavra não é válida.
OBS2: traduzir de inglês para português e de português para inglês
 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual palavra você deseja traduzir?");

        String palavra = input.nextLine().toUpperCase();

        switch(palavra) {
            case "CACHORRO" -> {
                System.out.println("Dog");
            }
            case "DOG" -> {
                System.out.println("Cachorro");
            }
            case "TEMPO" -> {
                System.out.println("Time");
            }
            case "TIME" -> {
                System.out.println("Tempo");
            }
            case "AMOR" -> {
                System.out.println("Love");
            }
            case "LOVE" -> {
                System.out.println("Amor");
            }
            case "CIDADE" -> {
                System.out.println("City");
            }
            case "CITY" -> {
                System.out.println("Cidade");
            }
            case "FELIZ" -> {
                System.out.println("Happy");
            }
            case "HAPPY" -> {
                System.out.println("Feliz");
            }
            case "TRISTE" -> {
                System.out.println("Sad");
            }
            case "SAD" -> {
                System.out.println("Triste");
            }
            case "DEVERIA" -> {
                System.out.println("Should");
            }
            case "SHOULD" -> {
                System.out.println("Deveria");
            }
            case "PODERIA" -> {
                System.out.println("Could");
            }
            case "COULD" -> {
                System.out.println("Poderia");
            }
            default -> {
                System.out.println("Essa palavra não é válida.");
            }
        }
    }
}
