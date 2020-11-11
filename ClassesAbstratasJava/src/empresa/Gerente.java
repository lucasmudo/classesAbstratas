package empresa;

public class Gerente extends Funcionario{

    @Override
    public String obterCargo() {
        return "Gerente";
    }

    @Override
    public double obterSalario() {
        return 4000;
    }

    @Override
    public double getBonificacao() {
        return 4000*0.20;
    }
}
