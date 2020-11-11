package empresa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Funcionario secretariaAgencia = new SecretariaAgencia();
        Funcionario secretariaAdministrativa = new SecretariaAdministrativa();
        Funcionario presidente = new Presidente();
        Funcionario gerente = new Gerente();

        List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
        listaFuncionarios.add(secretariaAgencia);
        listaFuncionarios.add(secretariaAdministrativa);
        listaFuncionarios.add(presidente);
        listaFuncionarios.add(gerente);

        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println(funcionario.obterCargo());
            System.out.println("Salário: " + funcionario.obterSalario());
            System.out.println("Bonificação: " + funcionario.getBonificacao());
            System.out.println();
        }
    }
}
