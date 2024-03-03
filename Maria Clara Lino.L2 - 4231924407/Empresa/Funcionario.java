package Empresa;

public abstract class Funcionario {
    private String nome;
    private int id;
    private double salario;
    private Cargo Cargo;

    public Funcionario(String nome, int id, double salario, Cargo cargo) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        Cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Cargo getCargo() {
        return Cargo;
    }

    public void setCargo(Cargo cargo) {
        Cargo = cargo;
    }

    abstract double calcularSalario(double salarioBase);

    public String toString() {
        return "";
    }

}
