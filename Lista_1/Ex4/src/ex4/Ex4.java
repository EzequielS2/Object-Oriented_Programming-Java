/*
 4. Escreva um programa Java para ler um vetor chamado V1 de notas de 3 alunos
e também o vetor chamado V2. Crie um método para calcular a média entre dois
números double. Este método deve ser chamado em um laço no comando
necessário para preencher o respectivo valor do vetor media com a média entre as
notas dos vetores V1 e V2. Imprima, para cada aluno, o número, a nota V1, a nota
V2, a média e a situação (“aprovado” se media>= 6.0, “VS” se média entre 4.0 e 5.9,
“reprovado” se média < 4.0). Utilize caixas de diálogo JoptionPane.
 */
package ex4;
import javax.swing.*;
/**
 *
 * @author EZEQUIEL
 */
public class Ex4 {

    
    public static void main(String[] args) {
        String numero1, numero2;
        
        double[] V1 = new double[3];
        double[] V2 = new double[3];
        
        double[] media = new double[3];
        
        double n1, n2;
        
        int i;
       

        
        for(i=0; i<3; i++){
             // leitura
            numero1 = JOptionPane.showInputDialog("Aluno"+(i+1),"Informe a P1: ");
            numero2 = JOptionPane.showInputDialog("Aluno"+(i+1),"Informe a P2: ");
            
            // conversão
            V1[i] = Double.parseDouble( numero1 );
            V2[i] = Double.parseDouble( numero2 );
            
            
        }
       
        for(i=0; i<3; i++){
            System.out.println("Aluno número "+(i+1));
            System.out.println("P1: "+V1[i]+", P2: "+V2[i]);
            media[i]=(V1[i]+V2[i])/2.0;
            System.out.println("Média: "+media[i]);
            
            if(media[i]>=7.0){
                System.out.println("Situação: Aprovado");
                
            }
            else if(media[i]>=4.0 && media[i]<=5.9){
                
                System.out.println("Situação: precisando de "+(10-media[i])+" para a final");
                
            }
            else{
                System.out.println("Situação: reprovado");
                
            }
            
            System.out.println("------------------------");
                
        }
    }
    
}
