/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formulário;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Formulário {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nome;
        String endereço;
        int numero;
        
        System.out.println("Digite seu nome: ");
        nome=entrada.nextLine();
        
        System.out.println("Digite seu endereço: ");
        endereço=entrada.nextLine();
        
        System.out.println("Digite seu número de telefone: ");
        numero=entrada.nextInt();
        
        System.out.println("Seu nome é "+ nome +", reside no endereço: "+ endereço +", com número de telefone: "+ numero);
    }
    
}
