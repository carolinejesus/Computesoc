
package ex11hor�rio;

import java.util.Scanner;

public class Ex11Hor�rio {

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
        System.out.println("Hor�rio acrescido de 1 segundo �: "+hora+"h"+minuto+"m"+segundo+"s.");
    }
    
}
