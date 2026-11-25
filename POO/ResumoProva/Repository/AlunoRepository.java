package Repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Models.Aluno;

public class AlunoRepository {
    public ArrayList<Aluno> lerCsv() {
        // Criamos uma lista vazia de alunos
        ArrayList<Aluno> alunos = new ArrayList<>();

        try {
            // FileReader abre o arquivo CSV para leitura
            FileReader arquivo = new FileReader("alunos.csv");

            // BufferedReader permite ler o arquivo linha por linha
            BufferedReader leitor = new BufferedReader(arquivo);

            // Lê a primeira linha do arquivo
            // Essa linha contém o cabeçalho (matricula,nome)
            String linha = leitor.readLine();

            // Lê a próxima linha, que contém o primeiro aluno
            // Assim, ignoramos o cabeçalho
            linha = leitor.readLine();

            // Enquanto existir uma linha para ler, continua repetindo
            while (linha != null) {

                // Separa os dados da linha usando a vírgula
                // Cada informação será armazenada em uma posição do vetor
                String[] dados = linha.split(",");

                // Converte a matrícula de String para int
                int matricula = Integer.parseInt(dados[0]);

                // Pega o nome do aluno na segunda posição do vetor
                String nome = dados[1];

                // Cria um objeto Aluno utilizando os dados do CSV
                Aluno aluno = new Aluno(nome, matricula);

                // Adiciona o objeto Aluno dentro da lista
                alunos.add(aluno);

                // Lê a próxima linha do arquivo
                linha = leitor.readLine();
            }

            // Fecha o arquivo depois de terminar a leitura
            leitor.close();

        } catch (IOException e) {
            System.out.println("Erro ao ler CSV: " + e.getMessage());
        }
        // Retorna a lista contendo todos os alunos encontrados
        return alunos;
    }
}
