import java.util.Scanner;

public class Uni6Ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vetor[] = new int[50];
        int n = 0; //Controla a quantidade de valores q estão no vetor
        int opcao; 
        boolean achou = false;

        do { 
            //Ler opção do usuário
            System.out.println("1 - Inserir Valor");
            System.out.println("2 - Pesquisar Valor");
            System.out.println("3 - Alterar Valor");
            System.out.println("4 - Excluir Valor");
            System.out.println("5 - Mostrar Conteúdo");
            System.out.println("6 - Sair do Sistema");

            opcao = teclado.nextInt();

            switch(opcao) {
                case 1: {
                    if (n < 50) {
                        System.out.println("Qual valor você quer adicionar? ");
                        vetor[n] = teclado.nextInt();
                        n++;
                        System.out.println("Valor Inserido");
                        
                    } else {
                        System.out.println("Máximo de números adicionados");
                    }
                }
                break;

                case 2: {
                    
                    //Ler o valor a ser encontrado
                    System.out.println("Digite o valor a ser pesquisado: ");
                    int valor = teclado.nextInt();

                    //Percorrer o vetor para procurar o valor
                    for (int cont = 0; cont < n; cont++) {
                    //Verificar se o valor da posição cont é procurado
                        if (vetor[cont] == valor) {
                            achou = true;
                            break; //Interrompe a pesquisa
                        }
                    //Informar se o valor existe
                    System.out.println(achou ? "O valor está no vetor" : "O valor não está no vetor");
                    }
                }
                break;

                case 3: {

                    System.out.println("Qual valor você deseja substituir?");
                    int original = teclado.nextInt();
                    System.out.println("Qual o valor novo? ");
                    int novo = teclado.nextInt();

                    for (int cont = 0; cont < n; cont++) {
                        if (vetor[cont] == original) {
                            achou = true;
                            vetor[cont] = novo;
                            System.out.println("Valor trocado!");
                        } else {
                            System.out.println("O valor não existe no vetor");
                        }
                    }
                }
                
                break;

                case 4: {
                    System.out.println("Digite o valor a ser excluído: ");
                    int valor = teclado.nextInt();
                    achou = false;

                    for (int cont = 0; cont < n; cont++) {
                        if(valor == vetor[cont]) {
                            achou = true;

                            for (int cont1 = cont; cont1 < n -1; cont1++) {
                                vetor[cont1] = vetor[cont1+1];
                            }
                            //Diminuir a quantidade de elementos do vetor
                            n --;
                        }
                    }
                    if (!achou)
                        System.out.println("Valor não cadastrado");
                }
                break;

                case 5: 
                    for (int cont = 0; cont  < n; cont++) {
                        System.out.println(vetor[cont]);
                    }
                    break;
            }

        } while (opcao != 6);


    }
}