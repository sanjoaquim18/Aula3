package QCalculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculadora c = new Calculadora();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n--- CALCULADORA ---");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            if (opcao == 0) break;

            System.out.print("Número 1: ");
            c.n1 = sc.nextDouble();

            System.out.print("Número 2: ");
            c.n2 = sc.nextDouble();

            if (opcao == 1) c.somar();
            else if (opcao == 2) c.subtrair();
            else if (opcao == 3) c.dividir();
            else if (opcao == 4) c.multiplicar();
            else System.out.println("Opção inválida!");

            System.out.println("Resultado: " + c.resultado);
        }

        sc.close();
    }
}