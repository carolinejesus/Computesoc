package ex8aumentoempresa;

import java.util.Scanner;

public class Ex8AumentoEmpresa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, cat;
        int atual, sal;
        
        System.out.println("Digite seu nome: ");
        nome = input.nextLine();
        System.out.println("Digite qual sua categoria em caixa alta: ");
        cat = input.nextLine();
        System.out.println("Digite qual seu sal�rio atual: ");
        atual = input.nextInt();
        
        if (cat.equals("A")|| cat.equals ("H")){
            sal = (atual / 100) * 10 + atual;
            System.out.println("O funcion�rio: "+nome+" da categoria "+cat+", passar� a receber: R$"+sal+" de sal�rio.");     
        }
        if (cat.equals("B") || cat.equals("D") || cat.equals("E")){
            sal = (atual / 100) * 15 + atual;
            System.out.println("O funcion�rio "+nome+" da categoria "+cat+", passar� a receber: R$"+sal+" de sal�rio.");
        }
        if (cat.equals("C") || cat.equals("F")){
            sal = (atual / 100) * 25 + atual;
            System.out.println("O funcion�rio "+nome+" da categoria "+cat+", passar� a receber: R$"+sal+" de sal�rio.");
        }
        if (cat.equals("G")){
            sal = (atual / 100) * 30 + atual;
            System.out.println("O funcion�rio "+nome+" da categoria "+cat+", passar� a receber: R$"+sal+" de sal�rio.");
        }
}
}
