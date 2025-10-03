package com.mycaompany.exerciciossequenciais;

import java.util.Scanner;

/**
 *
 * @author raphael.rosas
 */
public class ExerciciosSequenciais {

    public static void main(String[] args) {

//        CalcularMediaPonderada();
//        CalcularDesconto();
        valorDolar();

    }
    static void CalcularMediaPonderada(){
        
        float n1, n2, n3, n4;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        n1 = scanner.nextFloat();
        System.out.println("Informe o segundo número: ");
        n2 = scanner.nextFloat();
        System.out.println("Informe o terceiro número: ");
        n3 = scanner.nextFloat();
        System.out.println("Informe o quarto número: ");
        n4 = scanner.nextFloat();
        
        float somaPonderada = (n1 * 1) + (n2 * 2) + (n3 * 3) + (n4 * 4);
        float somaPeso = 1 + 2 + 3 + 4;
        
        float mediaPonderada = somaPonderada/ somaPeso;
        
        System.out.println("A média ponderada é" + mediaPonderada);
        
        scanner.close();
            }
    
    static void CalcularDesconto(){
    
        Scanner scanner = new Scanner(System.in);
        
        double valor;
        double desconto = 0.09;
        
        System.out.println("Informe o valor do produto: ");
        valor = scanner.nextDouble();
        
        double valorDescontado = valor * desconto;
        double valorFinal = valor - valorDescontado;
        
        System.out.println("O valor final com o desconto é de " + valorFinal + " reais.");
        System.out.println("E o valor do desconto foi de: " + valorDescontado + " reais.");
        
        scanner.close();
                
    }
    
    static void PoupancaProgramada(){
        
        Scanner scanner = new Scanner(System.in);
        
        int aplicacaoMensal;
        int taxa;
        int numMeses;
        
        System.out.println("Informe o valor constante da aplicacao mensal: ");
        aplicacaoMensal = scanner.nextInt();
        System.out.println("Informe a taxa: ");
        taxa = scanner.nextInt();
        System.out.println("Informe o numero de meses: ");
        numMeses = scanner.nextInt();
        
        scanner.close();
        
    }
    
    static void valorDolar(){
    
        Scanner scanner = new Scanner(System.in);
        
        double qntDolar;
        double cotacaoDolar;
        double valorReais;
        
        System.out.println("Quantos dolares voce possui guardado?");
        qntDolar = scanner.nextDouble();
        System.out.println("Qual a cotacao do dolar?");
        cotacaoDolar = scanner.nextDouble();
        
        valorReais = qntDolar * cotacaoDolar;
        
        System.out.println("O cofre possui R$" + valorReais);
    
    }
    
}