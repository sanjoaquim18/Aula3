package Quests;
import java.util.Scanner;
public class AlunoFinal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double n3 = sc.nextDouble();

        // Cálculo da média
        double media = (n1 + n2 + n3) / 3;

        // Verificação
        String situacao;

        if (media >= 7.0) {
            situacao = "Aprovado";
        } else if (media < 4.0) {
            situacao = "Reprovado";
        } else {
            situacao = "Está na final";
        }

        // Saída
        System.out.println("\n----- RESULTADO -----");
        System.out.println("Aluno: " + nome);
        System.out.printf("Média: %.2f%n", media);
        System.out.println("Situação: " + situacao);

        sc.close();
    }
}