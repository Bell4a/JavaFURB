import Relacionamento.Aluno;
import Relacionamento.Cliente;
import Relacionamento.Contabancaria;
import Relacionamento.Curso;
import Relacionamento.Disciplina;
import Relacionamento.Funcionario;
import Relacionamento.Medico;
import Relacionamento.Paciente;
import Relacionamento.Professor;
import java.util.ArrayList;
import Relacionamento.Pedido;
import Relacionamento.Produtos;
import java.util.Date;

public class MainRelacionamentos {
   public static void main(String[] args) {

      // CRIANDO CURSO

      Curso bcd = new Curso();
      bcd.setNomeCurso("Ciencias de Dados");
      bcd.setCodigo(54125);
      bcd.setAlunos(new ArrayList<>());
      bcd.setDisciplinas(new ArrayList<>());

      // CRIANDO ALUNOS

      // Criando aluno 01
      Aluno ana = new Aluno();
      ana.setMatricula(202020);
      ana.setNome("Ana");
      ana.setEmail("devigilianaluiza@gmail.com");
      ana.setDisciplinas(new ArrayList<>());
      ana.setAmigos(new ArrayList<>());

      // Criando aluno 02
      Aluno pedro = new Aluno();
      pedro.setMatricula(30303);
      pedro.setNome("Pedro");
      pedro.setEmail("pedrolopes@gmail.com");
      pedro.setDisciplinas(new ArrayList<>());
      pedro.setAmigos(new ArrayList<>());


      // RELACIONAMENTO: Aluno <-> Aluno
      // Tipo: Auto-relacionamento
      // Relacionamento: Amigo


      // Ana é amiga de Pedro
      ana.getAmigos().add(pedro);
      pedro.getAmigos().add(ana);


      // RELACIONAMENTO: Aluno <-> Curso
      // Um curso possui vários alunos.
      // Um aluno pertence a um curso.
    

      // Adicionando os alunos no curso
      bcd.getAlunos().add(ana);
      bcd.getAlunos().add(pedro);

      // Adicionando o curso nos alunos
      ana.setCurso(bcd);
      pedro.setCurso(bcd);


      // CRIANDO DISCIPLINAS

      // Disciplina 01
      Disciplina d1 = new Disciplina();
      d1.setNome("POO");
      d1.setAlunos(new ArrayList<>());

      // Disciplina 02
      Disciplina d2 = new Disciplina();
      d2.setNome("Analise Exploratoria");
      d2.setAlunos(new ArrayList<>());

      // Disciplina 03
      Disciplina d3 = new Disciplina();
      d3.setNome("Banco de dados");
      d3.setAlunos(new ArrayList<>());

      // RELACIONAMENTO: Aluno <-> Disciplina
      // Um aluno pode cursar várias disciplinas.
      // Uma disciplina pode possuir vários alunos.


      // Adicionando disciplinas nos alunos
      pedro.getDisciplinas().add(d1);

      ana.getDisciplinas().add(d1);
      ana.getDisciplinas().add(d3);

      // Adicionando alunos nas disciplinas
      d1.getAlunos().add(ana);
      d1.getAlunos().add(pedro);

      d3.getAlunos().add(ana);


      // RELACIONAMENTO: Curso <-> Disciplina
      // Um curso possui várias disciplinas.
      // Uma disciplina pertence a um curso.
  

      bcd.getDisciplinas().add(d1);
      bcd.getDisciplinas().add(d2);


      // PRINT DAS DISCIPLINAS DOS ALUNOS

      System.out.println("Disciplinas da Ana:");

      for (int i = 0; i < ana.getDisciplinas().size(); i++) {
         System.out.println(
               ana.getNome() + ": " +
                     ana.getDisciplinas().get(i).getNome());
      }

      System.out.println();

      System.out.println("Disciplinas do Pedro:");

      for (int i = 0; i < pedro.getDisciplinas().size(); i++) {
         System.out.println(
               pedro.getNome() + ": " +
                     pedro.getDisciplinas().get(i).getNome());
      }


      // CRIANDO PROFESSORES

      // Professor 01
      Professor john = new Professor();
      john.setNome("John");
      john.setMatricula(874587);
      john.setTitulacao("A");
      john.setDisciplina(new ArrayList<>());

      // Professor 02
      Professor maira = new Professor();
      maira.setNome("Maira");
      maira.setMatricula(71651651);
      maira.setTitulacao("B");
      maira.setDisciplina(new ArrayList<>());


      // RELACIONAMENTO: Professor <-> Disciplina
      // Um professor pode lecionar várias disciplinas.
      // Uma disciplina possui um professor.
  

      john.getDisciplina().add(d1);
      john.getDisciplina().add(d2);

      maira.getDisciplina().add(d3);


      // CRIANDO CONTAS BANCÁRIAS

      Contabancaria c1 = new Contabancaria();
      c1.setNumero(5284);
      c1.setAgencia(147);
      c1.setSalario(14.547);

      Contabancaria c2 = new Contabancaria();
      c2.setNumero(4931);
      c2.setAgencia(471);
      c2.setSalario(15.658);


      // CRIANDO CLIENTES

      Cliente joana = new Cliente();
      joana.setNome("Joana");
      joana.setCpf("054.026.321-87");
      joana.setTelefone("47 98526-4153");
      joana.setContas(new ArrayList<>());

      Cliente mauro = new Cliente();
      mauro.setNome("Mauro");
      mauro.setCpf("693.548.321-25");
      mauro.setTelefone("47 715-3695");
      mauro.setContas(new ArrayList<>());


      // RELACIONAMENTO: Cliente <-> Conta Bancária
      // Um cliente pode possuir várias contas.
      // Uma conta pertence a um cliente.
   

      joana.getContas().add(c2);
      c2.setCliente(joana);

      mauro.getContas().add(c1);
      c1.setCliente(mauro);


      // CRIANDO MÉDICOS

      // Médico 01
      Medico m1 = new Medico();
      m1.setCrm(154876);
      m1.setNome("Jair");
      m1.setEspecialidade("Pediatria");
      m1.setPacientes(new ArrayList<>());

      // Médico 02
      Medico m2 = new Medico();
      m2.setCrm(258963);
      m2.setNome("Carlos");
      m2.setEspecialidade("Cardiologia");
      m2.setPacientes(new ArrayList<>());


      // CRIANDO PACIENTES

      Paciente marcia = new Paciente();
      marcia.setCpf("851.487.652-87");
      marcia.setNome("Marcia");
      marcia.setTelefone("47 98256-5421");
      marcia.setMedicos(new ArrayList<>());

      Paciente gabriel = new Paciente();
      gabriel.setCpf("863.542.951-45");
      gabriel.setNome("Gabriel");
      gabriel.setTelefone("47 96586-5421");
      gabriel.setMedicos(new ArrayList<>());


      // RELACIONAMENTO: Médico <-> Paciente
      // Um médico pode atender vários pacientes.
      // Um paciente pode ser atendido por vários médicos.


      // Adicionando médicos nos pacientes
      marcia.getMedicos().add(m1);
      gabriel.getMedicos().add(m2);

      // Adicionando pacientes nos médicos
      m1.getPacientes().add(marcia);
      m2.getPacientes().add(gabriel);


      // CRIANDO PEDIDOS

      // Criando pedido 01
      Pedido pedido1 = new Pedido();
      pedido1.setNumero(1);
      pedido1.setData(new Date());
      pedido1.setValorTotal(150.00);
      pedido1.setProdutos(new ArrayList<>());

      // Criando pedido 02
      Pedido pedido2 = new Pedido();
      pedido2.setNumero(2);
      pedido2.setData(new Date());
      pedido2.setValorTotal(300.00);
      pedido2.setProdutos(new ArrayList<>());


      // CRIANDO PRODUTOS

      // Criando produto 01
      Produtos produto1 = new Produtos();
      produto1.setCodigo(101);
      produto1.setDescricao("Notebook");
      produto1.setPreco(2500.00);
      produto1.setPedidos(new ArrayList<>());

      // Criando produto 02
      Produtos produto2 = new Produtos();
      produto2.setCodigo(102);
      produto2.setDescricao("Mouse");
      produto2.setPreco(100.00);
      produto2.setPedidos(new ArrayList<>());

      // RELACIONAMENTO: Pedido <-> Produto
      // Um pedido possui vários produtos.
      // Um produto pode estar em vários pedidos.

      // pedido1.getProdutos().add(produto1);
      // pedido1.getProdutos().add(produto2);

      produto1.getPedidos().add(pedido1);
      produto2.getPedidos().add(pedido1);


      // CRIANDO FUNCIONÁRIOS

      Funcionario carlos = new Funcionario();
      carlos.setMatricula(1001);
      carlos.setNome("Carlos");
      carlos.setSalario(5000);

      Funcionario joice = new Funcionario();
      joice.setMatricula(1002);
      joice.setNome("Joice");
      joice.setSalario(3000);


      // Inicializando listas
      carlos.setFuncionarios(new ArrayList<>());
      joice.setFuncionarios(new ArrayList<>());


      // RELACIONAMENTO: Funcionário <-> Funcionário
      // Tipo: Auto-relacionamento
      // Relacionamento: Gerente
      // Um funcionário pode gerenciar vários funcionários.
      // Um funcionário pode possuir um gerente.

      // Carlos é gerente de Joice
      carlos.getFuncionarios().add(joice);
      joice.setGerente(carlos);
   }
}