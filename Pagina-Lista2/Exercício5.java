package exerc�cio5;

import java.util.Scanner;

public class Exerc�cio5 {

    //programa que apresente a �rea, o perimetro;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int base, altura, area, perimetro;
        
        System.out.println("Digite a medida da base do ret�ngulo: ");
        base = input.nextInt();
        System.out.println("Digite a medida da altura do ret�ngulo: ");
        altura = input.nextInt();
        
        area = base * altura;
        perimetro = 2 * base + 2 * altura;
        
        System.out.println("�rea do ret�ngulo: "+area);
        System.out.println("Per�metro do ret�ngulo: "+perimetro);
        
        
    }
    
}
