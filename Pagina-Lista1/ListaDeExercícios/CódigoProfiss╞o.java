
package Profissao;

import java.util.Scanner;

public class C�digoProfiss�o {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int prof;
        int id;
        double sal�rio;
        //esse � da primeira p�gina da lista
        System.out.println("Digite seu nome: ");
        nome= input.nextLine();
        System.out.println("Digite o c�digo da sua profiss�o: ");
        prof= input.nextInt();
        System.out.println("Digite sua idade: ");
        id= input.nextInt();
        System.out.println("Digite quanto voc� recebe de sal�rio: ");
        sal�rio= input.nextDouble();
        
        System.out.println("O indiv�duo informado foi: "+nome+ ", que possui "+id+ " anos; o c�digo de sua profiss�o �: "+prof+ " e recebe de sal�rio R$"+sal�rio+" reais.");
    }
    
}
