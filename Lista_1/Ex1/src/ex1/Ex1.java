/*
 Escreva um programa Java para determinar o valor da seguinte expressão: R =
y^x/(z^y + 2^y), dados x = 231, y = 7, z = 23. O resultado deve ser informado via
console padrão.
 */
package ex1;
import static java.lang.Math.*;

/**
 *
 * @author EZEQUIEL
 */
public class Ex1 {

    
    public static void main(String[] args) {
        
        int x, y, z;
        
        x=231;
        y=7;
        z=23;
        
        System.out.println("Resultado da expressão y^x/(z^y + 2^y): ");
        System.out.println("");
        
        System.out.print("R = ");
        System.out.println(pow(y,x)/(pow(z,y)+pow(2,y)));
        System.out.println("");
        
        
    }
    
}
