package Quests;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {

            // Menu
            System.out.println("\n--- CALCULADORA ---");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando...");
                break;
            }

            // Entrada dos números
            System.out.print("Digite o primeiro número: ");
            double n1 = sc.nextDouble();

            System.out.print("Digite o segundo número: ");
            double n2 = sc.nextDouble();

            double resultado = 0;

            // Operações
            if (opcao == 1) {
                resultado = n1 + n2;
                System.out.println("Resultado: " + resultado);

            } else if (opcao == 2) {
                resultado = n1 - n2;
                System.out.println("Resultado: " + resultado);

            } else if (opcao == 3) {
                if (n2 != 0) {
                    resultado = n1 / n2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero!");
                }

            } else if (opcao == 4) {
                resultado = n1 * n2;
                System.out.println("Resultado: " + resultado);

            } else {
                System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
