/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formul�rio;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Formul�rio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nome;
        String endere�o;
        int numero;
        
        System.out.println("Digite seu nome: ");
        nome=entrada.nextLine();
        
        System.out.println("Digite seu endere�o: ");
        endere�o=entrada.nextLine();
        
        System.out.println("Digite seu n�mero de telefone: ");
        numero=entrada.nextInt();
        
        System.out.println("Seu nome � "+ nome +", reside no endere�o: "+ endere�o +", com n�mero de telefone: "+ numero);
    }
    
}
