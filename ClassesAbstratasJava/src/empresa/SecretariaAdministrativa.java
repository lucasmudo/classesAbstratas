package empresa;

public class SecretariaAdministrativa extends Secretaria{
    @Override
    public String obterCargo() {
        return "Secretaria Administrativa";
    }

    @Override
    public double obterSalario() {
        return 3000;
    }

    @Override
    public double getBonificacao() {
        return 3000*0.10;
    }
}
