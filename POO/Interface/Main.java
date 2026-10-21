public class Main {
    public static void main(String[] args) {
        // Criação de um quadrado de lado 5[cite: 4]
        Quadrado quadrado = new Quadrado(5);

        // Apresenta a área do quadrado[cite: 4]
        System.out.println("A área do quadrado com lado 5 é: " + quadrado.calcular());
    
        // Criação de objectos das duas classes[cite: 5]
        Pagavel contaAgua = new ContaAgua(15.0, 5.50);
        Pagavel contaLuz = new ContaLuz(120.0, 0.75);

        // Apresentação dos valores a pagar[cite: 5]
        System.out.println("Valor a pagar pela Conta de Água: " + contaAgua.calcularValorPagar());
        System.out.println("Valor a pagar pela Conta de Luz: " + contaLuz.calcularValorPagar());

        // Criação de um objecto de cada classe[cite: 6]
        Imprimivel relatorio = new Relatorio("Relatório de Vendas Anual");
        Imprimivel contrato = new Contrato(2026);

        // Testando a impressão dos dados dos objectos[cite: 6]
        relatorio.imprimir();
        contrato.imprimir();

        Descontavel produto = new Produto(200.0, 15.0); // Preço 200, 15% de desconto (= 30.0)
        Descontavel servico = new Servico(50.0, 10, 10.0); // 50 por hora, 10 horas (= 500), 10% de desconto (= 50.0)

        System.out.println("Valor do desconto do Produto: R$ " + produto.calcularDesconto());
        System.out.println("Valor do desconto do Serviço: R$ " + servico.calcularDesconto());


        Identificavel aluno = new Aluno("2026A123", "Beatriz Lima");
        Identificavel funcionario = new Funcionario("F9876", "João Mendes");

        // Apresentação das suas identificações[cite: 8]
        System.out.println(aluno.obterIdentificacao());
        System.out.println(funcionario.obterIdentificacao());

        // Criação de objectos das duas classes[cite: 9]
        Autenticavel usuario = new Usuario("Ana", "12345");
        Autenticavel admin = new Administrador("admin_root", "admin@2026");

        // Testando situações de senha correta e incorreta[cite: 9]
        System.out.println("--- Testando Usuário ---");
        System.out.println("Tentativa com senha errada ('9999'): " + usuario.autenticar("9999")); // Deve retornar false[cite: 9]
        System.out.println("Tentativa com senha certa ('12345'): " + usuario.autenticar("12345")); // Deve retornar true[cite: 9]

        System.out.println("\n--- Testando Administrador ---");
        System.out.println("Tentativa com senha errada ('12345'): " + admin.autenticar("12345")); // Deve retornar false[cite: 9]
        System.out.println("Tentativa com senha certa ('admin@2026'): " + admin.autenticar("admin@2026")); // Deve retornar true[cite: 9]
    }
}