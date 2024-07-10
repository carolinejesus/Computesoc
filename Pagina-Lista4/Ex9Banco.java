
package ex9banco;

import java.util.Scanner;

public class Ex9Banco {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int atual, valor, novo;
        String operação;
        
        System.out.println("Informe o número da conta: ");
        input.nextLine();
        
        System.out.println("Informe o saldo atual: ");
        atual = input.nextInt();
        input.nextLine();
        
        System.out.println("Didite 1 para depósito ou 2 para saque: ");
        operação = input.nextLine();
        
        System.out.println("Informe o valor da operação: ");
        valor = input.nextInt();
        
        if (operação.equals("1")){
            novo = atual + valor;
            System.out.println("Saldo atual da conta: "+novo);
        }
        if (operação.equals("2")){
            novo = atual - valor;
            System.out.println("Saldo atual: "+novo);
        }
        novo = atual - valor;
        if (novo < 0){
            System.out.println("Conta estourada.");
        }
    }
    }
