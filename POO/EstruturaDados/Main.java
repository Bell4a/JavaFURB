package EstruturaDados;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("!!");
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals("Hello")) {
                iterator.remove();
            }
        }

        //Questão 1

        ArrayList<String> produtos = new ArrayList<>();
        produtos.add("Teclado");
        produtos.add("Monitor");
        produtos.add("Mouse");
        produtos.add("Gabinete");
        produtos.add("Processador");
        Iterator<String> iterator1 = produtos.iterator();


        while (iterator1.hasNext()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite qual produto será excluído: ");
            String opcao = scanner.next();
            if (produtos.contains(opcao)) {
                iterator1.remove();
            }
            System.out.println(produtos.size());
        }

        for (var item : produtos) {
            System.out.println(item.toString());
        }
        // Opção utilizando callback
        /*produtos.forEach(e -> {
            System.out.println(e.toString());
        });*/ 

        // Questão 2

        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("Isabella");
        alunos.add("Ana");
        alunos.add("Gabrielly");
        alunos.add("Natã");
        alunos.add("Julia");
        alunos.add("Leandro");
        Iterator<String> iterator3 = alunos.iterator();

        while (iterator3.hasNext()) {
            System.out.println("Aluno na terceira posição" + alunos.get(2));
            alunos.set(2, "Ana Júlia");
            System.out.println("Posição da aluna Isabella: ");
            alunos.indexOf("Isabella");
            String i = iterator.next();
            if (i.equals("Leandro")) {
                iterator.remove();
            }
        }
        
        // Questão 3

        LinkedList<String> clientes = new LinkedList<>();
        clientes.add("Bárbara");
        clientes.add("Camila");
        clientes.add("Giana");
        clientes.add("Gisele");
        clientes.add("Larissa");
        clientes.add(5, "Vilma");
        clientes.remove(5);
        Iterator<String> iterator4 = clientes.iterator();

        while (iterator4.hasNext()) {
            System.out.println(iterator4.toString());
        }

        // Questão 4 

        ArrayList<String> cidades = new ArrayList<>();
        cidades.add("Londres");
        cidades.add("Tokyo");
        cidades.add("Berlim");
        cidades.add("Brasília");
        cidades.add("Soul");
        cidades.add("Pequim");
        cidades.add("Paris");
        cidades.add("Moscou");
        Iterator<String> iterator5 = cidades.iterator();

        while (iterator5.hasNext()) {
            String s = iterator5.next();
            if (s.equals("S")) {
                iterator5.remove();
            }
            System.out.println(iterator5.toString());
        }

        if (cidades.isEmpty()) {
            System.out.println("Lista vazia");
        }

        // Questão 5
        
        ArrayList<String> livros = new ArrayList<>();
        livros.add("A Menina Que Roubava Livros");
        livros.add("O Pequeno Príncipe");
        livros.add("Tartarugas Até Lá Embaixo");
        livros.add("Terra Longa");
        livros.add("Quem é Você Alaska?");
        livros.add("A Culpa é das Estrelas");
        livros.add("Estrutura de Algorítmos");
        livros.add("O Conto de Aia");
        livros.add("A Metamorfose");
        livros.add("O Que Aconteceu com Annie");
        Iterator<String> iterator6 = livros.iterator();

        ArrayList<String> livrosFav = new ArrayList<>();
        livrosFav.add("A Menina Que Roubava Livros");
        livrosFav.add("O Conto de Aia");
        livrosFav.add("A Metamorfose");

        if (livrosFav.containsAll(livros)) {
            System.out.println("Os livros existem em ambas listas");
        }

        livrosFav.addAll(livros);
        livrosFav.retainAll(livros);
        livros.subList(1, 2);

        while (iterator6.hasNext()) {
            System.out.println(iterator6.toString());
        }

    }
}
