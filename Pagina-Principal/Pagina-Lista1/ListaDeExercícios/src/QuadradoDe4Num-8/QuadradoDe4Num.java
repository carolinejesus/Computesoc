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
            System.out.println("Digite o primeiro n�mero: ");
            double numero1 = scanner.nextDouble();
            
            System.out.println("Digite o segundo n�mero: ");
            double numero2= scanner.nextDouble();
            
            System.out.println("Digite o terceiro n�mero: ");
            double numero3= scanner.nextDouble();
            
            System.out.println("Digite o quarto n�mero: ");
            double numero4= scanner.nextDouble();
            
            double quadrado1= numero1 * numero1;
            double quadrado2= numero2 * numero2;
            double quadrado3= numero3 * numero3;
            double quadrado4= numero4 * numero4;
            
            int sum;
                    sum= (int) (quadrado1 + quadrado2 + quadrado3 + quadrado4);
            
            
            System.out.println("O quadrado do n�mero "+ numero1 +" �: "+quadrado1);
            System.out.println("O quadrado do n�mero "+ numero2 +" �: "+quadrado2);
            System.out.println("O quadrado do n�mero "+ numero3 +" �: "+quadrado3);
            System.out.println("O quadrado do n�mero "+ numero4 +" �: "+quadrado4);
            System.out.println("A soma dos quatro quadrados �: "+sum);
    }
    }
    
}
