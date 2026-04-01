package Quests;
import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a matrícula: ");
        int matricula = sc.nextInt();
        sc.nextLine(); // limpar buffer

        System.out.print("Digite o nome completo: ");
        String nome = sc.nextLine();

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = sc.nextDouble();

        // Cálculos
        double inss = salarioBruto * 0.15;
        double salarioLiquido = salarioBruto - inss;

        // Saída (contracheque)
        System.out.println("\n----- CONTRACHEQUE -----");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome completo: " + nome);
        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Dedução INSS: R$ %.2f%n", inss);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        sc.close();
    }
}