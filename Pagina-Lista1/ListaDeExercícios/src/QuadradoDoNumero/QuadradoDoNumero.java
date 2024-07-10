/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuadradoDoNumero;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class QuadradoDoNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int numero1;
        int sum;
        
        System.out.println("Insira um número: ");
        numero1= input.nextInt();
        
        sum=numero1*numero1;
        
        System.out.println("O quadrado do numero "+numero1+ " é: "+sum);
    }
    
}
