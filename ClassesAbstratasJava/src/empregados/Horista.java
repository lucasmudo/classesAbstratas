package empregados;

public class Horista extends Empregado{
    private double precoHora;
    private double horasTrabalhadas;

    public Horista(String nome, String sobrenome, String cpf, double horasTrabalhadas, double precoHora) {
        super(nome, sobrenome, cpf);
        this.horasTrabalhadas=horasTrabalhadas;
        this.precoHora=precoHora;
    }

    @Override
    public double vencimento() {
        return horasTrabalhadas*precoHora;
    }
}
