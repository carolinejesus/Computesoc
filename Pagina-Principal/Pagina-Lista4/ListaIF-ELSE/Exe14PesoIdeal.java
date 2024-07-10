
package exe14pesoideal;

import java.util.Scanner;

public class Exe14PesoIdeal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura, pesoideal, aux;
        String a;
        
        System.out.println("Informe sua altura em cm: ");
        altura = input.nextDouble();
        input.nextLine();
        System.out.println("Informe seu gênero, sendo (F) para Feminino e (M) para Masculino: ");
        a = input.nextLine();

        aux = altura / 100;
        
        switch (a) {
            case "F" -> {
                pesoideal = (62.1 * aux - 44.7);
                System.out.println("Seu peso ideal é: "+pesoideal);
            }
            case "M" -> {
                pesoideal = (72.7 * aux - 58);
                System.out.println("O seu peso ideal é: "+pesoideal);
            }
            default -> System.out.println("Opção inválida.");
        }
    }
}
