package Exercicio1;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        
      System.out.println("Digite dois n�mero inteiros: ");
            x = Integer.parseInt(input.nextLine());
            y = Integer.parseInt(input.nextLine());
            
        while (x != y){
            System.out.println("Digite dois n�meros inteiros: ");
            x = Integer.parseInt(input.nextLine());
            y = Integer.parseInt(input.nextLine());
    }
    }
    
}
