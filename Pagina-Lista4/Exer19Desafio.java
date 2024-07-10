
package exer19desafio;

import java.util.Scanner;

public class Exer19Desafio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia, mes, ano, max = 0;
        
        System.out.println("Informe o dia: ");
        dia = input.nextInt();
        System.out.println("Informe o mês: ");
        mes = input.nextInt();
        System.out.println("Informe o ano: ");
        ano = input.nextInt();
        
        boolean datav = true;
        
        if (ano < 0 || ano > 9999){
            System.out.println("Ano inválido.");
            datav = false;
        }
        if (mes < 1 || mes > 12){
        System.out.println("Mês inválido.");
        datav = false;
        }
        
        switch (mes){
            case 1, 3, 5, 7, 8, 10, 12 -> max = 31;
            case 4, 6, 9, 11 -> max = 30;
            case 2 -> {
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
                    max = 29;
                } else {
                    max = 28;
                }
        }
        }
        if (dia < 1 || dia > max){
            System.out.println("Dia fora do intervalo permitido para o mês informado.");
            datav = false;
        }
        if (datav) {
        System.out.println("A data informada foi: "+dia+"/"+mes+"/"+ano);
    }
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println("O ano é bissexto.");
        }
    }
    
}
