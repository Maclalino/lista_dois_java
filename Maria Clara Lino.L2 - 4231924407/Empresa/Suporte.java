package Empresa;

public class Suporte extends Funcionario {

    public Suporte(String nome, int id, double salario) {
        super(nome, id, salario, Cargo.SUPORTE);
    
    }
    
    @Override
    double calcularSalario(double salarioBase) {
        double salarioComBonus = (salarioBase * 0.5) + salarioBase;
        return salarioComBonus;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() + "\nID: " + getId() + "\nSalário: R$ " + formatarSalario(getSalario()) + "\nCargo: " + Cargo.SUPORTE + ".";
    }
    public String formatarSalario(double salario) {
        return String.format("%.2f", salario);
    }
}
