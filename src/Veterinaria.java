import java.util.ArrayList;

public class Veterinaria {

    private static ArrayList <Cliente> clientes;
    private static ArrayList <Consulta> consultas;
    private static ArrayList <Animal> pets;
    private static ArrayList <Procedimento> procedimentos;
    private static ArrayList <Veterinario> veterinarios;

    public Veterinaria() {
        clientes = new ArrayList<>();
        consultas = new ArrayList<>();
        pets = new ArrayList<>();
        procedimentos = new ArrayList<>();
        veterinarios = new ArrayList<>();
    }



    public static String adicionarAnimal ( Animal animal ) {

        if ( pets == null ) {
            return "Animal inválido";
        }

        for ( Animal petss : pets ) {
            if ( petss == animal ) {
                return "Animal já cadastrado";
            }
            else {
                pets.add(animal);
            }
        }

        return "Animal cadastrado com sucesso.";

    }

    public static String removerAnimal ( Animal animal ) {

        if ( pets == null ) {
            return "Animal inválido";
        }

        for ( Animal petss : pets ) {
            if ( petss != animal ) {
                return "Animal não cadastrado";
            }
            else {
                pets.remove(animal);
            }
        }

        return "Animal removido com sucesso";

    }

    public static Animal buscarAnimal (String nome ) {

        for ( Animal animal : pets ) {
            if ( animal.getNome().equals(nome)) {
                return animal;
            }
        }

        return null;

    }

    public static String adicionarCliente ( Cliente cliente ) {

        if ( clientes == null ) {
            return "Cliente inválido";
        }

        for ( Cliente clientee : clientes ) {
            if ( clientee == cliente ) {
                return "Cliente já cadastrado";
            }
            else {
                clientes.add(cliente);
            }
        }

        return "Cliente cadastrado com sucesso.";
    }

    public static String removerCliente ( Cliente cliente ) {

        if ( clientes == null ) {
            return "Cliente inválido";
        }

        for ( Cliente clientee : clientes ) {
            if ( clientee != cliente ) {
                return "Cliente não cadastrado";
            }
            else {
                clientes.remove(cliente);
            }
        }

        return "Cliente removido com sucesso";

    }

    public static Cliente buscarCliente (String cpf ) {

        for ( Cliente cliente : clientes ) {
            if ( cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }

        return null;

    }

    public static String adicionarConsulta ( Consulta consulta ) {

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

    public static String removerConsulta ( Consulta consulta ) {

        if ( consultas == null ) {
            return "Consulta inválido";
        }

        for ( Consulta consultaa : consultas ) {
            if ( consultaa != consulta ) {
                return "Consulta não cadastrada";
            }
            else {
                consultas.remove(consulta);
            }
        }

        return "Consulta removida com sucesso";

    }

    public static Consulta buscarConsulta (int id) {

        for ( Consulta consulta : consultas ) {
            if ( consulta.getId() == id) {
                return consulta;
            }
        }

        return null;

    }
    public static String adicionarVeterinario ( Veterinario veterinario ) {

        if ( veterinarios == null ) {
            return "Veterinário inválido";
        }

        for ( Veterinario veterinarioo : veterinarios ) {
            if ( veterinarioo == veterinario ) {
                return "Veterinário já cadastrado";
            }
            else {
                veterinarios.add(veterinario);
            }
        }

        return "Veterinário cadastrado com sucesso.";

    }

    public static String removerVeterinario ( Veterinario veterinario ) {

        if ( veterinarios == null ) {
            return "Veterinario inválido";
        }

        for ( Veterinario veterinarioo : veterinarios ) {
            if ( veterinarioo != veterinario ) {
                return "Veterinário não cadastrado";
            }
            else {
                veterinarios.remove(veterinario);
            }
        }

        return "Veterinário removido com sucesso";

    }

    public static Veterinario buscarVeterinario (String cpf ) {

        for ( Veterinario veterinario : veterinarios ) {
            if ( veterinario.getCpf().equals(cpf)) {
                return veterinario;
            }
        }

        return null;

    }

    public static String adicionarProcedimento ( Procedimento procedimento ) {

        if ( procedimentos == null ) {
            return "Procedimento inválido";
        }

        for ( Procedimento procedimentoo : procedimentos ) {
            if ( procedimentoo == procedimento ) {
                return "Procedimento já cadastrado";
            }
            else {
                procedimentos.add(procedimento);
            }
        }

        return "Procedimento cadastrado com sucesso.";

    }

    public static String removerProcedimento ( Procedimento procedimento ) {

        if ( procedimentos == null ) {
            return "Procedimento inválido";
        }

        for ( Procedimento procedimentoo : procedimentos ) {
            if ( procedimentoo != procedimento ) {
                return "Procedimento não cadastrado";
            }
            else {
                procedimentos.remove(procedimento);
            }
        }

        return "Procedimento removido com sucesso";

    }

    public static Procedimento buscarProcedimento (String nome) {

        for ( Procedimento procedimento : procedimentos ) {
            if ( procedimento.getNome().equals(nome)) {
                return procedimento;
            }
        }

        return null;

    }

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public static ArrayList<Animal> getPets() {
        return pets;
    }

    public static ArrayList<Procedimento> getProcedimentos() {
        return procedimentos;
    }

    public static ArrayList<Veterinario> getVeterinarios() {
        return veterinarios;
    }
}
