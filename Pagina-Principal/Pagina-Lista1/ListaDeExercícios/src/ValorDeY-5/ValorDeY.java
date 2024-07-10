/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ValorDeY;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class ValorDeY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.println("Algoritmo para calcular y = 3x + 2");
            System.out.println("X= ");
            double x = scanner.nextDouble();
            
            double y = 3 * x + 2;
            
            System.out.println("Y= " + y);
        }
    }
    
}
