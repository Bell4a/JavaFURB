public class Aluno {

    Pessoa[] pessoas;
    int matricula;
    double nota;
    boolean aprovado;

    public double retornarNota() {
        return nota;
    }

    public boolean analisarNota() {
        if (nota >= 7) {
            return true;
        }
        return false;
    }
}
