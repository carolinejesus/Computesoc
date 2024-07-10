
package ex17planeta;

import java.util.Scanner;

public class Ex17Planeta {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int terra, c�digo;
        double peso = 0.0;
        
        System.out.println("Informe seu peso (em kg): ");
        terra = input.nextInt();
        
        System.out.println("Digite o n�mero do planeta:");
        System.out.println("1. Merc�rio;");
        System.out.println("2. V�nus;");
        System.out.println("3. Marte;");
        System.out.println("4. J�pter;");
        System.out.println("5. Saturno;");
        System.out.println("6. Urano;");
        System.out.println("7. Netuno.");
        c�digo = input.nextInt();
        
        switch (c�digo){
            case 1 -> peso = terra * (3.7 / 9.8);
            case 2 -> peso = terra * (8.87 / 9.8);
            case 3 -> peso = terra * (3.71 / 9.8);
            case 4 -> peso = terra * (24.79 / 9.8);
            case 5 -> peso = terra * (10.44 / 9.8);
            case 6 -> peso = terra * (8.69 / 9.8);
            case 7 -> peso = terra * (11.15 / 9.8);
            default -> System.out.println("C�digo do planeta inv�lido!");
        }
        if (terra >= 1 && c�digo <= 7){
            System.out.println("O peso no planeta �: "+peso+"kg.");
        }
    }
    
}
