
package ex18creditobanco;

import java.util.Scanner;

public class Ex18CreditoBanco {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float media;
        
        System.out.println("Informe sua média de saldo anual: ");
        media = input.nextFloat();
       
        if (media >= 0 && media <= 500.00){
            System.out.println("Nenhum crédito.");
        } else if (media >= 500.01 && media <= 1000.00){
            System.out.println("30% do valor do saldo médio.");
        } else if (media >= 1000.01 && media <= 3000.00){
            System.out.println("40% do valor do crédito.");
        } else if (media > 3000.00){
            System.out.println("50% do valor do crédito");
        }
}
}
