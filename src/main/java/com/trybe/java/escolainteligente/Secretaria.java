package com.trybe.java.escolainteligente;

import java.util.Scanner;

public class Secretaria {

  /**
   * Método calcularMedia.
   */
  public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
    double soma = nota1 + nota2 + nota3 + nota4;
    return soma / 4;
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Qual o nome da Pessoa Estudante?\n");
    String nome = scanner.next();

    System.out.print("Avaliação 1:\n");
    double nota1 = Double.parseDouble(scanner.next());

    System.out.print("Avaliação 2:\n");
    double nota2 = Double.parseDouble(scanner.next());

    System.out.print("Avaliação 3:\n");
    double nota3 = Double.parseDouble(scanner.next());

    System.out.print("Avaliação 4:\n");
    double nota4 = Double.parseDouble(scanner.next());

    double media = calcularMedia(nota1, nota2, nota3, nota4);

    System.out.println("A média das notas de " + nome + " é " + media + ".");
  }
}
