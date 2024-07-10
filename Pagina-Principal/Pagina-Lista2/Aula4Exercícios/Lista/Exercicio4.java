/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4;

import java.util.Scanner;

/**
 *
 * @author CFJin
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, soma, somac;
        
        System.out.println("Digite A: ");
        A = input.nextInt();
        System.out.println("Digite B: ");
        B = input.nextInt();
        
        soma = A + B;
        somac = soma * soma;
        
        System.out.println("O soma dos quadrados de A + B é: "+ somac);
    }
    
}
