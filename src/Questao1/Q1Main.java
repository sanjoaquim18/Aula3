package Questao1;
import java.util.Scanner;
//b. Depois, o programa deve processar o desconto do INSS, que é 15% do salário bruto,
//e o salário líquido é a diferença entre o salário bruto e a dedução do INSS.
//
//c. Por fim, exibir na tela o seu contracheque, cujo formato é dado a seguir
//• Matrícula:
//• Nome completo:
//• Salário Bruto:
//• Dedução INSS:
//• Salário Líquido:
public class Q1Main {

    public static void main(String[] args) {

        Folhamensal fm = new Folhamensal();
        Scanner sc = new Scanner(System.in);

        // 2. Requisição para o usuário digitar os dados
        System.out.println("Digite sua matrícula: ");
        fm.matricula = sc.nextInt();
        System.out.println("Digite seu nome: ");
        fm.nomeCompleto = sc.nextLine();
        System.out.println("Digite o salário bruto: ");
        fm.salarioBruto = sc.nextDouble();

        // 3. Realização da conta do INSS e do Salário Líquido
        double descontoInss = salarioBruto * deducaoInss;
        salarioLiquido = salarioBruto - descontoInss;

        //Impressão dos dados
        System.out.println("\n--- CONTRACHEQUE ---");
        System.out.println("Matrícula: "+matricula);
        System.out.println("Nome completo: "+nomeCompleto);
        System.out.printf("Salário Bruto: R$ %.2f\n ",salarioBruto);
        System.out.printf("Dedução do INSS: R$ %.2f\n ",descontoInss);
        System.out.printf("Salário Líquido: R$ %.2f\n ",salarioLiquido);





    }

}
