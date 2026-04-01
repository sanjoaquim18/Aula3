package FolhaPagamento;

public class Funcionario {

    int matricula;
    String nome;
    double salarioBruto;
    double inss;
    double salarioLiquido;

    public void calcularSalario() {
        inss = salarioBruto * 0.15;
        salarioLiquido = salarioBruto - inss;
    }
}

}
