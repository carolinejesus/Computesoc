
package ex15idade;

import java.util.Scanner;

public class Ex15Idade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nadador;
        
        System.out.println("Informe a idade do nadador: ");
        nadador = input.nextInt();
        
        if (nadador >= 5 && nadador <= 10){
            System.out.println("Nadador infantil.");
        } else if (nadador >= 11 && nadador <= 17){
            System.out.println("Nadador juvenil.");
        } else if (nadador >= 18 && nadador <= 60){
            System.out.println("Nadador adulto.");
        } else if (nadador > 60){
            System.out.println("Nadador Senior.");
        }
        }
    }