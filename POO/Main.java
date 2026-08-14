public class Main {
    public static void main(String[] args) {
        
        Pessoa ana = new Pessoa();
        ana.nome = "Ana";
        ana.idade = 18;
        ana.altura = 167;
        ana.maiorIdade = true;

        //Pessoa 2

        Pessoa bella = new Pessoa();
        bella.nome = "Isabella";
        bella.idade = 19;
        bella.altura = 178;
        bella.maiorIdade = true;

        //Pessoa 3

        Pessoa valen = new Pessoa();
        valen.nome = "Valentina";
        valen.idade = 19;
        valen.altura = 165;
        valen.maiorIdade = true;

        //Livro

        Livro cleancode = new Livro();
        cleancode.titulo = "Clean Code";
        cleancode.autor = ana;
        cleancode.numeroPaginas = 464;
        cleancode.anoPublicacao = 2008;

        Fabricante jorge = new Fabricante();
        jorge.nome = "Jorge";

        Produto videogame = new Produto();
        videogame.nome = "Playstation";
        videogame.comprador = bella;
        videogame.preco = 399;
        videogame.quantEstoque = 300;
        videogame.disponivel = true;
        videogame.fabricante = jorge;

        Produto controle = new Produto();
        controle.nome = "Playstation";
        controle.comprador = bella;
        controle.preco = 150;
        controle.quantEstoque = 300;
        controle.disponivel = true;
        controle.fabricante = jorge;

        Motor motorBom = new Motor();
        motorBom.potencia = 10000;
        motorBom.cilindrada = 30;
        motorBom.combustivel = "Muito";

        Carro byd = new Carro();
        byd.modelo = "Sim";
        byd.cor = "Preto";
        byd.dono = bella;
        byd.motor = motorBom;
        byd.ano = 2024;
        byd.ligado = false;
        byd.quantKm = 15000;

        Carro kicks = new Carro();
        kicks.modelo = "Nao";
        kicks.cor = "Azul";
        kicks.dono = bella;
        kicks.motor = motorBom;
        kicks.ano = 2026;
        kicks.ligado = true;
        kicks.quantKm = 0;

        Pessoa carlos = new Pessoa();
        carlos.nome = "Carlos";
        carlos.altura = 180;
        carlos.idade = 20;
        carlos.maiorIdade = true;

        Aluno carlinhos = new Aluno();
        carlinhos.aprovado = true;
        carlinhos.matricula = 20266666;
        carlinhos.nota = 10;
        carlinhos.pessoas = carlos;

        Pessoa maria = new Pessoa();
        maria.nome = "Maria";
        maria.altura = 170;
        maria.idade = 17;
        maria.maiorIdade = false;

        Livro favorito = new Livro();
        favorito.titulo = "A Menina Que Roubava Livros";
        favorito.autor = maria;
        favorito.numeroPaginas = 480;
        favorito.anoPublicacao = 2005;

        Pessoa joao = new Pessoa();
        carlos.nome = "João";
        carlos.altura = 195;
        carlos.idade = 34;
        carlos.maiorIdade = true;


        Pessoa gisele = new Pessoa();
        gisele.nome = "Gisele";
        gisele.altura = 160;
        gisele.idade = 46;
        gisele.maiorIdade = true;

        Pessoa larissa = new Pessoa();
        larissa.nome = "Larissa";
        larissa.altura = 170;
        larissa.idade = 25;
        larissa.maiorIdade = true;

        Produto fone = new Produto();
        fone.nome = "Fone de Ouvido Razer";
        fone.comprador = gisele;
        fone.preco = 4500;
        fone.quantEstoque = 8;
        fone.disponivel = true;
        fone.fabricante = jorge;

        Produto teclado = new Produto();
        teclado.nome = "Teclado Gamer";
        teclado.comprador = gisele;
        teclado.preco = 4500;
        teclado.quantEstoque = 8;
        teclado.disponivel = true;
        teclado.fabricante = jorge;

        Produto monitor = new Produto();
        monitor.nome = "Monitor Curvado";
        monitor.comprador = larissa;
        monitor.preco = 4500;
        monitor.quantEstoque = 8;
        monitor.disponivel = true;
        monitor.fabricante = jorge;

        Pessoa roberto = new Pessoa();
        roberto.nome = "Roberto";
        roberto.altura = 150;
        roberto.idade = 45;
        roberto.maiorIdade = true;


        Fabricante dell = new Fabricante();
        dell.nome = "Dell";
        dell.pais = "Estragos Undios";

        Produto notebook = new Produto();
        notebook.nome = "Notebook";
        notebook.comprador = joao;
        notebook.preco = 4500;
        notebook.quantEstoque = 8;
        notebook.disponivel = true;
        notebook.fabricante = dell;

        Fabricante xiaomi = new Fabricante();
        xiaomi.nome = "Xiaomi";
        xiaomi.pais = "China";

        Fabricante mago = new Fabricante();
        mago.nome = "Merlin";
        mago.pais = "Reino Unido";

        Produto cajado = new Produto();
        cajado.nome = "Cajado";
        cajado.comprador = bella;
        cajado.preco = 10000;
        cajado.quantEstoque = 3;
        cajado.disponivel = true;
        cajado.fabricante = mago;

        Produto pocao = new Produto();
        pocao.nome = "Poção";
        pocao.comprador = larissa;
        pocao.preco = 100;
        pocao.quantEstoque = 50;
        pocao.disponivel = true;
        pocao.fabricante = mago;

        Produto cobre = new Produto();
        cobre.nome = "Cobre";
        cobre.comprador = joao;
        cobre.preco = 500;
        cobre.quantEstoque = 4000;
        cobre.disponivel = true;
        cobre.fabricante = xiaomi;

        Motor basico = new Motor();
        basico.cilindrada = 1.3;
        basico.combustivel = "Gasolina";
        basico.potencia = 150;

        Carro fusca = new Carro();
        fusca.modelo = "Fusca";
        fusca.cor = "Azul";
        fusca.dono = roberto;
        fusca.ano = 1982;
        fusca.quantKm = 15000;
        fusca.motor = basico;

        Departamento ti = new Departamento();
        ti.nome = "Tecnologia";
        ti.sigla = "TI";

        Funcionario estagiario = new Funcionario();
        estagiario.cargo = "Desenvolvedor";
        estagiario.departamento = ti;
        estagiario.nome = joao;
        estagiario.salario = 5000;
        ti.funcionario = estagiario;

        Departamento financeiro = new Departamento();
        financeiro.nome = "Financeiro";
        financeiro.sigla = "FI";

        Funcionario senior = new Funcionario();
        senior.cargo = "Contadora";
        senior.departamento = financeiro;
        senior.nome = larissa;
        senior.salario = 1200;

        Funcionario pleno = new Funcionario();
        pleno.cargo = "Estagiario";
        pleno.departamento = financeiro;
        pleno.nome = ana;
        pleno.salario = 3000;

        Funcionario junior = new Funcionario();
        junior.cargo = "Tesoureira";
        junior.departamento = financeiro;
        junior.nome = valen;
        junior.salario = 10000;

        Pessoa pedro = new Pessoa();
        pedro.nome = "Pedro";


        Item chaveiro = new Item();
        chaveiro.produto = "brinde";
        chaveiro.quantidade = 3;

        Pedido especial = new Pedido();
        especial.pedido = chaveiro;
        especial.pessoa = valen;

        Emprestimo amqrl = new Emprestimo();
        amqrl.dataDevolucao = "2026-08-20";
        amqrl.dataEmprestimo = "2026-07-20";

        Biblioteca magica = new Biblioteca();
        
        /*
        String nome;
    String sigla;
    Funcionario funcionario;
        */


        /*
        Pessoa[] pessoas;
    int matricula;
    double nota;
    boolean aprovado; */
    

        /*
        String nome;
    int idade;
    double altura;
    boolean maiorIdade;
        */


      

    }
}
