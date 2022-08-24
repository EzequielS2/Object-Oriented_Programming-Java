/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author EZEQUIEL
 */
public class Circle extends Shape
{ 
    public static final double PI = 3.14159;
    private double r;
    public Circle (double r){ this.r = r; }
    
    public double getRadius () //Acessador
    { return r;
    }
    
    public double area () //Implementa o abstrato
    { 
        return (PI*r*r);
    }   
    public double total () //circunferencia
    { 
        return (2*PI*r);
    }
}
