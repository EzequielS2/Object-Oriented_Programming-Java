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
public class Tecnico extends Empregado {
    
    private String titulo;
    private String nome;
    private String matricula;
    private double comissao, salario;
    
    public Tecnico(String m, String n, double s, String t, double c)
    { 
        this.matricula=m;
        this.salario=s;
        this.nome=n;
        this.titulo = t;
        this.comissao = 0;
    }
    
    public Tecnico(String m, String n, String t)
    { 
        this(m,n,0, t, 0); // Sobercarga
        
    }
    public Tecnico(String m, String n, double s)
    { 
        this(m,n,s, "Sr.", 0); // Sobercarga
        
    }
    
    
     public  double calc (){
     return salario*DESCONTO;    
     }
     
    public String getMatricula(){ return matricula; }
    public void setMatricula(String matricula){ this.matricula = matricula; }
    
    public String getNome(){ return nome; }
    public void setNome(String nome){ this.nome = nome; }
    
    public double getSalario(){ return salario; }
    public void setSalario(double salario){ this.salario = salario; }
    
    public double getComissao(){ return comissao; }
    public void setComissao(double comissao){ this.comissao = 0; }
    
    //getters & setters
    public String getTitulo(){ return titulo; }
    public void setTitulo(String titulo){ this.titulo = titulo; }
}
