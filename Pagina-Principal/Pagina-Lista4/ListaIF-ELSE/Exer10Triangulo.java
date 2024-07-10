/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer10triangulo;

import java.util.Scanner;

/**
 *
 * @author CFJin
 */
public class Exer10Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z;
        
        System.out.println("Informe o valor de X: ");
        x = input.nextInt();
        System.out.println("Informe o valor de Y: ");
        y = input.nextInt();
        System.out.println("Informe o valor de Z: ");
        z = input.nextInt();
        
        if (x + y > z && x + z > y && y + z > x){
          if (x == y && y == z){
            System.out.println("É um triângulo Equilátero.");
        } else if (x == y || x == z || y == z){
              System.out.println("O triângulo é Isócele.");
        } else {
              System.out.println("O triângulo é Escaleno.");
        }
        } else {
            System.out.println("Não é um triângulo.");
        }
        
    }
}
