/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SucessorAntecessor;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class SucessorAntecessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Informe um número inteiro: ");
        
        int numero;
        numero= input.nextInt();
        
        int sucessor= numero + 1;
        int antecessor= numero - 1;
        
        System.out.println("O número informado foi: "+ numero);
        System.out.println("O seu sucessor é: "+ sucessor);
        System.out.println("O seu antecessor é: "+ antecessor);
    }
    
}
