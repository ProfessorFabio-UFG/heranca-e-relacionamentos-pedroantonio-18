public class Funcionario extends PessoaFisica {
    protected int matricula;
    protected double salario;
    protected String cargo;

    public Funcionario(String nome, String endereco, String telefone, String cpf, char sexo, int estadoCivil, int matricula, double salario, String cargo) {
        super(nome, endereco, telefone, cpf, sexo, estadoCivil);
        this.matricula = matricula;
        this.salario = salario;
        this.cargo = cargo;
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
            "\nMatrícula: " + this.matricula +
            "\nSalário: " + this.salario +
            "\nCargo: " + this.cargo
        );
    }
}
