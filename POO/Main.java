public class Main {
    public static void main(String[] args) {
        
        Pessoa ana = new Pessoa();
        ana.setNome("Ana");
        ana.setIdade(18);
        ana.setAltura(167);
        ana.setMaiorIdade(true);

        //Pessoa 2

        Pessoa bella = new Pessoa();
        bella.setNome("Isabella");
        bella.setIdade(19);
        bella.setAltura(178);
        bella.setMaiorIdade(true);

        //Pessoa 3

        Pessoa valen = new Pessoa();
        valen.setNome("Valentina");
        valen.setIdade(19);
        valen.setAltura(165);
        valen.setMaiorIdade(true);

        //Livro

        Livro cleancode = new Livro();
        cleancode.setTitulo("Clean Code");
        cleancode.setAutor(ana);
        cleancode.setNumeroPaginas(464);
        cleancode.setAnoPublicacao(2008);

        Fabricante jorge = new Fabricante();
        jorge.setNome("Jorge");

        Produto videogame = new Produto();
        videogame.setNome("Playstation");
        videogame.setComprador(bella);
        videogame.setPreco(299);
        videogame.setQuantEstoque(300);
        videogame.setDisponivel(true);
        videogame.setFabricante(jorge);

        Produto controle = new Produto();
        controle.setNome("Controle");
        controle.setComprador(bella);
        controle.setPreco(150);
        controle.setQuantEstoque(300);
        controle.setDisponivel(true);
        controle.setFabricante(jorge);

        Motor motorBom = new Motor();
        motorBom.setPotencia(10000);
        motorBom.setCilindrada(30);
        motorBom.setCombustivel("Muito");

        Carro byd = new Carro();
        byd.setModelo("BYD");
        byd.setCor("Preto");
        byd.setDono(bella);
        byd.setMotor(motorBom);
        byd.setAno(2024);
        byd.setLigado(false);
        byd.setQuantKm(15000);

        Carro kicks = new Carro();
        kicks.setModelo("Kicks");
        kicks.setCor("Azul");
        kicks.setDono(bella);
        kicks.setMotor(motorBom);
        kicks.setAno(2026);
        kicks.setLigado(true);
        kicks.setQuantKm(0);

        Pessoa carlos = new Pessoa();
        carlos.setNome("Carlos");
        carlos.setAltura(180);
        carlos.setIdade(20);
        carlos.setMaiorIdade(true);

        Aluno carlinhos = new Aluno();
        carlinhos.setAprovado(true);
        carlinhos.setMatricula(2026666);
        carlinhos.setNota(10);

        Pessoa maria = new Pessoa();
        maria.setNome("Maria");
        maria.setAltura(170);
        maria.setIdade(17);
        maria.setMaiorIdade(false);

        Livro favorito = new Livro();
        favorito.setTitulo("A Menina Que Roubava Livros");
        favorito.setAutor(maria);
        favorito.setNumeroPaginas(480);
        favorito.setAnoPublicacao(2005);

        Pessoa joao = new Pessoa();
        carlos.setNome("João");
        carlos.setAltura(190);
        carlos.setIdade(34);
        carlos.setMaiorIdade(true);


        Pessoa gisele = new Pessoa();
        gisele.setNome("Gisele");
        gisele.setAltura(160);
        gisele.setIdade(46);
        gisele.setMaiorIdade(true);

        Pessoa larissa = new Pessoa();
        larissa.setNome("Larissa");
        larissa.setAltura(169);
        larissa.setIdade(25);
        larissa.setMaiorIdade(true);

        Produto fone = new Produto();
        fone.setNome("Fone de Ouvido Razer");
        fone.setComprador(gisele);
        fone.setPreco(4500);
        fone.setQuantEstoque(8);
        fone.setDisponivel(true);
        fone.setFabricante(jorge);

        Produto teclado = new Produto();
        teclado.setNome("Teclado Gamer");
        teclado.setComprador(gisele);
        teclado.setPreco(45000);
        teclado.setQuantEstoque(8);
        teclado.setDisponivel(true);
        teclado.setFabricante(jorge);

        Produto monitor = new Produto();
        monitor.setNome("Monitor Curvado");
        monitor.setComprador(larissa);
        monitor.setPreco(45000);
        monitor.setQuantEstoque(8);
        monitor.setDisponivel(true);
        monitor.setFabricante(jorge);

        Pessoa roberto = new Pessoa();
        roberto.setNome("Roberto");
        roberto.setAltura(150);
        roberto.setIdade(45);
        roberto.setMaiorIdade(true);

        Fabricante dell = new Fabricante();
        dell.setNome("Dell");
        dell.setPais("Estados Unidos");

        Produto notebook = new Produto();
        notebook.setNome("Notebook");
        notebook.setComprador(joao);
        notebook.setPreco(5000);
        notebook.setQuantEstoque(10);
        notebook.setDisponivel(true);
        notebook.setFabricante(dell);

        Fabricante xiaomi = new Fabricante();
        xiaomi.setNome("Xiaomi");
        xiaomi.setPais("China");

        Fabricante mago = new Fabricante();
        mago.setNome("Merlin");
        mago.setPais("Reino Unido");

        Produto cajado = new Produto();
        notebook.setNome("Cajado");
        notebook.setComprador(bella);
        notebook.setPreco(10000);
        notebook.setQuantEstoque(3);
        notebook.setDisponivel(true);
        notebook.setFabricante(mago);

        Produto pocao = new Produto();
        notebook.setNome("Poção");
        notebook.setComprador(larissa);
        notebook.setPreco(100);
        notebook.setQuantEstoque(50);
        notebook.setDisponivel(true);
        notebook.setFabricante(mago);

        Produto cobre = new Produto();
        notebook.setNome("Cobre");
        notebook.setComprador(joao);
        notebook.setPreco(500);
        notebook.setQuantEstoque(4000);
        notebook.setDisponivel(true);
        notebook.setFabricante(xiaomi);

        Motor basico = new Motor();
        basico.setCilindrada(1.3);
        basico.setCombustivel("Gasolina");
        basico.setPotencia(150);

        Carro fusca = new Carro();
        fusca.setModelo("Fusca");
        fusca.setCor("Azul");
        fusca.setDono(roberto);
        fusca.setAno(1982);
        fusca.setQuantKm(15000);
        fusca.setMotor(basico);

        Departamento ti = new Departamento();
        ti.setNome("Tecnologia");
        ti.setSigla("TI");

        Funcionario estagiario = new Funcionario();
        estagiario.setCargo("Desenvolvedor");
        estagiario.setDepartamento(ti);
        estagiario.setNome(joao);
        estagiario.setSalario(5000);
        ti.setFuncionario(estagiario);

        Departamento financeiro = new Departamento();
        ti.setNome("Financeiro");
        ti.setSigla("FI");

        Funcionario senior = new Funcionario();
        estagiario.setCargo("Contadora");
        estagiario.setDepartamento(financeiro);
        estagiario.setNome(larissa);
        estagiario.setSalario(1200);

        Funcionario pleno = new Funcionario();
        estagiario.setCargo("Estagiario");
        estagiario.setDepartamento(financeiro);
        estagiario.setNome(ana);
        estagiario.setSalario(3000);

        Funcionario junior = new Funcionario();
        estagiario.setCargo("Tesoureira");
        estagiario.setDepartamento(financeiro);
        estagiario.setNome(valen);
        estagiario.setSalario(10000);


        Item chaveiro = new Item();
        chaveiro.setProduto("brinde");
        chaveiro.setQuantidade(3);

        Pedido especial = new Pedido();
        especial.setPedido(chaveiro);
        especial.setPessoa(valen);

        Emprestimo amqrl = new Emprestimo();
        amqrl.setDataDevolucao("2026-08-20");
        amqrl.setDataEmprestimo("2026-07-20");


    }
}
