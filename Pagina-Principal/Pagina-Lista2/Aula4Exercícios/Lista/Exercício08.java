package exercício08;
import java.util.Scanner;
public class Exercício08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double salario, vendas, total, porcentagem, vendass;
        
        System.out.println("Informe o salário mínimo: R$");
        salario = input.nextDouble();
        
        System.out.println("Informe a quantidade de vendas: ");
        vendas = input.nextDouble();
        
        System.out.println("Digite o valor das vendas: R$");
        vendass = input.nextDouble();
        
        porcentagem = (vendass * 5.0) / 100;
        total = salario * 2 + vendas * 150 + porcentagem;       
        
        System.out.println("O salário total ganho: R$ "+total);
        
    }
    
}
