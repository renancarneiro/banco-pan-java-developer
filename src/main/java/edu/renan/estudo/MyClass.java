package edu.renan.estudo;

public class MyClass{
    public static void main(String[] args){
        String primeiroNome = "Renan";
        String segundoNome = "Carneiro";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println("Seu nome completo é: "+ nomeCompleto);
    }
    public static String nomeCompleto(String nome, String sobrenome){
     return nome.concat(" ").concat(sobrenome);
    }
}