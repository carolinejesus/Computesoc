package Exercicio7;

import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String apto, hospede, cont = "S";
        int di�ria;
        String[] itens = {"A","B","C"};
        double[] pre�o = {150.00, 100.00, 75.00};
        
        System.out.println("Tipos de apartamento:");

        for (int i = 0; i < itens.length; i++) {
            System.out.println("\t" + itens[i] + "\t\tR$" + pre�o[i]);
        }
        
        do {
            System.out.println("Digite o nome do h�spede: ");
            hospede = input.nextLine();
            System.out.println("Digite o tipo do apartamento (A, B, ou C): ");
            apto = input.nextLine();
            System.out.println("Informe o n�mero de di�rias: ");
            di�ria = input.nextInt();
            
            if (di�ria <= 0){
                System.out.println("O n�mero de di�rias deve ser superior a zero.");
                continue;
            }
            
            double valord;
            
            switch (apto.toUpperCase()){
                case "A" -> valord = 150.00;
                case "B" -> valord = 100.00;
                case "C" -> valord = 75.00;
                default -> {
                    System.out.println("Tipo de apartamento inv�lido.");
                    continue;
                }
            }
            
            double total;
            total = valord * di�ria;
            
            System.out.println("O h�spede "+hospede+", ficou "+di�ria+" hospedado. Seu total a pagar ser� de: R$"+total);
            
            do {
                System.out.println("Deseja continuar (S/N)?");
                cont = input.nextLine().toUpperCase();
            } while (!cont.equals("S") && !cont.equals("N"));
        } while (cont.equals("S"));
    }
    
}
