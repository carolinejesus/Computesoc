
package exe6menordosn;

import java.util.Scanner;

public class Exe6MenorDosN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, menor;
        System.out.println("Informe o primeiro n�mero: ");
        num1 = input.nextInt();
        System.out.println("Informe o segundo n�mero: ");
        num2 = input.nextInt();
        System.out.println("Informe o terceiro n�mero: ");
        num3 = input.nextInt();
        System.out.print("O menor n�mero �:");
        
        if (num1 <= num2 && num1 <= num3){
            menor = num1;
            System.out.println(" "+menor);
        }
        if (num2 <= num1 && num2 <= num3){
            menor = num2;
            System.out.println(" "+menor);
        }
        if (num3 <= num1 && num3 <= num2){
            menor = num3;
            System.out.println(" "+menor);
        }
    }
    }