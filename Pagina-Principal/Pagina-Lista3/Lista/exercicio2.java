package Exercicio2;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        
        System.out.println("Digite dois números inteiros: ");
        x = Integer.parseInt(input.nextLine());
        y = Integer.parseInt(input.nextLine());
        
        while (y > x){ 
            System.out.println("Digite dois números inteiros: ");
            x = Integer.parseInt(input.nextLine());
            y = Integer.parseInt(input.nextLine());
            int soma = x + y;
            System.out.println("A soma é: "+soma);
        }
    }
}
