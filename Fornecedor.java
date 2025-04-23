public class Fornecedor extends PessoaJuridica {
    protected String[] produtos;

    public Fornecedor(String nome, String endereco, String telefone, String cnpj, String razaoSocial, String[] produtos) {
        super(nome, endereco, telefone, cnpj, razaoSocial);
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        String info = 
            "Nome: " + this.nome +
            "\nEndereço: " + this.endereco +
            "\nTelefone: " + this.telefone +
            "\nCNPJ: " + this.cnpj +
            "\nRazão Social: " + this.razaoSocial +
            "\nProdutos: ";

        for (int i = 0; i < produtos.length; i++) {
            info += "\n     Produto " + (i + 1) + ": " + produtos[i];
        }

        return info;
    }
}
