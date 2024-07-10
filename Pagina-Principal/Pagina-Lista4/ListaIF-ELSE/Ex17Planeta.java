
package ex17planeta;

import java.util.Scanner;

public class Ex17Planeta {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int terra, código;
        double peso = 0.0;
        
        System.out.println("Informe seu peso (em kg): ");
        terra = input.nextInt();
        
        System.out.println("Digite o número do planeta:");
        System.out.println("1. Mercúrio;");
        System.out.println("2. Vênus;");
        System.out.println("3. Marte;");
        System.out.println("4. Júpter;");
        System.out.println("5. Saturno;");
        System.out.println("6. Urano;");
        System.out.println("7. Netuno.");
        código = input.nextInt();
        
        switch (código){
            case 1 -> peso = terra * (3.7 / 9.8);
            case 2 -> peso = terra * (8.87 / 9.8);
            case 3 -> peso = terra * (3.71 / 9.8);
            case 4 -> peso = terra * (24.79 / 9.8);
            case 5 -> peso = terra * (10.44 / 9.8);
            case 6 -> peso = terra * (8.69 / 9.8);
            case 7 -> peso = terra * (11.15 / 9.8);
            default -> System.out.println("Código do planeta inválido!");
        }
        if (terra >= 1 && código <= 7){
            System.out.println("O peso no planeta é: "+peso+"kg.");
        }
    }
    
}
