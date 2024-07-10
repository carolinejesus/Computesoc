package exercício12;

import java.util.Scanner;
//tem que colocar um numero com vírgula pra funcionar, ex 1,243
public class Exercício12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso, preço, prato, pratov, preçot;
        
        pratov = 450 / 1000;
        preço = 39.00;
        
        System.out.println("Informe o peso do prato: ");
        peso = input.nextDouble();
        
        prato = peso + pratov;
        preçot = prato * preço;
        
        System.out.println("O valor a pagar será de: R$ "+preçot);
    }
    
}
