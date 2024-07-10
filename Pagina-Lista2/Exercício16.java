package exercício16;
public class Exercício16 {
    public static void main(String[] args) {
       double salário, c1, c2, juros1, juros2, resto;
       salário = 1500.00;
       c1 = 200.00;
       c2 = 120.00;
       juros1 = 200.00 * 0.02;
       juros2 = 120.00 * 0.02;
       resto = salário - (c1 + c2 + juros1 + juros2);
       System.out.println("O que sobra do salário de João é: R$"+resto);
    }
}
