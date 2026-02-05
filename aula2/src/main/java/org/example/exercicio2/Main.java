package org.example.exercicio2;

public class Main {
    public static void main(String[] args) {
        String nome = "Gustavo";
        double nota1 = 1;
        double nota2 = 3;
        double media = (nota1 + nota2)/2;

        if (media >= 7) {
            System.out.println("Parabens" +nome+ ",sua nota foi: " +media+ " você foi aprovado!");
        } else {
            System.out.println("Aluno(a): " +nome+ ",sua nota foi: " +media+ " você foi reprovado(a).");
        }


    }
}
