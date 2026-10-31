package repositorio;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArquivoTxt {
    public void criarArquivoTxt(String path, String conteudo) {
        File arquivo = new File(path);
        try {
            PrintWriter pw = new PrintWriter(arquivo);
            pw.println(conteudo);
            pw.close();
        } catch (Exception e) {
            System.out.println("Erro");
        }
    }

    public void lerArquivoTxt(String path) {
        File arquivo = new File(path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(arquivo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}