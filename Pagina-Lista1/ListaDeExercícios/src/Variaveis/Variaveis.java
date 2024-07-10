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
        int variável1;
        int variável2;
        // esse é d aprimeira página da lista
        System.out.println("Digite um número inteiro: ");
        variável1= entrada.nextInt();
        System.out.println("Digite um segundo número inteiro: ");
        variável2= entrada.nextInt();
        
        float variável3;
        float variável4;
        
        System.out.println("Digite um número real: ");
        variável3= entrada.nextFloat();
        System.out.println("Digite um segundo número real: ");
        variável4= entrada.nextFloat();
        
        char caractere1;
        char caractere2;
        
        System.out.println("Digite um caractere: ");
        caractere1= entrada.next().charAt(0);
        System.out.println("Digite um segundo caractere: ");
        caractere2= entrada.next().charAt(0);
        
        System.out.println("Os número inteiros informados foram: "+variável1+" e "+variável2);
        System.out.println("Os números reais informados foram: "+variável3+" e "+variável4);
        System.out.println("Os caracteres informados foram: "+caractere1+" e "+caractere2);
    }
    
}
