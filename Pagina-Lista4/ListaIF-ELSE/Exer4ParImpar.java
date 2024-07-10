
package exer4parimpar;

import java.util.Scanner;

public class Exer4ParImpar {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num;
        
        System.out.println("Informe um número inteiro: ");
        num = n.nextInt();
        if (num % 2 == 1){
            System.out.println("O número é ímpar.");
        } else{ System.out.println("O número é par.");
        }
    }
}