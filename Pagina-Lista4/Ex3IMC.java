
package ex3imc;

import java.util.Scanner;

public class Ex3IMC {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso, altura, imc;
        
        System.out.println("Informe o peso: ");
        peso = input.nextDouble();
        System.out.println("Informe a altura em centímetros: ");
        altura = input.nextDouble();
        
        altura = altura /100;
        imc = peso / (altura * altura);
        
        System.out.println("O imc é: "+imc);
        
        if (imc < 20){
            System.out.println("Abaixo do peso.");
        } else if (imc >= 20 && imc <=24.99){
            System.out.println("Peso normal.");
        } else if (imc >= 25 && imc <=30){
            System.out.println("Sobrepeso.");
        } else if (imc >30){
            System.out.println("Obeso.");
        }
        }
}
