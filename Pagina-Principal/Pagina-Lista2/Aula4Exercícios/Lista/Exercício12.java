package exerc�cio12;

import java.util.Scanner;
//tem que colocar um numero com v�rgula pra funcionar, ex 1,243
public class Exerc�cio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso, pre�o, prato, pratov, pre�ot;
        
        pratov = 450 / 1000;
        pre�o = 39.00;
        
        System.out.println("Informe o peso do prato: ");
        peso = input.nextDouble();
        
        prato = peso + pratov;
        pre�ot = prato * pre�o;
        
        System.out.println("O valor a pagar ser� de: R$ "+pre�ot);
    }
    
}
