
package ex1quilowatt;

import java.util.Scanner;

public class Ex1Quilowatt {

    public static void main(String[] args) {
        double quilowatt, pre�o, contad, contal, perc;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o pre�o por quilowatt: ");
        pre�o = input.nextDouble();
        System.out.println("Informe quantos quilowatts: ");
        quilowatt = input.nextDouble();
        
        contad = quilowatt * pre�o;
        perc = contad * 10 / 100;
        contal = contad + perc;
            System.out.println("O valor pago em dia ser� de: R$"+contad+". Caso contr�rio, o valor pago em atraso ser� de R$"+contal);

        if (quilowatt >70){
            System.out.println("Consumo elevado de energia.");
        }else{
            System.out.println("Voc� � um consumidor consciente!");
        }
    }
    }
