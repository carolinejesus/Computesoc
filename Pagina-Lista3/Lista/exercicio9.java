package Exercicio9;

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double imposto, rendamensal;
        String classe, cpf;
        
        do {
            System.out.println("Digite seu cpf (ou digite 00 para encerrar): ");
            cpf = input.nextLine();
            
            if (cpf.equals("00")){
                System.out.println("Programa encerrado.");
                break;
            }
            
            System.out.println("Digite sua renda mensal: ");
            rendamensal = input.nextDouble();
            input.nextLine();
            System.out.println("Digite qual sua classe de renda: ");
            classe = input.nextLine().toUpperCase();
            
            if (classe.equals("A")){
                imposto = 0;
            } else {            
                switch (classe){
                    case "B" -> imposto = rendamensal * 0.05;
                    case "C" -> imposto = rendamensal * 0.10;
                    case "D" -> imposto = rendamensal * 0.15;
                    case "E" -> imposto = rendamensal * 0.20;
                    default -> {
                        System.out.println("Classe de renda inv�lida. Tente de novo.");
                        continue;
                    }
                }
            }
            
            if (imposto == 0){
                System.out.println("O contribuinte com CPF n�mero: "+cpf+"; Possui renda mensal de: R$"+rendamensal+", est� na classe "+classe+"; e est� isento.");
            } else {
                System.out.println("O contribuinte com CPF n�mero: "+cpf+"; Possui renda mensal de: R$"+rendamensal+", est� na classe "+classe+"; e pagar� R$"+imposto+" de imposto.");
            }
        } while (!cpf.equals("00"));
    }
}