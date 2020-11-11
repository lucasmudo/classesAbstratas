package formas;

public class Main {
    public static void main(String[] args) {
        Forma quadrado = new Quadrado("Quadrado", 5);
        System.out.println(quadrado.getNome());
        System.out.println("Area: " + quadrado.calculaArea());
        System.out.println("Perimetro: " + quadrado.calculaPerimetro());
        System.out.println();

        Forma retangulo = new Retangulo("Retangulo", 5, 8);
        System.out.println(retangulo.getNome());
        System.out.println("Area: " + retangulo.calculaArea());
        System.out.println("Perimetro: " + retangulo.calculaPerimetro());
        System.out.println();

        Forma circulo = new Circulo("Circulo", 3.5);
        System.out.println(circulo.getNome());
        System.out.println("Area: " + circulo.calculaArea());
        System.out.println("Perimetro: " + circulo.calculaPerimetro());
        System.out.println();

        Forma triangulo = new Triangulo("Triangulo", 9);
        System.out.println(triangulo.getNome());
        System.out.println("Area: " + triangulo.calculaArea());
        System.out.println("Perimetro: " + triangulo.calculaPerimetro());




    }
}
