package formas;

public class Retangulo extends Forma{
    private double base, altura;

    public Retangulo(String nome, double base, double altura) {
        super(nome);
        this.base=base;
        this.altura=altura;
    }

    @Override
    public double calculaArea() {
        return base * altura;
    }

    @Override
    public double calculaPerimetro() {
        return (base*2) + (altura*2);
    }
}
