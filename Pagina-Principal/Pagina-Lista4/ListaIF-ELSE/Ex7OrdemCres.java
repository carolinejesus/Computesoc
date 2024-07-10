
package ex7ordemcres;

import java.util.Scanner;

public class Ex7OrdemCres {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Informe o primeiro número: ");
        num1 = input.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = input.nextInt();
        System.out.println("Informe o terceiro número: ");
        num3 = input.nextInt();
        
        
        if (num1 > num2) {
            int menor = num2;
            num2 = num1;
            num1 = menor;
        }
        if (num2 > num3){
            int menor = num3;
            num3 = num2;
            num2 = menor;
        }
        if (num1 > num2){
            int menor = num1;
            num2 = num1;
            num1 = menor;
        }
        System.out.print("A ordem crescente é:");
        System.out.print(" "+num1);
        System.out.print(","+num2);
        System.out.print(","+num3);
    }
}
