package aula36;

public class Teste {
    public static void main(String[] args) {
        Contato contato = new Contato();

        contato.setNome("Tyrion");
        // contato.setEndereco("Kings Landing");
        //contato.setTelefone("11 99999-9999");

        // relacionamento tem-um endereço
        Endereco end = new Endereco();
        end.setNomeRua("Rua Game of Thrones");
        end.setNumero("n/a");
        end.setComplemento("");
        end.setCidade("Kings Landing");
        end.setEstado("Westeros");
        end.setCep("9999999");

        contato.setEndereco(end);

        // relacionamento tem-um telefone
        Telefone tel = new Telefone();
        tel.setTipo("celular");
        tel.setDdd("81");
        tel.setNumero("91234-5678");

        Telefone tel2 = new Telefone();
        tel2.setTipo("celular");
        tel2.setDdd("81");
        tel2.setNumero("98765-4321");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel;
        telefones[1] = tel2;

        // contato.setTelefone(tel);
        contato.setTelefones(telefones);

        System.out.println(contato.getNome());
        // System.out.println(contato.getTelefone());

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

        /* if (contato != null && contato.getTelefone() != null) {
            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        } */

        if (contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }

    }   
}
