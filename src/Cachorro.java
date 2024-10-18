public class Cachorro extends Animal {

    private String raca;
    private boolean adestrado;
    public Cachorro(String nome, String dataNascimento, Cliente dono, String raca, boolean adestrado) {
        super(nome, dataNascimento, dono);
        this.raca = raca;
        this.adestrado = adestrado;
    }

    public String getRaca() {
        return raca;
    }

    public boolean isAdestrado() {
        return adestrado;
    }
}
