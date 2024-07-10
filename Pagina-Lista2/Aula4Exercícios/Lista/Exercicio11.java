package exercicio11;

import java.util.Scanner;

public class Exercicio11 {

    //programa que calcule quantos segundos, minutos e segundos tem um filme.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int segundos, horas, minutos, seg;
        
        System.out.println("Informe quantos segundos possui o vídeo: ");        
        segundos = input.nextInt();
        
        horas = segundos / 3600;
        minutos = (segundos % 3600) / 60;
        seg = segundos % 60;
        
        System.out.println("O filme tem a duração de "+horas+"h"+minutos+"m"+seg+"s.");
        
    }
    
}
