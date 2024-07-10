package exercício5;

import java.util.Scanner;

public class Exercício5 {

    //programa que apresente a área, o perimetro;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int base, altura, area, perimetro;
        
        System.out.println("Digite a medida da base do retângulo: ");
        base = input.nextInt();
        System.out.println("Digite a medida da altura do retângulo: ");
        altura = input.nextInt();
        
        area = base * altura;
        perimetro = 2 * base + 2 * altura;
        
        System.out.println("Área do retângulo: "+area);
        System.out.println("Perímetro do retângulo: "+perimetro);
        
        
    }
    
}
