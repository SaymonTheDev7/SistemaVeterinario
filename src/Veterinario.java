import java.util.ArrayList;

public class Veterinario extends Pessoa {

    private static ArrayList <Consulta> consultas;
    private static ArrayList <Procedimento>  procedimentos;
    public Veterinario(String cpf, String nome, String telefone) {
        super(cpf, nome, telefone);
        consultas = new ArrayList<>();
        procedimentos = new ArrayList<>();
    }

    public static boolean adicionarConsulta ( Consulta consulta ) {

        if ( consultas == null ) {
            return false;
        }

        for ( Consulta consultaa : consultas) {
            if ( consultaa == consulta ) {
                return false;
            }
        }

        for ( Consulta consultaa : consultas) {
            if ( ! procedimentos.equals(consultaa.getProcedimento()) ) {
                return false;
            }
        }

        for ( Consulta consultaa : consultas) {
            if ( procedimentos.equals(consultaa.getVeterinario()) ) {
                return false;
            }
        }

        consultas.add(consulta);
        return true;

    }

    public String adicionarProcedimento (  Procedimento procedimento ) {

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

    public static String atenderConsulta (Consulta consulta ) {

        for ( Consulta consultaa : consultas) {
            if ( ! consultas.equals(consultaa.getId())) {
                return "Consulta não encontrada";
            }

            if ( consultaa.getVeterinario() != consulta.getVeterinario()) {
                System.out.println("Consulta não pertence a este veterinário");
            }
        }

        consulta.isAtendida();
        return "Consulta atendida com sucesso";

    }

    public String removerProcedimento ( Procedimento procedimento ) {

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

    public ArrayList<Procedimento> getProcedimentos() {
        return procedimentos;
    }

    public ArrayList<Consulta> getConsultass() {
        return consultas;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }
}
