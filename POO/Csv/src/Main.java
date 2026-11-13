import models.*;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Cria os arquivos CSV automaticamente para testes caso não existam
        criarArquivosCSVDeExemplo();

        System.out.println("=== EXERCÍCIO 1: CADASTRO DE ALUNOS ==[cite: 6]");
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("alunos.csv"))) {
            String linha = br.readLine(); // Ignora o cabeçalho[cite: 11]
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(","); // Separa as colunas[cite: 11]
                int matricula = Integer.parseInt(dados[0].trim());
                String nome = dados[1].trim();
                String curso = dados[2].trim();
                int idade = Integer.parseInt(dados[3].trim());

                listaAlunos.add(new Aluno(matricula, nome, curso, idade));
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo alunos.csv: " + e.getMessage());
        }
        for (Aluno a : listaAlunos) {
            System.out.println(a);
        }

        System.out.println("\n=== EXERCÍCIO 2: CADASTRO DE PRODUTOS ==[cite: 7]");
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("produtos.csv"))) {
            String linha = br.readLine(); // Ignora o cabeçalho[cite: 11]
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                int codigo = Integer.parseInt(dados[0].trim());
                String descricao = dados[1].trim();
                double preco = Double.parseDouble(dados[2].trim());
                int quantidade = Integer.parseInt(dados[3].trim());

                listaProdutos.add(new Produto(codigo, descricao, preco, quantidade));
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo produtos.csv: " + e.getMessage());
        }
        // Exibe apenas descrição e preço de todos os produtos[cite: 7]
        for (Produto p : listaProdutos) {
            System.out.println("Descrição: " + p.getDescricao() + " | Preço: R$ " + String.format("%.2f", p.getPreco()));
        }

        System.out.println("\n=== EXERCÍCIO 3: CADASTRO DE FUNCIONÁRIOS (Apenas TI) ==[cite: 8]");
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("funcionarios.csv"))) {
            String linha = br.readLine(); // Ignora o cabeçalho[cite: 11]
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                int matricula = Integer.parseInt(dados[0].trim());
                String nome = dados[1].trim();
                String departamento = dados[2].trim();
                double salario = Double.parseDouble(dados[3].trim());

                listaFuncionarios.add(new Funcionario(matricula, nome, departamento, salario));
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo funcionarios.csv: " + e.getMessage());
        }
        // Exibe somente os funcionários que trabalham no departamento de TI[cite: 8]
        for (Funcionario f : listaFuncionarios) {
            if (f.getDepartamento().equalsIgnoreCase("TI")) {
                System.out.println(f);
            }
        }

        System.out.println("\n=== EXERCÍCIO 4: CADASTRO DE LIVROS (Após 2020) ==[cite: 9]");
        ArrayList<Livro> listaLivros = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("livros.csv"))) {
            String linha = br.readLine(); // Ignora o cabeçalho[cite: 11]
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                int codigo = Integer.parseInt(dados[0].trim());
                String titulo = dados[1].trim();
                String autor = dados[2].trim();
                int anoPublicacao = Integer.parseInt(dados[3].trim());

                listaLivros.add(new Livro(codigo, titulo, autor, anoPublicacao));
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo livros.csv: " + e.getMessage());
        }
        // Exibe livros publicados após o ano de 2020[cite: 9]
        for (Livro l : listaLivros) {
            if (l.getAnoPublicacao() > 2020) {
                System.out.println(l);
            }
        }

        System.out.println("\n=== EXERCÍCIO 5: CADASTRO DE VEÍCULOS ==[cite: 10]");
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("veiculos.csv"))) {
            String linha = br.readLine(); // Ignora o cabeçalho[cite: 11]
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                String placa = dados[0].trim();
                String modelo = dados[1].trim();
                String marca = dados[2].trim();
                int ano = Integer.parseInt(dados[3].trim());
                double valor = Double.parseDouble(dados[4].trim());

                listaVeiculos.add(new Veiculo(placa, modelo, marca, ano, valor));
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo veiculos.csv: " + e.getMessage());
        }

        System.out.println("Veículos com ano superior a 2021[cite: 10]:");
        double somaValores = 0;
        for (Veiculo v : listaVeiculos) {
            somaValores += v.getValor();
            if (v.getAno() > 2021) {
                System.out.println(v);
            }
        }

        // Calcula e exibe o valor médio dos veículos cadastrados[cite: 10]
        if (!listaVeiculos.isEmpty()) {
            double media = somaValores / listaVeiculos.size();
            System.out.println("\nValor médio dos veículos cadastrados: R$ " + String.format("%.2f", media));
        }
    }

    // Método auxiliar para criar os arquivos CSV caso não existam no ambiente
    private static void criarArquivosCSVDeExemplo() {
        escreverArquivo("alunos.csv", "matricula,nome,curso,idade\n1001,Ana Silva,Computacao,21\n1002,Pedro Santos,Sistemas,23\n1003,Maria Oliveira,Computacao,20\n1004,Joao Souza,Administracao,25\n1005,Lucas Costa,Sistemas,22");
        escreverArquivo("produtos.csv", "codigo,descricao,preco,quantidade\n1,Teclado,120.50,10\n2,Mouse,65.90,25\n3,Monitor,899.90,5\n4,Headset,199.90,12\n5,Webcam,150.00,8");
        escreverArquivo("funcionarios.csv", "matricula,nome,departamento,salario\n101,Carlos,TI,4500.00\n102,Mariana,RH,3800.00\n103,Roberto,Financeiro,5200.00\n104,Fernanda,TI,6100.00\n105,Juliana,Comercial,4200.00");
        escreverArquivo("livros.csv", "codigo,titulo,autor,anoPublicacao\n1,Java Basico,Deitel,2020\n2,Logica de Programacao,Manzano,2018\n3,Programacao Orientada a Objetos,Martin,2021\n4,Estruturas de Dados,Cormen,2019\n5,Banco de Dados,Elmasri,2022");
        escreverArquivo("veiculos.csv", "placa,modelo,marca,ano,valor\nABC1234,Civic,Honda,2022,120000.00\nDEF5678,Onix,Chevrolet,2021,75000.00\nGHI9012,Corolla,Toyota,2023,145000.00\nJKL3456,HB20,Hyundai,2020,68000.00\nMNO7890,Compass,Jeep,2022,160000.00");
    }

    private static void escreverArquivo(String nomeArquivo, String conteudo) {
        File arquivo = new File(nomeArquivo);
        if (!arquivo.exists()) {
            try (PrintWriter pw = new PrintWriter(new FileWriter(arquivo))) {
                pw.print(conteudo);
            } catch (IOException e) {
                System.out.println("Não foi possível criar o arquivo " + nomeArquivo);
            }
        }
    }
}