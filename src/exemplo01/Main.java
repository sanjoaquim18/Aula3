package exemplo01;

public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa ();

        System.out.println("Antiga idade: "+p.idade);
        p.fazAniversario();

        System.out.println("Atual idade: "+p.idade);

    }
}