
package exercicio13;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        //programa que determine quantos segundos j� se passaram desde o come�o do dia;
        Scanner input = new Scanner(System.in);
        double horas, minutos, segundos, seghoras, segmin, segtotais;
        
        System.out.println("Informe que horas s�o: ");
        horas = input.nextDouble();
        System.out.println("Informe quantos minutos s�o: ");
        minutos = input.nextDouble();
        System.out.println("Informe os segundos: ");
        segundos = input.nextDouble();
        
        seghoras = horas * 3600;
        segmin = minutos * 60;
        segtotais = seghoras + segmin + segundos;
        
        System.out.println("Se passaram "+ segtotais + " segundos desde o in�cio do dia.");  
    }
    
}
