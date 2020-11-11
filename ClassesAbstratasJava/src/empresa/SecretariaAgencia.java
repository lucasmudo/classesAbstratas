package empresa;

public class SecretariaAgencia extends Secretaria{
    @Override
    public String obterCargo() {
        return "Secretaria Agencia";
    }

    @Override
    public double obterSalario() {
        return 3000;
    }

    @Override
    public double getBonificacao() {
        return 3000*0.05;
    }
}
