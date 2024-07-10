package Exercicio6;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int otimo=0, ruim=0, somaidaderuim =0, velha=0, nova= Integer.MAX_VALUE;
        
        System.out.println("Digite sua avaliação:");
        System.out.println("'A' para 'Ótimo';");
        System.out.println("'B' para 'Bom';");
        System.out.println("'C' para 'Regular';");
        System.out.println("'D' para 'Ruim';");
        

        for (int i = 0;  i < 20; i++){
        System.out.println("Digite sua avaliação: ");
        String avaliação = input.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        input.nextLine();
        
        if (avaliação.equals("A")){
            otimo++;
        } else if (avaliação.equals("D")){
            ruim++;
            somaidaderuim += idade;
        }
        velha = Math.max(velha, idade);
        nova = Math.min(nova, idade);
    }
        double mediaruim = ruim > 0 ? (double) somaidaderuim / ruim : 0; 
        // ? = Este é o operador ternário, que separa a expressão condicional do valor que será retornado caso a condição seja verdadeira.
        // : = Este é o separador entre o valor retornado caso a condição seja verdadeira e o valor retornado caso a condição seja falsa.
        //(double) = está ali para fazer uma conversão caso precise de um resultado de ponto flutuante.
        int diferenca = velha - nova;
        
        System.out.println("Quantidade de respostas ótimo: "+otimo);
        System.out.println("Média da idade das pessoas que responderam ruim: "+mediaruim);
        System.out.println("Diferença de idade entre a pessoa mais velha e mais nova: "+diferenca);
    }
    
}
