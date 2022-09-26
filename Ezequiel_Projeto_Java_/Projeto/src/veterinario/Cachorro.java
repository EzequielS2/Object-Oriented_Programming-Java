package veterinario;


import java.text.NumberFormat;

/**
 *
 * @author EZEQUIEL
 */

public class Cachorro extends Mamiferos implements Precos {
    //atributos
    private String nome;
    private String raca;
    private int idade;

    //getters & setters
    public String getNome(){return nome;}

    public void setNome(String nome){this.nome = nome;}

    public String getRaca(){return raca;}

    public void setRaca(String raca){this.raca = raca;}

    public int getIdade(){return idade;}

    public void setIdade(int idade){this.idade = idade;}

    //método construtor comum
    public Cachorro(String n, String r, int id,  String diag, int d) {
        super(diag, d);
        this.nome = n;
        this.raca = r;
        this.idade = id;
    }

    //método construtor com sobrecarga
    public Cachorro(String n, int id, String diag, int d) {
        super(diag, d);
        this.nome = n;
        this.idade = id;
        this.raca = "Vira Lata (raça escolhida)";
    }

    public Cachorro() {
        super(null, 0);
    }  

    @Override
    public double total() {
        return getDias()*DIARIA + CONSULTA + EXAME;
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return ("Tipo Raça: " + getRaca() + 
                    "\nNome: " + getNome() + 
                        "\nIdade: " + getIdade() + " Anos" +
                            "\nDiagnóstico: " + getDiagnostico() +
                                    "\nDias de internação: " + getDias() + " Dias" +
                                        "\nTotal: " + nf.format(total()) + 
                                            "\n\n");
    }

}
