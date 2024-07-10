
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alunolages
 */
public class ConsumoCombustível {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Informe a distância percorrida em km: ");
            double distânciaPercorrida = scanner.nextDouble();
            
            System.out.println("Informe o volume de combustível consumido (em litros): ");
            double volumeCombustível = scanner.nextDouble();
            
            double consumoMedio= distânciaPercorrida / volumeCombustível;
            
            System.out.println("O volume médio de combústível é " + consumoMedio + "km/l");
    }
    }
}
