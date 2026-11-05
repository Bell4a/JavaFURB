package repositorio;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ArquivoBinario {
    
    public void ler(String nomeArquivo) {
        File arquivo2 = new File(nomeArquivo);
        try {
            FileInputStream fis = new FileInputStream(arquivo2);
            DataInputStream dis = new DataInputStream(fis);
            int dado;
            try {
                String str = dis.readUTF();
                boolean bool = dis.readBoolean();
                double dbl = dis.readDouble();
                System.out.println(str);
                System.out.println(bool);
                System.out.println(dbl);
            } catch (Exception e) {
                e.printStackTrace();
            }
            dis.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void gravar(String nomeArquivo) {
        File arquivo2 = new File(nomeArquivo);
        try {
            FileOutputStream fos = new FileOutputStream(arquivo2);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeUTF("Teste String");
            dos.writeBoolean(true);
            dos.writeDouble(4.2);
            dos.close();
            fos.write(65);
            fos.write(66);
            fos.write(67);
            fos.write(68);
            fos.write(69);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void copiarArquivo(String origem, String destino) {
        File arquivo3 = new File(origem);
        File arquivo4 = new File(destino);
        try {
            FileInputStream input = new FileInputStream(arquivo3);
            FileOutputStream output = new FileOutputStream(arquivo4);
            int conteudo;
            while ((conteudo = input.read()) != -1) {
                output.write(conteudo);
            }
            output.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /*public void adicionarBytes(String caminho) {
        
    }*/

    public void gravarDados(String nomeDado) {
        
        File arquivo5 = new File(nomeDado);
        try {
            FileOutputStream fos = new FileOutputStream(arquivo5);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(25);
            dos.writeDouble(199.90);
            dos.writeBoolean(true);
            dos.writeUTF("Java");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void gravarFuncionario(String nomeArq, int matricula, String nome, double salario, boolean funcionarioAtivo) {
        File arquivo6 = new File(nomeArq);
        try {
            FileOutputStream fos = new FileOutputStream(arquivo6);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(matricula);
            dos.writeDouble(salario);
            dos.writeBoolean(funcionarioAtivo);
            dos.writeUTF(nome);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void gravarProdutos(String nomeArq, int codigo, String nome, double preco) {
        File arquivo7 = new File(nomeArq);
        try {
            FileOutputStream fos = new FileOutputStream(arquivo7);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(codigo);
            dos.writeUTF(nome);
            dos.writeDouble(preco);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void gravarEmpresa(String nomeArq, String nomeEmpresa, int qtdFuncionarios, double faturamento, boolean funcionamento, int fundacao) {
        File arquivo8 = new File(nomeArq);
        try {
            FileOutputStream fos = new FileOutputStream(arquivo8);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeUTF(nomeEmpresa);
            dos.writeInt(qtdFuncionarios);
            dos.writeDouble(faturamento);
            dos.writeBoolean(funcionamento);
            dos.writeInt(fundacao);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
