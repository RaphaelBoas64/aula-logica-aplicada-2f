
public class Main {
    public static void main(String[] args) {

        Pessoa adao = new Pessoa();
        Pessoa eva = new Pessoa();

        // definição do formato
        adao.nome = "Adão";
        adao.sobrenome = "silva";

        eva.nome = "Eva";
        eva.sobrenome = "silva";

        adao.falar();
        eva.falar();

        Pessoa qualquer = new Pessoa();
        // Declarar objeto
        Pessoa rainha;
        rainha = new Pessoa();
        rainha.nome = "Tina";
        rainha.sobrenome = "Tunner";
        System.out.println(rainha.falar("alto"));
        rainha.comer();
    }
}