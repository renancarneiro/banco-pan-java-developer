package edu.renan.estudo;
public class BoletimEstudantil {
    public static void main(String[] args) {
        double primeiraNota = 6;
        double segundaNota = 6;
        double media = (primeiraNota + segundaNota)/2;

        if (media >= 7)
            System.out.println("Aluno aprovado com a média "+ media);
        else if (media == 6)
            System.out.println("Aluno reprovado com a media "+ media +" pode fazer a recuperação!");
        else
            System.out.println("Aluno reprovado com a média "+ media);

    }
}
