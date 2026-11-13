import models.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EXERCÍCIO 1: PRODUTOS ==[cite: 1]");
        Produto p1 = new Produto(101, "Notebook Gamer", 6500.00);
        Produto p2 = new Produto(101, "Mouse sem fio", 120.00);

        System.out.println("p1 == p2 (referência): " + (p1 == p2));
        System.out.println("p1.equals(p2) (código igual): " + p1.equals(p2));

        System.out.println("\n=== EXERCÍCIO 2: ALUNOS ==[cite: 2]");
        AlunoEx2 alEx2_1 = new AlunoEx2(20261, "Isabella", "Data Science");
        AlunoEx2 alEx2_2 = new AlunoEx2(20261, "Isabella Mondini", "Engenharia de Software");
        AlunoEx2 alEx2_3 = new AlunoEx2(20262, "Lucas", "Sistemas");

        System.out.println("alEx2_1.equals(alEx2_2): " + alEx2_1.equals(alEx2_2));
        System.out.println("alEx2_1.equals(alEx2_3): " + alEx2_1.equals(alEx2_3));

        List<AlunoEx2> listaAlunos = new ArrayList<>();
        listaAlunos.add(alEx2_1);
        listaAlunos.add(alEx2_3);

        AlunoEx2 alunoBusca = new AlunoEx2(20261, "Qualquer", "Outro");
        System.out.println("A lista contém o aluno com matrícula 20261? " + listaAlunos.contains(alunoBusca));

        System.out.println("\n=== EXERCÍCIO 3: PESSOAS (HERANÇA) ==[cite: 3]");
        AlunoEx3 a3_1 = new AlunoEx3("123.456.789-00", "Mariana", 1001);
        AlunoEx3 a3_2 = new AlunoEx3("123.456.789-00", "Mariana Souza", 1002);
        Professor prof1 = new Professor("987.654.321-11", "Carlos", "Banco de Dados");
        Professor prof2 = new Professor("987.654.321-11", "Carlos Eduardo", "Estatística");

        System.out.println("Alunos com mesmo CPF são iguais? " + a3_1.equals(a3_2));
        System.out.println("Professores com mesmo CPF são iguais? " + prof1.equals(prof2));

        System.out.println("\n=== EXERCÍCIO 4: ANIMAIS (INTERFACE E HERANÇA) ==[cite: 4]");
        Cachorro cachorro = new Cachorro(42, "Bidu");
        Gato gato = new Gato(42, "Mingau");

        System.out.println("Cachorro ID: " + cachorro.getIdentificacao());
        System.out.println("Gato ID: " + gato.getIdentificacao());
        System.out.println("Cachorro equals Gato (mesma identificação)? " + cachorro.equals(gato));

        System.out.println("\n=== EXERCÍCIO 5: FUNCIONÁRIOS (POLIMORFISMO) ==[cite: 5]");
        Gerente g1 = new Gerente(500, "Roberto", 9000.00, 1500.00);
        Gerente g2 = new Gerente(500, "Roberto Silva", 9500.00, 2000.00);
        Vendedor v1 = new Vendedor(501, "Ana Paula", 3500.00, 800.00);

        System.out.println("Gerentes com mesma matrícula são iguais? " + g1.equals(g2));

        List<Funcionario> listaFuncionarios = new ArrayList<>();
        listaFuncionarios.add(g1);
        listaFuncionarios.add(v1);

        System.out.println("\nExibindo dados via Polimorfismo:");
        for (Funcionario f : listaFuncionarios) {
            System.out.println("Matrícula: " + f.getMatricula() + " | Nome: " + f.getNome() + " | Salário: R$ " + f.getSalario());
        }

        Funcionario fBusca = new Funcionario(500, "Outro", 0.0);
        System.out.println("\nA lista de funcionários contém a matrícula 500? " + listaFuncionarios.contains(fBusca));
    }
}