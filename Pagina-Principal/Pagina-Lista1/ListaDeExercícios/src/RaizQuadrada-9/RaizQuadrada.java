/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RaizQuadrada;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class RaizQuadrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            double numero= scanner.nextDouble();
            
            double RaizQuadrada= Math.sqrt(numero);
            
            System.out.println("A raiz aproximada do número: "+ numero + " é aproximadamente: "+RaizQuadrada);
        }
    }
    
}
