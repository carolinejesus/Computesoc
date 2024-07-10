
package exe16absord;

import java.util.Scanner;

public class Exe16AbsOrd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        
        System.out.println("Informe o ponto x: ");
        x = input.nextInt();
        input.nextLine();
        System.out.println("Informe o ponto y: ");
        y = input.nextInt();
        
        if (x >= 0 && y >= 0){
            System.out.println("O ponto está localizado no primeiro (1) quadrante.");
        } else if (x < 0 && y >= 0){
            System.out.println("O ponto está localizado no segundo (2) quadrante.");
        } else if (x < 0 && y < 0){
            System.out.println("O ponto está localizado no terceiro (3) quadrante.");
        } else if (x >= 0 && y < 0){
            System.out.println("O ponto está localizado no quarto (4) quadrante.");
        }
    }
    
}
