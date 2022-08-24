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
public class Vendedor extends Empregado {
    
    private double comissao, salario;
    private String nome;
    private String matricula;
    private String titulo;
    
    public Vendedor(String m, String n, String t,double s, double c)
    { 
        this.matricula=m;
        this.salario=s;
        this.nome=n;
        this.titulo=t;
        this.comissao = c;
    }
    
    public double calc1 (){ return calc() * (1 + this.comissao / 100); }
    public  double calc (){
     return salario*DESCONTO;    
    }
    
    //super.calc() retorna salario*0.85
    //getters & setters
    public double getComissao(){ return comissao; }
    public void setComissao(double comissao){ this.comissao = comissao; }
    
    public String getTitulo(){ return titulo; }
    public void setTitulo(String titulo){ this.titulo = titulo; }
    
    public String getMatricula(){ return matricula; }
    public void setMatricula(String matricula){ this.matricula = matricula; }
    
    public String getNome(){ return nome; }
    public void setNome(String nome){ this.nome = nome; }
    
    public double getSalario(){ return salario; }
    public void setSalario(double salario){ this.salario = salario; }
}
