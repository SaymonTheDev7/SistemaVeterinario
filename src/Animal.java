import java.util.ArrayList;

public abstract class Animal {

    private String nome;
    private String dataNascimento;
    private Cliente dono;
    private ArrayList <Consulta> consultas;

    public Animal(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        consultas = new ArrayList<>();
    }



    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }


    public Cliente getDono() {
        return dono;
    }

    public String adicionarConsulta ( Consulta consulta ) {

        if ( consultas == null ) {
            return "Consulta inválida";
        }

        for ( Consulta consultaa : consultas ) {
            if ( consultaa == consulta ) {
                return "Consulta já cadastrada";
            }
            else {
                consultas.add(consulta);
            }
        }

        return "Consulta cadastrada com sucesso.";
    }

    public String adicionarDono ( Cliente dono ) {

        if ( dono == null ) {
            return "Dono inválido";
        }

        if ( ! Cliente.getPets().equals(dono)) {
            return "Dono já cadastrado";
        }

        Veterinaria.adicionarCliente(dono);

        return "Dono cadastrado com sucesso.";
    }


    public void removerDono () {

        Veterinaria.removerCliente(dono);

    }
}
