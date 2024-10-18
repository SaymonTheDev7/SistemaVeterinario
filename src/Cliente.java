import java.util.ArrayList;

public class Cliente extends Pessoa {

    private static ArrayList <Animal> pets;
    public Cliente(String cpf, String nome, String telefone) {
        super(cpf, nome, telefone);
        pets = new ArrayList<>();
    }

    public String adicionarPet (Animal pet) {

        if ( pets == null ) {
            return "Pet inválido";
        }

        for ( Animal petss : pets ) {
            if ( petss == pet ) {
                return "Pet já cadastrado";
            }
            else {
                pets.add(pet);
            }
        }

        return "Pet cadastrado com sucesso.";


    }

    public String removerPet (Animal pet) {

        if ( pets == null ) {
            return "Pet inválido";
        }

        for ( Animal petss : pets ) {
            if ( petss != pet ) {
                return "Pet não cadastrado";
            }
            else {
                pets.remove(pet);
            }
        }

        return "Pet removido com sucesso";
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public String getTelefone() {
        return super.getTelefone();
    }

    public static ArrayList<Animal> getPets() {
        return pets;
    }
}
