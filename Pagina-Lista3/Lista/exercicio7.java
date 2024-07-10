package Exercicio7;

import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String apto, hospede, cont = "S";
        int diária;
        String[] itens = {"A","B","C"};
        double[] preço = {150.00, 100.00, 75.00};
        
        System.out.println("Tipos de apartamento:");

        for (int i = 0; i < itens.length; i++) {
            System.out.println("\t" + itens[i] + "\t\tR$" + preço[i]);
        }
        
        do {
            System.out.println("Digite o nome do hóspede: ");
            hospede = input.nextLine();
            System.out.println("Digite o tipo do apartamento (A, B, ou C): ");
            apto = input.nextLine();
            System.out.println("Informe o número de diárias: ");
            diária = input.nextInt();
            
            if (diária <= 0){
                System.out.println("O número de diárias deve ser superior a zero.");
                continue;
            }
            
            double valord;
            
            switch (apto.toUpperCase()){
                case "A" -> valord = 150.00;
                case "B" -> valord = 100.00;
                case "C" -> valord = 75.00;
                default -> {
                    System.out.println("Tipo de apartamento inválido.");
                    continue;
                }
            }
            
            double total;
            total = valord * diária;
            
            System.out.println("O hóspede "+hospede+", ficou "+diária+" hospedado. Seu total a pagar será de: R$"+total);
            
            do {
                System.out.println("Deseja continuar (S/N)?");
                cont = input.nextLine().toUpperCase();
            } while (!cont.equals("S") && !cont.equals("N"));
        } while (cont.equals("S"));
    }
    
}
