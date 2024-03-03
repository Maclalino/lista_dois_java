package Empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Empresa empresa = new Empresa(new ArrayList<>());
        
        System.out.println("Cadastro do primeiro Funcionario");
        Funcionario funcionario1 = lerDadosFuncionarios(sc, 1, 10000);

        System.out.println("Cadastro do segundo Funcionario");
        Funcionario funcionario2 = lerDadosFuncionarios(sc, 24, 1000);

        System.out.println("Cadastro do terceiro Funcionario");
        Funcionario funcionario3 = lerDadosFuncionarios(sc, 13, 5000);

        sc.close();

        empresa.addFuncionario(funcionario1);
        empresa.addFuncionario(funcionario2);
        empresa.addFuncionario(funcionario3);

        empresa.toStringlistarFuncionarios();
        
        empresa.calcularFolhaSalarial();
              
    }

    public static Funcionario lerDadosFuncionarios(Scanner sc, int id, double salarioBase) {
        
        System.out.println("Informe o nome do Funcionário: ");
        String nome = sc.nextLine();

        System.out.println("Informe o cargo do Funcionário: (DESENVOLVEDOR / SUPORTE / GERENTE)");
        String cargo = sc.nextLine();
        
        
        if ("DESENVOLVEDOR".equalsIgnoreCase(cargo)) {
            Desenvolvedor dev = new Desenvolvedor(nome, id, salarioBase);
            double salarioComBonus = dev.calcularSalario(salarioBase); 
            dev.setSalario(salarioComBonus); 
            return dev;
        } else if ("SUPORTE".equalsIgnoreCase(cargo)) {
            Suporte sup = new Suporte(nome, id, salarioBase);
            double salarioComBonus = sup.calcularSalario(salarioBase);
            sup.setSalario(salarioComBonus);
            return sup;
        } else if ("GERENTE".equalsIgnoreCase(cargo)) {
            Gerente ger = new Gerente(nome, id, salarioBase);
            double salarioComBonus = ger.calcularSalario(salarioBase);
            ger.setSalario(salarioComBonus);
            return ger;
        } else {
            throw new IllegalArgumentException("\nCargo inválido: " + cargo);
        }
    }
}
