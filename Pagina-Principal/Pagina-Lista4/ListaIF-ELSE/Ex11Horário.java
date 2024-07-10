
package ex11horário;

import java.util.Scanner;

public class Ex11Horário {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hora, minuto, segundo;
        
        System.out.println("Informe a hora: ");
        hora = input.nextInt();
        System.out.println("Informe os minutos: ");
        minuto = input.nextInt();
        System.out.println("Informe os segundos: ");
        segundo = input.nextInt();
        
        segundo++;
        
        if (segundo >= 60){
            segundo = 0;
            minuto++;
        }
        if (minuto >= 60){
            minuto = 0;
            hora++;
        } 
        if (hora >= 24){
            hora = 0;
        }
        System.out.println("Horário acrescido de 1 segundo é: "+hora+"h"+minuto+"m"+segundo+"s.");
    }
    
}
