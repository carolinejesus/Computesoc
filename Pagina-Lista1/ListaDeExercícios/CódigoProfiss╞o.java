
package Profissao;

import java.util.Scanner;

public class CódigoProfissão {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int prof;
        int id;
        double salário;
        //esse é da primeira página da lista
        System.out.println("Digite seu nome: ");
        nome= input.nextLine();
        System.out.println("Digite o código da sua profissão: ");
        prof= input.nextInt();
        System.out.println("Digite sua idade: ");
        id= input.nextInt();
        System.out.println("Digite quanto você recebe de salário: ");
        salário= input.nextDouble();
        
        System.out.println("O indivíduo informado foi: "+nome+ ", que possui "+id+ " anos; o código de sua profissão é: "+prof+ " e recebe de salário R$"+salário+" reais.");
    }
    
}
