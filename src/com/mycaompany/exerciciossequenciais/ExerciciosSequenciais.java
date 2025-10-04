package com.mycaompany.exerciciossequenciais;

import java.util.Scanner;

/**
 *
 * @author raphael.rosas
 */
public class ExerciciosSequenciais {

    public static void main(String[] args) {

//        CalcularMediaPonderada();
//        catetoHipotenusa();
//        CalcularDesconto();
//        calcularRaizes();
//        valorDolar();
//        kilometragem();
//        equacaoLinear();
//        tempCelsius();

    }
//    exercicio 1
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
    
//    exercicio 2
    static void catetoHipotenusa(){
        
        Scanner scanner = new Scanner(System.in);
        
        double catetoA;
        double catetoB;
        double calculoCatetos;
        double hipotenusa;
        
        System.out.println("Informe o primeiro cateto do triangulo: ");
        catetoA = scanner.nextInt();
        
        System.out.println("Informe o segundo cateto do triangulo: ");
        catetoB = scanner.nextInt();
        
        calculoCatetos = Math.pow(catetoA, 2) + Math.pow(catetoB, 2) ;
        hipotenusa = Math.sqrt(calculoCatetos);
        
        
        System.out.println("A hipotenusa é: " + hipotenusa);
        
        scanner.close();
    }
    
//    exercicio 3 
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
    
//    exercicio 4
    static void calcularRaizes(){
        
       Scanner scanner = new Scanner(System.in);
        
        double deltaB;
        double deltaA;
        double deltaC;
        double delta;
        double x1;
        double x2;
       
        System.out.println("Para a equacao ax² + bx + c, ");        
        System.out.println("Para calcular o delta, informe o valor de a: ");
        deltaA = scanner.nextDouble();
        
        System.out.println("Para calcular o delta, informe o valor de b: ");
        deltaB = scanner.nextDouble();
        
        System.out.println("Para calcular o delta, informe o valor de c: ");
        deltaC = scanner.nextDouble();
        
        delta = Math.pow(deltaB, 2) - 4 * deltaA * deltaC;
        x1 = ((-deltaB + Math.sqrt(delta)) / (2 * deltaA));
        x2 = ((-deltaB - Math.sqrt(delta)) / (2 * deltaA));
        
        System.out.println("O valor do seu x1, com o delta positivo é: " + x1);
        System.out.println("O valor do seu x1, com o delta negativo é: " + x2);
       
       scanner.close();
    }
    
//    exercicio 5
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
    
//    exercicio 6
    static void valorDolar(){
    
        Scanner scanner = new Scanner(System.in);
        // Definicao de variaveis
        double qntDolar = 0.0d;
        double cotacaoDolar;
        double valorReais;
        
        System.out.println("Quantos dolares voce possui guardado?");
        qntDolar = scanner.nextDouble();
        System.out.println("Qual a cotacao do dolar?");
        cotacaoDolar = scanner.nextDouble();
        
        valorReais = qntDolar * cotacaoDolar;
        
        System.out.println("O cofre possui R$" + valorReais);
    
    }
    
//    exercicio 7
    static void kilometragem(){
        double km;
        double kmh;
        double tempoLevado;
        double metrosSegundos;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a distancia ate o local (em km): ");
        km = scanner.nextDouble();
        
        System.out.println("Informe a quantos km/h pretende ir: ");
        kmh = scanner.nextDouble();
        
        tempoLevado = km / kmh;
        metrosSegundos = kmh / 3.6;
        
        System.out.println("Você levara " + tempoLevado + " para chegar ao local.");
        System.out.println("A velocidade em metros/segundo sera de: " + metrosSegundos);
        
        scanner.close();
    }
    
//    exercicio 8
    static void equacaoLinear(){
        
        double a;
        double b;
        double c;
        double d;
        double e;
        double f;
        double denominador;
        double x;
        double y;
        
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Informe o coeficiente 'a': ");
        a = scanner.nextDouble();
        
        System.out.println("Informe o coeficiente 'b': ");
        b = scanner.nextDouble();
        
        System.out.println("Informe o coeficiente 'c': ");
        c = scanner.nextDouble();
        
        System.out.println("Informe o coeficiente 'd': ");
        d = scanner.nextDouble();
        
        System.out.println("Informe o coeficiente 'e': ");
        e = scanner.nextDouble();
        
        System.out.println("Informe o coeficiente 'f': ");
        f = scanner.nextDouble();
        
        denominador = (a * e) - (b * d);
        x = ((c * e) - (b * f)) / denominador;
        y = ((a * f) - (c * d)) / denominador;
        
        System.out.println("O valor de 'x' eh: " + x);
        System.out.println("O valor de 'y' eh: " + y);
        
        scanner.close();
    }
    
//    exercicio 9
    static void tempCelsius(){
        double celsius;
        double f;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("De a temperatura em celsius:");
        celsius = scanner.nextDouble();
        
        f = ((9 * celsius + 160 ) / 5);
        
        System.out.println("A temperatura em Celsius eh: " + celsius);
        System.out.println("A temperatura em Fahrenheit eh: " + f);
        
    }
    
}