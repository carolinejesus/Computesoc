/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerc�cio3;

import java.util.Scanner;

/**
 *
 * @author CFJin
 */
public class Exerc�cio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int A, B, soma, somac, quadrado;
        
        System.out.println("Digite A: ");
        A = input.nextInt();
        System.out.println("Digite B: ");
        B = input.nextInt();
        
        soma = A * A;
        somac = B * B;
        quadrado = soma + somac;
        
        System.out.println("O quadrado de A �: "+ soma +" e o quadrado de B �: "+ somac +" , a soma de seus dois quadrados �: "+ quadrado);
        
    }
    
}
