package ex13estoque;

import java.util.Scanner;

public class Ex13Estoque {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int est1, est2, est3;
        String prod1, prod2, prod3;
        
        System.out.println("Informe o produto 1: ");
        prod1 = input.nextLine();
        System.out.println("Informe a quantidade em estoque: ");
        est1 = input.nextInt();
        input.nextLine();
        System.out.println("Informe o produto 2: ");
        prod2 = input.nextLine();
        System.out.println("Informe a quantidade em estoque: ");
        est2 = input.nextInt();
        input.nextLine();
        System.out.println("Informe o produto 3: ");
        prod3 = input.nextLine();
        System.out.println("Informe a quantidade em estoque: ");
        est3 = input.nextInt();
        
        if(est1 < 30){
            System.out.println("O estoque de "+prod1+" está baixo.");
        }
        if (est2 < 30){
            System.out.println("O estoque de "+prod2+" está baixo.");
        }
        if (est3 < 30){
            System.out.println("O estoque de "+prod3+" está baixo.");
        }
        if (est3 <= 100 && est2 <= 100 && est1 <= 100 && est1 > 30 && est2 > 30 && est3 > 30){
            System.out.println("O estoque está cheio!");
        }
        }
}
