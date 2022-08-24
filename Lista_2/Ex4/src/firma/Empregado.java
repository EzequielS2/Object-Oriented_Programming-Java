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
public abstract class Empregado implements Calculos, Constantes  {
  
    //getters & setters
    public abstract String getMatricula();
    public abstract String getNome();
    public abstract double getSalario();
    public abstract double getComissao();
    public abstract void setComissao(double x);
    public abstract void setSalario(double x);
    public abstract void setNome(String x);
    public abstract void setMatricula(String x);
    public abstract String getTitulo();
    public abstract void setTitulo(String titulo);
    
    
}
