
package ex1quilowatt;

import java.util.Scanner;

public class Ex1Quilowatt {

    public static void main(String[] args) {
        double quilowatt, preço, contad, contal, perc;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o preço por quilowatt: ");
        preço = input.nextDouble();
        System.out.println("Informe quantos quilowatts: ");
        quilowatt = input.nextDouble();
        
        contad = quilowatt * preço;
        perc = contad * 10 / 100;
        contal = contad + perc;
            System.out.println("O valor pago em dia será de: R$"+contad+". Caso contrário, o valor pago em atraso será de R$"+contal);

        if (quilowatt >70){
            System.out.println("Consumo elevado de energia.");
        }else{
            System.out.println("Você é um consumidor consciente!");
        }
    }
    }
