package aula42;

public final class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    private String telefoneCelular;

    public Pessoa() {}

    public Pessoa(String nome, String endereco, String telefone, String cpf, String telefoneCelular) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.telefoneCelular = telefoneCelular;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefoneCelular() {
        return telefoneCelular;
    }
    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    // Método abstrato
    // public abstract String obterEtiquetaEndereco();

    // public abstract void exibirEtiquetaEndereco();
}
