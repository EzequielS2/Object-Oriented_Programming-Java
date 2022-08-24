/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firma;

/**
 *
 * @author EZEQUIEL
 */
public class Empregado {
    
    private String matricula, nome;
    private double salario;
    
    public Empregado (String m, String n, double s)
    {   matricula = m;
        nome = n;
        salario = s;
    }
    public Empregado (String m, String n)
    { 
        this(m, n, 0 ); //sobrecarga salário não definido
    }
    public double calc ()
    { 
        return salario * 0.85;
    }
    //getters & setters
    public String getMatricula(){ return matricula; }
    
    public void setMatricula(String matricula){ this.matricula = matricula; }
    
    public String getNome(){ return nome; }
    
    public void setNome(String nome){ this.nome = nome; }
    
    public double getSalario(){ return salario; }
    
    public void setSalario(double salario){ this.salario = salario; }
    
}
