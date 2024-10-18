public class Procedimento {

    private boolean cachorro;
    private boolean gato;
    private String nome;
    private double preco;

    public Procedimento(boolean cachorro, boolean gato, String nome, double preco) {
        this.cachorro = cachorro;
        this.gato = gato;
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isCachorro() {
        return true;
    }

    public boolean isGato() {
        return true;
    }
}

