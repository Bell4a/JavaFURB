package src;
import src.models.Aluno;
import src.models.Carro;
import src.models.Casa;
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

        Aluno aluno = new Aluno("Isabella", 18, 2849759);
        System.out.println("Nome: " + aluno.getNome() + " Idade: " + aluno.getIdade() + " Matrícula: " + aluno.getMatricula());

        Carro carro = new Carro("BYD", "Dolphin");
        carro.setAno(2025);
        carro.setPortas(4);
        carro.setMotor("k500");

        System.out.println("Dados: " + carro.exibirDados());

        Casa casa = new Casa();
        casa.setCep(20390000);
        casa.setValor(3000000);
        casa.setPossuiGaragem(true);
        casa.setQuantQuartos(4);

        
        

    }
}