package Exercicio3;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rep = 0, idade;
        String sexo, nome;
        
        while (true){
        System.out.println("Digite seu nome: ");
        nome = input.nextLine();
        System.out.println("Idade: ");
        idade = input.nextInt();
        input.nextLine();
        System.out.println("Sexo: ");
        sexo = input.nextLine();
        
        if (idade == 0){
            break;
        }
        rep++;
        }
        System.out.println("Quantidade de repetições: "+rep);
    }
    
}
