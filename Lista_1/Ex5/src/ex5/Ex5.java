/*
 5. Escreva um programa Java para ler duas matrizes 3x3 de reais. Escreva um
método para ler uma matriz usando caixas de diálogo JOptionPane. Leia duas
matrizes chamando o método duas vezes. Crie um método para calcular a subtração
de duas matrizes. Calcule a matriz subtração a partir das duas matrizes lidas. Crie um
método para imprimir uma matriz. Imprima a matriz subtração resultante.
 */
package ex5;
import javax.swing.JOptionPane;
import javax.swing.*;
/**
 *
 * @author EZEQUIEL
 */
public class Ex5 {

   
    public static float[][] SubMatriz(float[][] a, float[][] b){ // Método = Função
          float[][] resultante = new float[3][3];
          
          int i, j;
          
          for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                
                resultante[i][j] = a[i][j]-b[i][j];
            }
                
          }
          
          return resultante; 
    }
    
    public static void LerMatriz(float[][] a){ 
          
          int i, j;
          
          String mat;
          
          for(i=0;i<3; i++){
            for(j=0;j<3; j++){
                
                mat = JOptionPane.showInputDialog("Informe a entrada "+(i+1)+"x"+(j+1)+" da matriz");
                
                a[i][j]= Float.parseFloat(mat);
            }
        }
    }
    
    
    public static void ImprimirMatriz(float[][] a){ // Método = Função
          
          int i, j;
          
          String mat;
          
          for(i=0; i<3; i++){
            for(j=0; j<3; j++){
              
                System.out.print(a[i][j]+" ");
            }
                System.out.println("");
          }
    }
    
          
    public static void main(String[] args) {
        
       int i, j;
       
       
       float[][] matrizz1 = new float [3][3];
       float[][] matrizz2 = new float [3][3];
       float[][] resultante = new float[3][3];
       
       LerMatriz(matrizz1); // Lendo mstriz 1
       
       LerMatriz(matrizz2); // Lendo matriz 2
       
       System.out.println("\nMatriz 1 \n ");
       ImprimirMatriz(matrizz1);
       
       System.out.println("\n\nMatriz 2 \n ");
       ImprimirMatriz(matrizz2);
       
       System.out.println("\n\nMatriz Resultante da Subtração: \n");
      
       resultante=SubMatriz(matrizz1, matrizz2);
       
       ImprimirMatriz(resultante);
    
    }
    
}
