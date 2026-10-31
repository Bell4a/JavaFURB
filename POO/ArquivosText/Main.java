import repositorio.*;

public class Main {

    public static void main(String[] args) {
        Arquivo arquivo = new Arquivo();
        arquivo.listarArquivos();
        arquivo.criarPastas();
        arquivo.deletarPastas();
        arquivo.deletarArquivo();
        
    }
}