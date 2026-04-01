package SituacaoAluno;

public class Aluno {

    String nome;
    double n1, n2, n3, media;
    String situacao;

    public void calcularMedia() {
        media = (n1 + n2 + n3) / 3;

        if (media >= 70) {
            situacao = "Aprovado";
        } else if (media < 40) {
            situacao = "Reprovado";
        } else {
            situacao = "Na final";
        }
    }
}
