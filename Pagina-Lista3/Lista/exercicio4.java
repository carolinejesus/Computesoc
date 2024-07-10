package Exercicio4;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] itens = {"Cachorro quente", "X Salada", "Bauru com ovo", "Refrigrante"};
        int[] codigos = {100, 101, 102, 103};
        double[] preços = {4.00, 6.00, 6.50, 2.00};
        
        System.out.println("Cardapio:");
        System.out.println("Código\tLanche\tPreço");
        for (int i = 0;  i < itens.length; i++){
            System.out.println(codigos[i] +"\t" + itens[i] + "\tR$"+preços[i]);
        }
        System.out.println("\nDigite o código do item desejado: ");
        int codigopedido = input.nextInt();
        
        System.out.println("Digite a quantidade: ");
        int quantidadepedido = input.nextInt();
        
        int j= -1;
        for (int i = 0; i < codigos.length; i++){
            if (codigos[i] == codigopedido){
            j = i;
            break;
        }
        }
        if (j != -1){
            double valort = preços[j] * quantidadepedido;
            System.out.println("\nItem pedido: "+itens[j]);
            System.out.println("Valor a ser pago: R$"+valort);
        } else {
            System.out.println("Cósigo de item inválido.");
        }
    }
    
}
