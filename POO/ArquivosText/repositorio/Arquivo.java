package repositorio;
import java.io.File;

public class Arquivo {
    public void criarPastas() {
        File pasta = new File("./nova_pasta");
        if (!pasta.exists()) {
            pasta.mkdir();
        } else {
            System.out.println("O diretório já existe");
        }
    }

    /*public void deletarPastas() {
        File pasta = new File("./nova_pasta");
        if (pasta.exists()) {
            pasta.delete();
        }
    }*/

    /*public void listarArquivos() {
        File pasta = new File("/home");
        File[] arquivos = pasta.listFiles();
        if (arquivos != null) {
            for (File arquivo : arquivos) {
                System.out.println(arquivo.getName());
            }
        }
    }*/

    public void criarDiretorio(String pasta) {
        File diretorio = new File(pasta);
        if (diretorio.isDirectory()){
            if (!diretorio.exists()) {
                diretorio.mkdir();
                System.out.println("Operação bem-sucedida");
            } else {
                System.out.println("O diretório já existe");
            }
        }
    }

    public void listarArquivos(String pasta) {
        File diretorio = new File(pasta);
        File[] arquivos = diretorio.listFiles();
        if (arquivos != null) {
            for (File arquivo : arquivos) {
                System.out.println(arquivo.getName());
                if (diretorio.isDirectory()) {
                    System.out.println("Diretório");
                } else {
                    System.out.println("Arquivo");
                    System.out.println("Tamanho do arquivo em bytes: " + diretorio.length());
                }
            }
        }
    }

    public void criarEstrutura(String pasta) {
        File sistema = new File(pasta);
        if (!sistema.exists()) {
            sistema.mkdir();
        } else {
            System.out.println("O diretório já existe");
        }

        File alunos = new File(pasta + "\\ alunos");
        if (!alunos.exists()) {
            alunos.mkdir();
        } else {
            System.out.println("A pasta já existe");
        }

        File disciplinas = new File(alunos + "\\disciplinas");
        if (!disciplinas.exists()) {
            disciplinas.mkdir();
        } else {
            System.out.println("A pasta já existe");
        }
        
        File documentos = new File(disciplinas + "\\documentos");
        if (!documentos.exists()) {
            documentos.mkdir();
        } else {
            System.out.println("A pasta já existe");
        }
    }
        
    //public void renomearArquivo

    public void deletarArquivo(String pasta) {
        File nomeArquivo = new File(pasta);
        if (nomeArquivo.exists()) {
            nomeArquivo.delete();
        }
    }

    }
