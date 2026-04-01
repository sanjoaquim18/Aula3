package QCalculadora;

public class Calculadora {

    double n1, n2, resultado;

    public void somar() {
        resultado = n1 + n2;
    }

    public void subtrair() {
        resultado = n1 - n2;
    }

    public void dividir() {
        if (n2 != 0) {
            resultado = n1 / n2;
        } else {
            System.out.println("Erro: divisão por zero!");
        }
    }

    public void multiplicar() {
        resultado = n1 * n2;
    }
}