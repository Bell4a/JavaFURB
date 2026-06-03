//Contar palavra em uma frase

import java.util.Scanner;

public class Uni7Ex2 {

    private int contarPalavras (String palavra, String frase) {
        //Acrescentar 1 espaço em branco no fim da frase pra testar a última palavra
        frase+=" ";
        //Contador das palavras
        int qtdPalavras = 0;

        //Inicializar a palavra para retirar da frase
        String novaPalavra = "";

        //Percorrer a frase
        for (int cont = 0; cont < frase.length(); cont++) {
            //Verficar se na posição cont tem uma letra e não um espaço em branco
            if(frase.charAt(cont) != ' ') {
                //Acrescentar a letra na nova palavra
                novaPalavra += frase.charAt(cont);
            } else {
                //Verfificar se é a palavra pesquisada
                if (palavra.equalsIgnoreCase(novaPalavra)) {
                    //Contar a palavra
                    qtdPalavras++;
                }
                //Reiniciar a palavra
                novaPalavra = "";
            }
        }
        return qtdPalavras;
    }
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        //Criar um objeto para poder chamar o método
        Uni7Ex2 exercicio = new Uni7Ex2();

        System.out.println("Digite a Frase: ");
        String frase = teclado.nextLine();

        System.out.println("Digite a Palavra: ");
        String palavra= teclado.next();

        //Chamar a função
        int qntPalavras = exercicio.contarPalavras (palavra, frase);

        System.out.println("A palavra aparece " + qntPalavras + " vezes na frase.");

    
    }
}

/*
vetor palavra
vetor frase
comparar cont palavra + espaço (+ 1?) com cont frase
boolean achou?
contPalavra++
*/