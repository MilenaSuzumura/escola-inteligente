package com.trybe.java.escolainteligente;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Portaria {
  /**
   * Método emitirRelatorio.
   */
  public static void emitirRelatorio(int qtdFundamental1, int qtdFundamental2, int qtdMedio) {
    int somaTotal = qtdFundamental1 + qtdFundamental2 + qtdMedio;
    float pFundamental1 = (float) qtdFundamental1 / somaTotal * 100;
    float pFundamental2 = (float) qtdFundamental2 / somaTotal * 100;
    float pMedio = (float) qtdMedio / somaTotal * 100;

    BigDecimal bd1 = new BigDecimal(pFundamental1).setScale(1,  RoundingMode.FLOOR);
    double fun1 = bd1.doubleValue();
    BigDecimal bd2 = new BigDecimal(pFundamental2).setScale(1, RoundingMode.FLOOR);
    double fun2 = bd2.doubleValue();
    BigDecimal bd3 = new BigDecimal(pMedio).setScale(1, RoundingMode.FLOOR);
    double medi = bd3.doubleValue();

    System.out.println("----- Quantidade -----");
    System.out.println("Ensino Fundamental I: " + qtdFundamental1);
    System.out.println("Ensino Fundamental II: " + qtdFundamental2);
    System.out.println("Ensino Médio: " + qtdMedio);
    System.out.println("\n----- Percentual -----");
    System.out.println("Ensino Fundamental I: " + fun1 + "%");
    System.out.println("Ensino Fundamental II: " + fun2 + "%");
    System.out.println("Ensino Médio: " + medi + "%");
    System.out.println("\nTOTAL: " + somaTotal);
  }

  public static void coletarInformacoes() {
    short escolha;
    int fundamental1 = 0;
    int fundamental2 = 0;
    int medio = 0;

    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Registrar o acesso de pessoa estudante");
      System.out.println("2 - Finalizar o acesso e emitir o relatório");

      escolha = scanner.nextShort();

      switch (escolha) {
        case 1:
          System.out.print("Entre com a idade da pessoa estudante:\n");

          short idade = scanner.nextShort();

          if (idade <= 10) {
            System.out.println("Pessoa estudante do Ensino Fundamental I, catraca liberada!");
            fundamental1++;
          } else if (idade <= 14 && idade >= 11) {
            System.out.println("Pessoa estudante do Ensino Fundamental II, catraca liberada!");
            fundamental2++;
          } else if (idade >= 15) {
            System.out.println("Pessoa estudante do Ensino Médio, catraca liberada!");
            medio++;
          } else {
            System.out.println("Idade incorreta");
          }
          break;
        case 2:

          break;
        default:
          System.out.println("Entre com uma opção válida!");
      }
    } while (escolha != 2);

    if (fundamental1 + fundamental2 + medio != 0) {
      emitirRelatorio(fundamental1, fundamental2, medio);
    }
  }
}
