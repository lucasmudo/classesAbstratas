package formas;

public class Quadrado extends Forma {
    private double lado;

    public Quadrado(String nome, double lado){
        super(nome);
        this.lado = lado;
    }

    @Override
    public double calculaArea(){
        return Math.pow(lado, 2);
    }

    @Override
    public double calculaPerimetro(){
        return lado *4;
    }

}
