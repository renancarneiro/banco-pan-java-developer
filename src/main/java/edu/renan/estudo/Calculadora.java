package edu.renan.estudo;

public class Calculadora {
    public static void main(String[] args){
    double primeiroNumero = 2;
    double segundoNumero = 10.5;
    System.out.println("A soma dos dois números é: " + somar(primeiroNumero, segundoNumero));
    System.out.println("A multiplicação dos dois números é: " + multiplicar(primeiroNumero, segundoNumero));
    System.out.println("A divisão entre os dois números é: " + dividir(primeiroNumero, segundoNumero));
    System.out.println("A subtração entre os dois números é:  " + subtrair(primeiroNumero,segundoNumero));
    }

    public static double somar(double a, double b){
        return  a + b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static double dividir(double a, double b){
        return a / b;
    }

    public static double subtrair(double a, double b){
        return a - b;
    }



}
