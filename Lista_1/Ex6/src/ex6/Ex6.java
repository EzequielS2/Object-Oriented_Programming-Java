/*
 3. Escreva um programa Java para ler duas matrizes 4x4 de reais. Escreva um
método para calcular a mutiplicação de duas matrizes seguindo a regra
matemática correta. Calcule e imprima a matriz produto resultante. Utilize
caixas de diálogo JoptionPane.
 */
package ex6;
import javax.swing.JOptionPane;
import javax.swing.*;
/**
 *
 * @author EZEQUIEL
 */
public class Ex6 {
    
    
    
    
    
    public static float[][] ProdutoMatriz(float[][] a, float[][] b){
        
        int i, j, n; 
        
        float[][] resultante = new float [4][4];
        
        float result=0;
        
        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                result=0;
                for(n=0; n<4; n++){
                
                    result = result+a[i][n]*b[n][j];
                }
                resultante[i][j]= result;
                
            }
            
            
        }
         
      
        return resultante;
        
        
    }

    public static void main(String[] args) {
        
        String mat;
        
        float[][] matrizz1 = new float [4][4];
        float[][] matrizz2 = new float [4][4];
        float[][] resultante = new float [4][4];
        
        int i, j; 
      
        
        
        for(i=0;i<4; i++){
            for(j=0;j<4; j++){
                
                mat = JOptionPane.showInputDialog("Informe a entrada "+(i+1)+"x"+(j+1)+" da matriz 1");
                
                matrizz1[i][j]= Float.parseFloat(mat);
                           
            }
    
        }
        
        for(i=0;i<4; i++){
            for(j=0;j<4; j++){
                
                mat = JOptionPane.showInputDialog("Informe a entrada "+(i+1)+"x"+(j+1)+" da matriz 2");
                
                matrizz2[i][j]= Float.parseFloat(mat);
                
            }
    
        }
        
        
        System.out.println("Matriz 1 \n ");
        
        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                
                System.out.print(matrizz1[i][j]+" ");      
            }
            System.out.println("");
            
        }
        
        System.out.println("\n\nMatriz 2 \n ");
        
        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                
                System.out.print(matrizz2[i][j]+" ");      
            }
            System.out.println("");
            
        }
        
        System.out.println("\n\nMatriz Resultante da Multiplicação: \n \n");
        
        resultante=ProdutoMatriz(matrizz1, matrizz2);
        
        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                
                System.out.print(resultante[i][j]+" ");      
            }
            System.out.println("");
            
        }
        
        
    }
    
    
}
