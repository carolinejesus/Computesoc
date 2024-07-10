package exercício14;

import java.util.Scanner;

public class Exercício14 {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        double horas, minutos, segundos, seghoras, segmin, segtotais, dia, resto;
        
        System.out.println("Informe que horas são: ");
        horas = input.nextDouble();
        System.out.println("Informe quantos minutos são: ");
        minutos = input.nextDouble();
        System.out.println("Informe os segundos: ");
        segundos = input.nextDouble();
        
        seghoras = horas * 3600;
        segmin = minutos * 60;
        segtotais = seghoras + segmin + segundos;
        dia = 24 * 3600;
        resto = dia - segtotais;
        
        System.out.println("Restam " +resto+ " segundos para o final do dia.");
    }
    
}
