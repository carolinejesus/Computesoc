package exerc�cio16;
public class Exerc�cio16 {
    public static void main(String[] args) {
       double sal�rio, c1, c2, juros1, juros2, resto;
       sal�rio = 1500.00;
       c1 = 200.00;
       c2 = 120.00;
       juros1 = 200.00 * 0.02;
       juros2 = 120.00 * 0.02;
       resto = sal�rio - (c1 + c2 + juros1 + juros2);
       System.out.println("O que sobra do sal�rio de Jo�o �: R$"+resto);
    }
}
