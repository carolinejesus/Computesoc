package exercício6;

import java.util.Scanner;

public class Exercício6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c, f;
        
        System.out.println("Digite uma temperatura em Celcius: ");
        c = input.nextDouble();
        
        f = 9.0 / 5.0 * c + 32;
        
        System.out.println("A temperatura em Fahrenheit é: "+f);
    }
    
}
