import models.*;

public class Main {
    public static void main(String[] args) {
        
        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = new Gerente();
        funcionarios[1] = new Vendedor();
        funcionarios[2] = new Consultor();

        for(Funcionario f:funcionarios) {
            System.out.println("Salários:");
            f.calcularSalario();
        }

        Animal[] animais = new Animal[3];

        animais[0] = new Cachorro();
        animais[1] = new Vaca();
        animais[2] = new Gato();

        for(Animal a:animais) {
            System.out.println("Sons: ");
            a.emitirSom();
        }
    }
}
