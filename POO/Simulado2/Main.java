public class Main {
    public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente("Carlos Silva");

            // Criando investimentos
            Ativo tesouro = new TesouroDireto(1000.0, 10.0); // Investiu 1000, rende 10% ao ano (= 100)
            Ativo acao = new Acao(30, 60.0, 10.0); // 30 cotas a R$ 60,00 = R$ 1800,00 investidos. 30 cotas * R$ 10,00 de dividendo = R$ 300,00

            // Adicionando à carteira
            cliente.adicionarAtivo(tesouro);
            cliente.adicionarAtivo(acao);

            // Exibindo resultados
            System.out.println("Cliente: " + cliente.getNome());
            System.out.println("Total Investido: R$ " + cliente.calcularValorInvestido());
            System.out.println("Total de Rendimentos: R$ " + cliente.calcularRendimentoCarteira());

        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
