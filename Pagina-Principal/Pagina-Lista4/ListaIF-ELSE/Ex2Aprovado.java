
package ex2aprovado;

import java.util.Scanner;

public class Ex2Aprovado {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p1, p2, t1;
        System.out.println("Digite a nota da prova 1: ");
        p1 = input.nextDouble();
        System.out.println("Digite a nota da prova 2: ");
        p2 = input.nextDouble();
        System.out.println("Digite a nota do trabalho: ");
        t1 = input.nextDouble();
       // System.out.println("Digite a frequência do aluno: ");
        //f = input.nextDouble();

        if (p1 >= 6 || p2 >= 6 && t1 >= 7) {
            System.out.println("Parabéns, você foi aprovado!");
        }else{
            System.out.println("Infelizmente, você não foi aprovado.");
        }
    }
    }