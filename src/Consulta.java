public class Consulta {

    private Procedimento procedimento;
    private Animal animal;
    private Veterinario veterinario;
    private boolean atendida;
    private boolean validada;
    private String data;
    private int id;
    private int contador = 0;

    public Consulta(Procedimento procedimento, Animal animal, Veterinario veterinario, boolean atendida, boolean validada, String data, int id) {
        this.procedimento = procedimento;
        this.animal = animal;
        this.veterinario = veterinario;
        this.atendida = atendida;
        this.validada = validada;
        this.data = data;
        contador++;
        this.id = contador;
    }

    public void atender () {
        isValidada();
        System.out.println("");
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getData() {
        return data;
    }

    public int getId() {
        return id;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public boolean isAtendida() {
        return true;
    }

    public boolean isValidada() {
        return validar();
    }

    public boolean validar () {
        return isAtendida();
    }
}
