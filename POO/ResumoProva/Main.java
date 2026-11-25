import java.io.File;
import java.util.ArrayList;

import Models.Aluno;
import Repository.AlunoRepository;

public class Main {
    public static void main(String[] args) {
        // Cria um objeto da classe AlunoRepository
        // Ele será responsável por fazer a leitura do arquivo CSV
        AlunoRepository repository = new AlunoRepository();

        // Chama o método lerCsv() para ler o arquivo
        // e armazenar todos os alunos dentro de uma lista
        ArrayList<Aluno> alunos = repository.lerCsv();

        // Cria um objeto File para representar a pasta "arquivos"
        File pasta = new File("arquivos");

        // Cria a pasta caso ela ainda não exista
        // mkdirs() cria os diretórios necessários
        pasta.mkdirs();

        // Percorre todos os alunos que estão armazenados na lista
        // A cada repetição, a variável aluno representa um aluno da lista
        for (Aluno aluno : alunos) {

            // Chama o método exportar() do aluno atual
            // Cada aluno será gravado em seu próprio arquivo binário
            aluno.exportar();

        }

        // Mostra uma mensagem quando terminar de percorrer a lista
        System.out.println("Exportação finalizada!");

        // Iterator
        /*
         * // Cria um Iterator para percorrer a lista
         * Iterator<Aluno> it = alunos.iterator();
         * 
         * // Enquanto existir um próximo aluno
         * while (it.hasNext()) {
         * 
         * // Pega o próximo aluno da lista
         * Aluno aluno = it.next();
         * 
         * // Exporta o aluno para um arquivo binário
         * aluno.exportar();
         * }
         * 
         * System.out.println("Exportação finalizada!");
         */
    }
}
