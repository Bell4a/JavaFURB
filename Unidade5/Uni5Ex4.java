public class Uni5Ex4 {
    
    public static void main(String[] args) {

    double soma = 0;
    double numerador = 3;
    double denominador = 2;
    double a = 4;

    for (int cont = 1; cont <=20; cont++) {
        soma += (numerador / denominador);

        numerador += 2;
        denominador += a;

        a += 2;
    }
    System.out.println(soma);
    }
}