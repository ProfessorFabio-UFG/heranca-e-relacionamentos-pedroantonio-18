public class Loja {
    private static int topFuncionarios = -1;
    private static int topClientes = -1;
    private static int topFornecedores = -1;
    private static int size = 50;
    private String nome;
    private Funcionario[] funcionarios = new Funcionario[size];
    private Cliente[] clientes = new Cliente[size];
    private Fornecedor[] fornecedores = new Fornecedor[size];

    public Loja(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void empregarFuncionario(Funcionario funcionario) {
        if (topFuncionarios >= size - 1) {
            System.out.println("A lista de funcionários está cheia");
            return;
        }
        topFuncionarios++;
        funcionarios[topFuncionarios] = funcionario;
    }

    public void demitirFuncionario(Funcionario funcionario) {
        for (int i = 0; i < topFuncionarios; i++) {
            if (funcionarios[i] == funcionario) {
                funcionarios[i] = null;
                if (i == topFuncionarios) {
                    topFuncionarios--;
                }
                return;
            }
        } 
    }

    public void cadastrarCliente(Cliente cliente) {
        if (topClientes >= size - 1) {
            System.out.println("A lista de clientes está cheia");
            return;
        }
        topClientes++;
        clientes[topClientes] = cliente;
    }

    public void cadastrarFornecedor(Fornecedor fornecedor) {
        if (topFornecedores >= size - 1) {
            System.out.println("A lista de fornecedores está cheia");
            return;
        }
        topFornecedores++;
        fornecedores[topFornecedores] = fornecedor;
    }

    public void listarFuncionarios() {
        System.out.println("--- Lista de Funcionários ---");
        for (int i = 0; i < topFuncionarios; i++) {
            if (funcionarios[i] != null) {
                System.out.println(funcionarios[i].toString());
                System.out.println("---------------------------");
            }
        }
    }

    public void listarClientes() {
        System.out.println("--- Lista de Clientes ---");
        for (int i = 0; i < topClientes; i++) {
            System.out.println(clientes[i].toString());
            System.out.println("---------------------------");
        }
    }

    public void listarFornecedores() {
        System.out.println("--- Lista de Fornecedores ---");
        for (int i = 0; i < topFornecedores; i++) {
            System.out.println(fornecedores[i].toString());
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        Loja loja = new Loja("Nome");

        Funcionario func1 = new Funcionario(
                "Ana Oliveira", "Rua das Flores, 123", "11987654321", "123.456.789-00", 'F', 1, 1001, 3500.00,
                "Analista de Sistemas");

        Funcionario func2 = new Funcionario(
                "Bruno Santos", "Av. Paulista, 987", "11981234567", "987.654.321-11", 'M', 2, 1002, 4200.50,
                "Desenvolvedor Backend");

        Funcionario func3 = new Funcionario(
                "Carla Menezes", "Travessa Rio Branco, 45", "21991234567", "456.789.123-22", 'F', 0, 1003, 3800.75,
                "UX Designer");

        Funcionario func4 = new Funcionario(
                "Diego Souza", "Rua Central, 345", "31987654321", "789.123.456-33", 'M', 1, 1004, 5000.00,
                "Gerente de Projetos");

        Cliente cli1 = new Cliente(
                "João Silva",
                "Rua A, 123, São Paulo",
                "(11) 9999-1111",
                "123.456.789-01",
                'M',
                1,
                3500.00,
                "Esportes, Tecnologia",
                "Engenheiro");

        Cliente cli2 = new Cliente(
                "Maria Oliveira",
                "Av. B, 456, Rio de Janeiro",
                "(21) 8888-2222",
                "987.654.321-02",
                'F',
                2,
                4200.00,
                "Moda, Viagens",
                "Designer");

        Cliente cli3 = new Cliente(
                "Pedro Santos",
                "Rua C, 789, Belo Horizonte",
                "(31) 7777-3333",
                "456.789.123-03",
                'M',
                0,
                2800.00,
                "Música, Games",
                "Programador");

        Cliente cli4 = new Cliente(
                "Ana Costa",
                "Av. D, 101, Salvador",
                "(71) 6666-4444",
                "321.654.987-04",
                'F',
                1,
                5100.00,
                "Culinária, Literatura",
                "Chef");

        Fornecedor forn1 = new Fornecedor(
                "Tech Solutions Ltda",
                "Av. Tech, 1000, São Paulo",
                "(11) 2222-1111",
                "12.345.678/0001-01",
                "Tech Solutions",
                new String[] { "Computadores", "Monitores", "Teclados" });

        Fornecedor forn2 = new Fornecedor(
                "Alimentos Saborosos S/A",
                "Rua Sabor, 200, Campinas",
                "(19) 3333-2222",
                "98.765.432/0001-02",
                "Saborosos Alimentos",
                new String[] { "Arroz", "Feijão", "Macarrão" });



        loja.cadastrarCliente(cli1);
        loja.cadastrarCliente(cli2);
        loja.cadastrarCliente(cli3);
        loja.cadastrarCliente(cli4);

        loja.cadastrarFornecedor(forn1);
        loja.cadastrarFornecedor(forn2);

        loja.empregarFuncionario(func1);
        loja.empregarFuncionario(func2);
        loja.empregarFuncionario(func3);
        loja.empregarFuncionario(func4);

        loja.listarClientes();
        loja.listarFornecedores();
        loja.listarFuncionarios();

        loja.demitirFuncionario(func2);
        loja.listarFuncionarios();
    }
}