//classe
public class Pessoa {

    //objetos
    String nome;
    int idade;
    double altura;
    boolean maiorIdade;

    public String obterNome() {
        return nome;
    }

    public int obterIdade() {
        return idade;
    }

    public double obterAltura() {
        return altura;
    }

    public boolean retornarMaiorIdade() {
        if(idade >= 18) {
            return true;
        }
        return false;
    }

    public String retornarMensagem() {
        return (nome + "possui" + idade + "anos");
    }

    public int acrescentarIdade() {
        int soma = idade + 1;
        return soma;
    }
 
    public void inserirNome(String nome) {
        if (nome.contains(s: "01")) {
            System.out.println("Nome inválido");
        }
        this.nome = nome;
    }
}
