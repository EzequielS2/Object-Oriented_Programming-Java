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
    
    private double comissao;
    public Vendedor(String m, String n, double s, double c)
    { 
        super(m, n, s);
        this.comissao = c;
    }
    public double calc (){ return super.calc() * (1 + this.comissao / 100); }
    //super.calc() retorna salario*0.85
    //getters & setters
    public double getComissao(){ return comissao; }
    public void setComissao(double comissao){ this.comissao = comissao; }
}
