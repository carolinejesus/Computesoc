package Exercicio8;

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continuar;
        int idade, quantidadeinfantis = 0, quantidadeadultos = 0;
        
        do {
            System.out.println("Digite sua sua idade: ");
            idade = input.nextInt();

            if (idade < 6){
                System.out.println("Isento de pagamento.");
            } 
            if (idade >= 6 && idade <= 12){
                System.out.println("Bilhete de criança.");
                quantidadeinfantis ++;
            }
            if (idade >= 13 && idade <= 65){
                System.out.println("Bilhete normal.");
                quantidadeadultos ++;
            }
            if (idade > 65){
                System.out.println("Bilhete de 3° idade.");
            }

            do {
                System.out.println("Deseja continuar (S ou N)?");
                continuar = input.nextLine().toUpperCase();
            } while (!continuar.equals("S") && !continuar.equals("N"));
        } while (continuar.equals("S"));
        
        System.out.println("A quantidade de bilhetes infantis vendidos foi de: "+quantidadeinfantis+", e a de bilhetes adultos foi de: "+quantidadeadultos);
    }
}
