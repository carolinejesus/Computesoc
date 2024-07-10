package exercpicio10;
import java.util.Scanner;
public class Exercpicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quociente;
        int resto;
        int numero;
        
        System.out.println("Digite um número inteiro: ");
        numero = input.nextInt();
        
        
        quociente = numero / 2;
        resto = numero % 2;
        
        System.out.println("O quociente da divisão por 2 é: "+ quociente);
        System.out.println("O resto da divisão é: "+ resto);
    }
    
}
