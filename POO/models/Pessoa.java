//classe
public class Pessoa {

    //objetos
    private String nome;
    private int idade;
    private double altura;
    private boolean maiorIdade;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isMaiorIdade() {
        return maiorIdade;
    }

    public void setMaiorIdade(boolean maiorIdade) {
        this.maiorIdade = maiorIdade;
    }
 
}
