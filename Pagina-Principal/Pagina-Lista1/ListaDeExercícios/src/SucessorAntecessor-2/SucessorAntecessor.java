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
        
        System.out.println("Informe um n�mero inteiro: ");
        
        int numero;
        numero= input.nextInt();
        
        int sucessor= numero + 1;
        int antecessor= numero - 1;
        
        System.out.println("O n�mero informado foi: "+ numero);
        System.out.println("O seu sucessor �: "+ sucessor);
        System.out.println("O seu antecessor �: "+ antecessor);
    }
    
}
