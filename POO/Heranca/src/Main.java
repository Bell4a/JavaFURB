package src;
import src.models.Aluno;
import src.models.Carro;
import src.models.Gato;


public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.setNome("Jiji");
        gato.setCor("Preto");
        gato.setIdade(3);
        gato.setTamanho(25);

        /*System.out.println("Nome: " + gato.getNome());
        System.out.println("Cor: " + gato.getCor());
        System.out.println("Idade: " + gato.getIdade());
        System.out.println("Tamanho: " + gato.getTamanho());*/

        Aluno aluno = new Aluno("Isabella");
        aluno.setIdade(19);
        aluno.setMatricula(202564);

        System.out.println("Nome: " + aluno.getNome() + " Idade: " + aluno.getIdade() + " Matrícula: " + aluno.getMatricula());

        Carro carro = new Carro();
        carro.setAno(2025);
        carro.setMarca("BYD");
        carro.setModelo("Dolphin");
        carro.setPortas(4);

        System.out.println("Dados: " + carro.exibirDados());


    }
}