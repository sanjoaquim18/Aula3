package SituacaoAluno;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.print("Nome: ");
        a.nome = sc.nextLine();

        System.out.print("Nota 1: ");
        a.n1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        a.n2 = sc.nextDouble();

        System.out.print("Nota 3: ");
        a.n3 = sc.nextDouble();

        a.calcularMedia();

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Aluno: " + a.nome);
        System.out.printf("Média: %.2f%n", a.media);
        System.out.println("Situação: " + a.situacao);

        sc.close();
    }
}
