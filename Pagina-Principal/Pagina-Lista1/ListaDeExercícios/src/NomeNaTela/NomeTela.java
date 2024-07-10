/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NomeNaTela;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class NomeTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        Scanner entrada= new Scanner(System.in);
        // esse é da primeira página da lista
        System.out.println("Digite seu nome: ");
        name= entrada.nextLine();
        
        System.out.println("seu nome é "+name+".");
    }
    
}
