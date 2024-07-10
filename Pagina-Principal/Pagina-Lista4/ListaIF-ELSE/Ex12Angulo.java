package Ex12Angulo;

import java.util.Scanner;

public class Ex12Angulo {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int angulo;
        
        System.out.println("Informe o ângulo: ");
        angulo = input.nextInt();
        
        if (angulo < 90){
            System.out.println("O ângulo é: Agudo.");
        }
        if (angulo == 90){
            System.out.println("O ângulo é: Reto.");
        }
        if (angulo > 90){
            System.out.println("O ângulo é: Obtuso.");
        }
    }
    }
