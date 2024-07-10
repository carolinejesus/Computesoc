package Exercicio1;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        
      System.out.println("Digite dois número inteiros: ");
            x = Integer.parseInt(input.nextLine());
            y = Integer.parseInt(input.nextLine());
            
        while (x != y){
            System.out.println("Digite dois números inteiros: ");
            x = Integer.parseInt(input.nextLine());
            y = Integer.parseInt(input.nextLine());
    }
    }
    
}
