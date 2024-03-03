package Empresa;

public class Gerente extends Funcionario {
    public Gerente(String nome, int id, double salario) {
        super(nome, id, salario, Cargo.GERENTE);        
    }
    @Override
    double calcularSalario(double salarioBase) {
        double salarioComBonus = (salarioBase * 0.2) + salarioBase + 1000;
        return salarioComBonus;
    }
    @Override
    public String toString() {
        return "\nNome: " + getNome() + "\nID: " + getId() + "\nSalário: R$ " + formatarSalario(getSalario()) + "\nCargo: " + Cargo.GERENTE + ".";
    }
    public String formatarSalario(double salario) {
        return String.format("%.2f", salario);
    }
}
