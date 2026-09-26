package src.models;

public class Cachorro extends Animal {
    
    //Construtor 
    public Cachorro(String nome) {
        super(nome);
    }
    
    public Cachorro() {
        super();
    } 

    @Override 
    public void setIdade(int idade) {
        if (idade <= 0 || idade > 20) {
            throw new IllegalArgumentException("Idade Inválida");
        }
        this.idade = idade;
        System.out.println("Idade do cachorro definida para: " + idade);
    }
}
