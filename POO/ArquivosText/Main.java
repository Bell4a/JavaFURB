import repositorio.*;

public class Main {

    public static void main(String[] args) {
        Arquivo arquivo = new Arquivo();
        //arquivo.listarArquivos();
        arquivo.criarPastas();
        //arquivo.deletarPastas();
        //arquivo.deletarArquivo();
        
        ArquivoBinario arquivo2 = new ArquivoBinario();
        arquivo2.ler("A");
        arquivo2.gravar("Teste");
        arquivo2.ler("nomeArquivo");
        arquivo2.gravar("dados.dat");
        
        ArquivoBinario arquivo3 = new ArquivoBinario();
        arquivo3.copiarArquivo("Origem", "Desino");

        ArquivoBinario arquivo6 = new ArquivoBinario();
        arquivo6.gravarFuncionario("funcionario.bin", 102, "Carlos", 4500.50, true);

        ArquivoBinario arquivo7 = new ArquivoBinario();
        arquivo7.gravarProdutos("produtos.bin", 1234, "Produto1", 200.50);
        arquivo7.gravarProdutos("produtos.bin", 2345, "Produto2", 300);
        arquivo7.gravarProdutos("produtos.bin", 3456, "Produto3", 400);
        arquivo7.gravarProdutos("produtos.bin", 4567, "Produto4", 500);
        arquivo7.gravarProdutos("produtos.bin", 5678, "Produto5", 600);

        ArquivoBinario arquivo8 = new ArquivoBinario();
        arquivo8.gravarEmpresa("relatorio.bin", "Empresa1", 50000, 10000000, true, 1950);
    }
}
