package Exercicio5;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double maior = 0;
        int altm = 0;
        double altt = 0;
        int m = 0;
        double altura;
        int gen, i;
        
        for (i = 0; i < 10; i++){
            System.out.println("Digite sua altura: ");
            altura = input.nextDouble();
            System.out.println("Digite o código do seu gênero: 1 - Masc; 2 - Fem;");
            gen = input.nextInt();
            
            if (altura > maior){
                maior = altura;
            }
            
            altt += altura;
            
            if (gen == 2){
                altm += altura;
                m++;
            }
        }
        double mediat = altt / 10;
        double mediam = 0;
        
        if (m > 0){
            mediam = altm / m;
        }
        System.out.println("Maior altura da turma: "+maior);
        System.out.println("Media de altura das mulheres: "+mediam);
        System.out.println("Media de altura da turma: "+mediat);
    }
    
}
