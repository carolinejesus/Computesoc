
package ex9banco;

import java.util.Scanner;

public class Ex9Banco {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int atual, valor, novo;
        String opera��o;
        
        System.out.println("Informe o n�mero da conta: ");
        input.nextLine();
        
        System.out.println("Informe o saldo atual: ");
        atual = input.nextInt();
        input.nextLine();
        
        System.out.println("Didite 1 para dep�sito ou 2 para saque: ");
        opera��o = input.nextLine();
        
        System.out.println("Informe o valor da opera��o: ");
        valor = input.nextInt();
        
        if (opera��o.equals("1")){
            novo = atual + valor;
            System.out.println("Saldo atual da conta: "+novo);
        }
        if (opera��o.equals("2")){
            novo = atual - valor;
            System.out.println("Saldo atual: "+novo);
        }
        novo = atual - valor;
        if (novo < 0){
            System.out.println("Conta estourada.");
        }
    }
    }
