
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alunolages
 */
public class ConsumoCombust�vel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Informe a dist�ncia percorrida em km: ");
            double dist�nciaPercorrida = scanner.nextDouble();
            
            System.out.println("Informe o volume de combust�vel consumido (em litros): ");
            double volumeCombust�vel = scanner.nextDouble();
            
            double consumoMedio= dist�nciaPercorrida / volumeCombust�vel;
            
            System.out.println("O volume m�dio de comb�st�vel � " + consumoMedio + "km/l");
    }
    }
}
