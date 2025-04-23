public class Cliente extends PessoaFisica {
    protected double renda;
    protected String interesses;
    protected String profissao;

    public Cliente(String nome, String endereco, String telefone, String cpf, char sexo, int estadoCivil, double renda, String interesses, String profissao) {
        super(nome, endereco, telefone, cpf, sexo, estadoCivil);
        this.renda = renda;
        this.interesses = interesses;
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return (
            "Nome: " + this.nome +
            "\nEndereço: " + this.endereco +
            "\nTelefone: " + this.telefone +
            "\nCPF: " + this.cpf +
            "\nSexo: " + this.sexo +
            "\nEstado Civil: " + this.estadoCivil +
            "\nRenda: " + this.renda +
            "\nInteresses: " + this.interesses +
            "\nProfissão: " + this.profissao
        );
    }
}
