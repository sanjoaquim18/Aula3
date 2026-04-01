package FolhaPagamento;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.print("Matrícula: ");
        f.matricula = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        f.nome = sc.nextLine();

        System.out.print("Salário Bruto: ");
        f.salarioBruto = sc.nextDouble();

        f.calcularSalario();

        System.out.println("\n--- CONTRACHEQUE ---");
        System.out.println("Matrícula: " + f.matricula);
        System.out.println("Nome: " + f.nome);
        System.out.printf("Salário Bruto: R$ %.2f%n", f.salarioBruto);
        System.out.printf("INSS: R$ %.2f%n", f.inss);
        System.out.printf("Salário Líquido: R$ %.2f%n", f.salarioLiquido);

        sc.close();
    }
}
