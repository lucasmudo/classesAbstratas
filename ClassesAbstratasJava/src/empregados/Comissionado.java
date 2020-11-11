package empregados;

public class Comissionado extends Empregado{
    private double totalVenda;
    private double totalComissao;

    public Comissionado(String nome, String sobrenome, String cpf, double totalVenda) {
        super(nome, sobrenome, cpf);
        this.totalVenda=totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    @Override
    public double vencimento() {
        return totalComissao=totalVenda*0.10;
    }
}
