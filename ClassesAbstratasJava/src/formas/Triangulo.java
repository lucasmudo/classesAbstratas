package formas;

public class Triangulo extends Forma{
    private double lado;

    public Triangulo(String nome, double lado) {
        super(nome);
        this.lado=lado;
    }

    @Override
    public double calculaArea() {
        return (Math.pow(lado, 2) * Math.sqrt(3))/4;
    }

    @Override
    public double calculaPerimetro() {
        return lado*3;
    }
}
