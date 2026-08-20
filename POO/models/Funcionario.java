public class Funcionario {
    
    private Pessoa nome;
    private String cargo;
    private double salario;
    private Departamento departamento;

    public Pessoa getNome() {
        return nome;
    }
    public void setNome(Pessoa nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
