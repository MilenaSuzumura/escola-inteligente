package com.trybe.java.escolainteligente;

import java.util.Scanner;

public class PessoaEstudante {

  /**
   * Método calcularIdadeEmDias.
   */
  public static int calcularIdadeEmDias(int anos, int meses, int dias) {
    int anosMeses = anos * 12;
    int mesesTotal = anosMeses + meses;
    int diasMeses = mesesTotal * 30;
    int diasTotais = diasMeses + dias;
    return diasTotais;
  };

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Qual o nome da Pessoa Estudante?");
    String nome = scanner.next();

    System.out.println("Qual a sua idade em anos, meses e dias?");
    System.out.print("anos:");
    int anos = Integer.parseInt(scanner.next());

    System.out.print("meses:");
    int meses = Integer.parseInt(scanner.next());

    System.out.print("dias:");
    int dias = Integer.parseInt(scanner.next());

    int totalDias = calcularIdadeEmDias(anos, meses, dias);

    System.out.println("A idade de" + nome + "em dias é" + totalDias);
  };
}