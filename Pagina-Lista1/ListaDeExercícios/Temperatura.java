/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Temperatura;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double C, F;
       
            Scanner entrada = new Scanner (System.in);
            System.out.println("Digite a temperatura em Celsius: ");
            C = entrada.nextInt();
            F = (9 * C + 160)/5;
            
            System.out.println("A temperatura em Fahrenheit é: " + F);
    }
    
}
