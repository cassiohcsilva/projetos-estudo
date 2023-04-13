package br.com.treinar.sistema.notas;

import java.util.Scanner;

public class NotasAlunos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos alunos possuem na sala? ");
        int quantidadeAlunos = teclado.nextInt();
        int maiorNota = 0;

        int menorNota = 0;

        float totalNotas = 0;

        for (int i = 0; i < quantidadeAlunos; i++) {

            Scanner tecladoA = new Scanner(System.in);

            System.out.print("Informe a nota do Aluno " + (i+1) + ": ");
            int nota = tecladoA.nextInt();

            totalNotas += nota;

            if (i == 0 || maiorNota < nota) {
                maiorNota = nota;
            }
            if (i == 0 || menorNota > nota) {
                menorNota = nota;
            }

            if (nota >= 0 && nota <= 39) {
                System.out.println("Aluno Reprovado");
            } else if (nota >= 40 && nota <= 59) {
                System.out.println("Recuperação");
            } else if (nota >= 60 && nota <= 100) {
                System.out.println("PARABENS APROVADO!!!!");
            } else {
                System.out.println("NOTA INVÁLIDA!");
            }
        }

        System.out.println("A maior Nota é: " + maiorNota);
        System.out.println("A menor Nota é: " + menorNota);
        System.out.println("A media das notas é: " + totalNotas / quantidadeAlunos);

    }
}