
package ex5f1f2f3;

import java.util.Scanner;

public class Ex5F1F2F3 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num;
        System.out.println("Informe um número inteiro: ");
        num = n.nextInt();
        
        if ( num <= 10){
            System.out.println("F1");
        } else if (num <= 100) {
            System.out.println("F2");
        } else if (num > 100){
        System.out.println("F3");
    }
        }
}
