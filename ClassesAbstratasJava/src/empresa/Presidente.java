package empresa;

public class Presidente extends Funcionario{
    @Override
    public String obterCargo() {
        return "Presidente";
    }

    @Override
    public double obterSalario() {
        return 5000;
    }

    @Override
    public double getBonificacao() {
        return 5000*0.30;
    }
}
