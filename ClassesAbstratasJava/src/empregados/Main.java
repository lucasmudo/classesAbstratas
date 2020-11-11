package empregados;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Empregado assalariado = new Assalariado("Lucas", "Mudo", "123-123-123-12", 2500);
        Empregado comissionado = new Comissionado("Juliana", "Nishimura", "321-321-321-32", 5000);
        Empregado horista = new Horista("Felipe", "Donizete", "456-456-456-45", 8, 30);

        List<Empregado> listaEmpregados = new ArrayList<Empregado>();
        listaEmpregados.add(assalariado);
        listaEmpregados.add(comissionado);
        listaEmpregados.add(horista);

        double totalVencimento = 0;
        for (int i = 0; i<listaEmpregados.size(); i++){
            System.out.println("Nome: " + listaEmpregados.get(i).getNome());
            System.out.println("Sobrenome: " + listaEmpregados.get(i).getSobrenome());
            System.out.println("CPF: " + listaEmpregados.get(i).getCpf());
            System.out.println("Vencimento: " + listaEmpregados.get(i).vencimento());
            System.out.println();

            totalVencimento+=listaEmpregados.get(i).vencimento();
        }

        System.out.println(totalVencimento);
    }
}
