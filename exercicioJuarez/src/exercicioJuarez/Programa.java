package exercicioJuarez;

public class Programa {

	public static void main(String args[]) {

        Pessoa p = new Pessoa();
        p.nome = "Paulo";
        p.endereco = new Endereco();
        p.endereco.logradouro  = "Aveninda XYZ";
    }
}