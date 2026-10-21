public class Aluno implements Identificavel {
    private String matricula;
    private String nome;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    @Override
    public String obterIdentificacao() {
        // Retorna a identificação contendo a matrícula e o nome
        return "Matrícula: " + this.matricula + ", Nome: " + this.nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}