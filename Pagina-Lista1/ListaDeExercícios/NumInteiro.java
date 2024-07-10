/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NumInteiro;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class NumInteiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Informe um número inteiro: ");
        
        int numero;
        numero= input.nextInt();
        
        System.out.println("O número informado foi: "+ numero);
    }
    
}
