package exercício7;
import java.util.Scanner;
public class Exercício7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double qtipo1, qtipo2, qtipo3, somac, somac2, somac3, somat;
        
        System.out.println("Informe a quantidade do sorvete tipo 1: ");
        qtipo1 = input.nextDouble();
        
        System.out.println("Informe a quantidade do sorvete tipo 2: ");
        qtipo2 = input.nextDouble();
        
        System.out.println("Informe a quantidade do sorvete tipo 3: ");
        qtipo3 = input.nextDouble();
        
        somac = qtipo1 * 1.50;
        somac2 = qtipo2 * 2.00;
        somac3 = qtipo3 * 0.75;
        
        somat = somac + somac2 + somac3;
        
        System.out.println("O valor arrecadado do sorvete tipo 1 foi: R$ "+somac);
        System.out.println("O valor arrecadado do sorvete tipo 2 foi: R$ "+somac2);
        System.out.println("O valor arrecadado do sorvete tipo 3 foi: R$ "+somac3);
        System.out.println("O valor total arrecadado com os três tipos foi: R$ "+somat);
        
        
    }
    
}
