/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício15;

import java.util.Scanner;

public class Exercício15 {
    public static void main(String[] args) {
    //receber o peso de uma pessoa
    //o novo peso se a pessoa engordar 15%
    //o novo peso se a pessoa emagrecer 20%
    
    Scanner p = new Scanner(System.in);
    double peso, perc, percent, emagreceu, engordou;
        System.out.println("Informe seu peso atual: ");
        peso = p.nextDouble();
        perc = peso * 0.15;
        percent = peso * 0.2;
        emagreceu = peso - percent;
        engordou = peso + perc;
        
        System.out.println("Seu peso caso engorde 15% vai ser de: "+engordou);
        System.out.println("Seu peso caso emagreça 20% será de: "+emagreceu);
    }
    
}
