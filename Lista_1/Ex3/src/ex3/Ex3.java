/*
Escreva um programa Java para exibir os seguintes números nos respectivos
formatos, usando printf e NumberFormat:
◦ 12345.6789 com dois dígitos decimais;
◦ 12345.6789 com dez dígitos decimais;
◦ O resultado de 1/5 no formato número local, com quatro dígitos decimais;
◦ 345.71 no formato da moeda local (só NumberFormat);
 */
package ex3;

import java.text.NumberFormat; // Biblioteca para o format

/**
 *
 * @author EZEQUIEL
 */
public class Ex3 {

    
    public static void main(String[] args) {
       double x = 12345.6789;
       
       System.out.println("12345.6789 com dois dígitos decimais: ");
       System.out.println("");
       
       System.out.print("Printf: ");
       System.out.printf("%8.2f", x);
       System.out.println("");
       
       NumberFormat nf = NumberFormat.getNumberInstance();
       nf.setMaximumFractionDigits(2);
       String fx = nf.format(x); //string “12.345,68”
       System.out.print("NumberFormat: ");
       System.out.println( fx ); //imprimir o formatado
       
       System.out.println("-----------");
       System.out.println("");
       
       
       
       System.out.println("12345.6789 com dez dígitos decimais: ");
       System.out.println("");
       
       System.out.print("Printf: ");
       System.out.printf("%8.10f", 12345.6789);
       System.out.println("");
       
       x = 12345.6789;
       nf = NumberFormat.getNumberInstance();
       nf.setMaximumFractionDigits(10);
       fx = nf.format(x); 
       System.out.print("NumberFormat: ");
       System.out.println( fx ); //imprimir o formatado
       
       System.out.println("-----------");
       System.out.println("");
       
       System.out.print("O resultado de 1/5 no formato número local, com quatro dígitos decimais: ");
        
       nf = NumberFormat.getNumberInstance();
       nf.setMaximumFractionDigits(4);
       fx = nf.format(1.0/5.0); 
       System.out.println( fx ); //imprimir o formatado
       
       System.out.println("");
       
       System.out.println("-----------");
       System.out.println("");
       
       System.out.print("345.71 no formato da moeda local (só NumberFormat): ");
       
       nf = NumberFormat.getCurrencyInstance();
       fx = nf.format(345.71); //string 'R$ 345,71
       System.out.println( fx ); //imprimir o formatado
       System.out.println("");
       
       System.out.println("-----------");
    }
    
}
