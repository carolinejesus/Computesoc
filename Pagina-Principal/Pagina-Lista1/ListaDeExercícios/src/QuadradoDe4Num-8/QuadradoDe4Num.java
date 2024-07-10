/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuadradoDe4Num;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class QuadradoDe4Num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();
            
            System.out.println("Digite o segundo número: ");
            double numero2= scanner.nextDouble();
            
            System.out.println("Digite o terceiro número: ");
            double numero3= scanner.nextDouble();
            
            System.out.println("Digite o quarto número: ");
            double numero4= scanner.nextDouble();
            
            double quadrado1= numero1 * numero1;
            double quadrado2= numero2 * numero2;
            double quadrado3= numero3 * numero3;
            double quadrado4= numero4 * numero4;
            
            int sum;
                    sum= (int) (quadrado1 + quadrado2 + quadrado3 + quadrado4);
            
            
            System.out.println("O quadrado do número "+ numero1 +" é: "+quadrado1);
            System.out.println("O quadrado do número "+ numero2 +" é: "+quadrado2);
            System.out.println("O quadrado do número "+ numero3 +" é: "+quadrado3);
            System.out.println("O quadrado do número "+ numero4 +" é: "+quadrado4);
            System.out.println("A soma dos quatro quadrados é: "+sum);
    }
    }
    
}
