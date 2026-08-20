public class Aluno {

    private Pessoa[] pessoas;
    private int matricula;
    private double nota;
    private boolean aprovado;

    public double retornarNota() {
        return nota;
    }

    public boolean analisarNota() {
        if (nota >= 7) {
            return true;
        }
        return false;
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
