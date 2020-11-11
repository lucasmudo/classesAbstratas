package formas;

public class Circulo extends Forma {
    private double raio;

    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.pow(raio, 2) * Math.PI;
    }

    @Override
    public double calculaPerimetro() {
        return raio * 2 * Math.PI;
    }
}
