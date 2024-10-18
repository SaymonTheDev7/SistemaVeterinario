public class Gato extends Animal {

    private String tipoPelagem;
    private boolean arisco;

    public Gato(String nome, String dataNascimento, Cliente dono, String tipoPelagem, boolean arisco) {
        super(nome, dataNascimento, dono);
        this.tipoPelagem = tipoPelagem;
        this.arisco = arisco;
    }

    public String getTipoPelagem() {
        return tipoPelagem;
    }

    public boolean isArisco() {
        return arisco;
    }
}
