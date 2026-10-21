package models;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<Ativo> carteira;

    public Cliente(String nome) {
        setNome(nome);
        this.carteira = new ArrayList<>();
    }

    public void adicionarAtivo(Ativo ativo) {
        if (ativo == null) {
            throw new IllegalArgumentException("Valor para o campo ativo está incorreto");
        }
        this.carteira.add(ativo);
    }

    public void removerAtivo(Ativo ativo) {
        if (ativo == null) {
            throw new IllegalArgumentException("Valor para o campo ativo está incorreto");
        }
        if (this.carteira.isEmpty()) {
            throw new IllegalStateException("A carteira não possui nenhum ativo para ser removido.");
        }
        if (!this.carteira.contains(ativo)) {
            throw new IllegalArgumentException("O ativo informado não pertence à carteira do cliente.");
        }
        this.carteira.remove(ativo);
    }

    public double calcularRendimentoCarteira() {
        if (this.carteira.isEmpty()) {
            return 0.0;
        }
        double totalRendimento = 0.0;
        for (Ativo ativo : this.carteira) {
            totalRendimento += ativo.calcularRendimento();
        }
        return totalRendimento;
    }

    public double calcularValorInvestido() {
        if (this.carteira.isEmpty()) {
            return 0.0;
        }
        double totalInvestido = 0.0;
        for (Ativo ativo : this.carteira) {
            totalInvestido += ativo.calcularValorInvestido();
        }
        return totalInvestido;
    }

    public ArrayList<Ativo> getCarteira() {
        return carteira;
    }

    public void setCarteira(ArrayList<Ativo> carteira) {
        if (carteira == null) {
            throw new IllegalArgumentException("Valor para o campo carteira está incorreto");
        }
        this.carteira = carteira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Valor para o campo nome está incorreto");
        }
        this.nome = nome;
    }
}
