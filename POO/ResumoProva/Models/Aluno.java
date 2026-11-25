package Models;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Aluno extends Pessoa implements Exportar {

    private int matricula;

    public Aluno(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exportar() {

        // try é utilizado para tentar executar a gravação do arquivo
        // Caso aconteça algum erro, o catch irá tratar
        try {

            // FileOutputStream cria ou abre um arquivo para escrita binária
            // O nome do arquivo será formado pela matrícula do aluno
            // Exemplo: aluno_101.bin
            FileOutputStream arquivo = new FileOutputStream(
                    "arquivos/aluno_" + matricula + ".bin");

            // ObjectOutputStream permite gravar objetos inteiros
            // dentro do arquivo binário
            ObjectOutputStream objeto = new ObjectOutputStream(arquivo);

            // writeObject grava o objeto atual (este aluno) no arquivo
            // O this representa o próprio objeto Aluno
            objeto.writeObject(this);

            // Fecha o arquivo depois de terminar a gravação
            objeto.close();

            // Mostra uma mensagem confirmando a exportação
            System.out.println("Aluno exportado: " + getNome());

        } catch (IOException e) {

            // Caso aconteça algum erro na criação ou gravação do arquivo,
            // mostra a mensagem de erro
            System.out.println("Erro ao exportar: " + e.getMessage());
        }
    }
}
