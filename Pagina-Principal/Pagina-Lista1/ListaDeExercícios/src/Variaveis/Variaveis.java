/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Variaveis;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Variaveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vari�vel1;
        int vari�vel2;
        // esse � d aprimeira p�gina da lista
        System.out.println("Digite um n�mero inteiro: ");
        vari�vel1= entrada.nextInt();
        System.out.println("Digite um segundo n�mero inteiro: ");
        vari�vel2= entrada.nextInt();
        
        float vari�vel3;
        float vari�vel4;
        
        System.out.println("Digite um n�mero real: ");
        vari�vel3= entrada.nextFloat();
        System.out.println("Digite um segundo n�mero real: ");
        vari�vel4= entrada.nextFloat();
        
        char caractere1;
        char caractere2;
        
        System.out.println("Digite um caractere: ");
        caractere1= entrada.next().charAt(0);
        System.out.println("Digite um segundo caractere: ");
        caractere2= entrada.next().charAt(0);
        
        System.out.println("Os n�mero inteiros informados foram: "+vari�vel1+" e "+vari�vel2);
        System.out.println("Os n�meros reais informados foram: "+vari�vel3+" e "+vari�vel4);
        System.out.println("Os caracteres informados foram: "+caractere1+" e "+caractere2);
    }
    
}
