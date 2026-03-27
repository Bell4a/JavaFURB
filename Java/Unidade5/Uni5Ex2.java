public class Uni5Ex2 {
    
    public static void main(String[] args) {
        
    int somaImpar = 0;
    int somaPar = 0;

    for (int cont = 1; cont <=100; cont++) {

        if (cont % 2 != 0) {
            somaImpar += cont; //Equivale a somaI = somaI + cont
        } else {
            somaPar = somaPar + cont;
        }
    }

    System.out.println("Soma dos pares: " + somaPar);
    System.out.println("Soma dos ímpares: " + somaImpar);
    }
}
