package Empresa;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, int id, double salario) {
        super(nome, id, salario, Cargo.DESENVOLVEDOR);

    }

    @Override
    double calcularSalario(double salarioBase) {
        double salarioComBonus = (salarioBase * 0.1) + salarioBase;
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
