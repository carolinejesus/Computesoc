package exerc�cio9;
// esse foi o unico exerc�cio que fiz todas as vari�veis na m�o linha por linha
//porque nao tinha como fazer um scanner (ou tinha) mas eu fiz esse por �ltimo

public class Exerc�cio9 {

    public static void main(String[] args) {
       
       //mostrar na tela o nome de cada produto e quanto foi gasto com ele
       double Q, L, B, total;
       
        Q = 5 * 2.2;
        L = 3 * 1.8;
        B = 2 * 4.3;
        
        total = L + B + Q;
        
        System.out.println("A quantidade gasta na primeira compra em caf� foi R$"+Q+", em leite foi: R$"+L+" e a quantidade gasta em bolacha foi: R$"+B+". O total gasto na compra foi: R$"+total);
        //
        Q = 3 * 1.98;
        L = 5 * 2.1;
        B = 5 * 3.5;
        
        total = L + B + Q;
        
        System.out.println("A quantidade gasta na segunda compra em caf� foi R$"+Q+", em leite foi: R$"+L+" e a quantidade gasta em bolacha foi: R$"+B+". O total gasto na compra foi: R$"+total);
        //
        Q = 2 * 4.3;
        L = 3 * 2.25;
        B = 3 * 3;
        
        total = L + B + Q;
        
        System.out.println("A quantidade gasta na terceira compra em caf� foi R$"+Q+", em leite foi: R$"+L+" e a quantidade gasta em bolacha foi: R$"+B+". O total gasto na compra foi: R$"+total);
        //
        Q = 2 * 2;
        L = 10 * 1.6;
        B = 5 * 2.2;
        
        total = L + B + Q;
        
        System.out.println("A quantidade gasta na quarta compra em caf� foi R$"+Q+", em leite foi: R$"+L+" e a quantidade gasta em bolacha foi: R$"+B+". O total gasto na compra foi: R$"+total);
    }
    
}
