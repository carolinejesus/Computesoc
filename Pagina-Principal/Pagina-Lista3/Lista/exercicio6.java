package Exercicio6;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int otimo=0, ruim=0, somaidaderuim =0, velha=0, nova= Integer.MAX_VALUE;
        
        System.out.println("Digite sua avalia��o:");
        System.out.println("'A' para '�timo';");
        System.out.println("'B' para 'Bom';");
        System.out.println("'C' para 'Regular';");
        System.out.println("'D' para 'Ruim';");
        

        for (int i = 0;  i < 20; i++){
        System.out.println("Digite sua avalia��o: ");
        String avalia��o = input.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        input.nextLine();
        
        if (avalia��o.equals("A")){
            otimo++;
        } else if (avalia��o.equals("D")){
            ruim++;
            somaidaderuim += idade;
        }
        velha = Math.max(velha, idade);
        nova = Math.min(nova, idade);
    }
        double mediaruim = ruim > 0 ? (double) somaidaderuim / ruim : 0; 
        // ? = Este � o operador tern�rio, que separa a express�o condicional do valor que ser� retornado caso a condi��o seja verdadeira.
        // : = Este � o separador entre o valor retornado caso a condi��o seja verdadeira e o valor retornado caso a condi��o seja falsa.
        //(double) = est� ali para fazer uma convers�o caso precise de um resultado de ponto flutuante.
        int diferenca = velha - nova;
        
        System.out.println("Quantidade de respostas �timo: "+otimo);
        System.out.println("M�dia da idade das pessoas que responderam ruim: "+mediaruim);
        System.out.println("Diferen�a de idade entre a pessoa mais velha e mais nova: "+diferenca);
    }
    
}
