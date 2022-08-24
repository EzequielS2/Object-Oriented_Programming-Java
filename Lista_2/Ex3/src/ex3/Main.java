/*

Exercício 3:

Criar uma classe (revise a apostila a partir da página 53), com método main para gerar um array
de objetos Shape (Circle e Rectangle), inicializar os campos dos objetos e imprimir os valores das
áreas, das circunferências e perímetros e da área total (DICA: veja a vídeo aula 8 e siga o passo a passo
até essa parte). Criar também uma nova classe Triangle, nos moldes de Circle e Rectangle, com
implementações para área e perímetro de um triângulo. Incluir objetos desta classe no array de objetos
Shape e imprimir os valores das áreas, dos perímetros e da área total destes objetos.

 */


package ex3;

/**
 *
 * @author EZEQUIEL
 */
public class Main {

    
    public static void main(String[] args) {
    
    double totalArea = 0;
    
    Shape[] formas = new Shape[3]; //Cria array
    
    formas[0] = new Circle (2.0); //Preenche array
    formas[1] = new Rectangle (1.0, 3.0);
    formas[2] = new Triangle (4.0, 2.0);
    
    System.out.println("Círculo:\n\n"+ "Área: "+formas[0].area()+"\nPerímetro: "+formas[0].total()+
     "\n\nRetângulo: \n\n" + "Área: "+formas[1].area()+ "\nPerímetro: "+formas[1].total()+
    "\n\nTriângulo: \n"+"\nÁrea: "+formas[2].area()+"\nPerímetro: "+ formas[2].total()+"\n");
    
    for (int i = 0; i < formas.length; i++)
    totalArea += formas[i].area();
    
    System.out.println("Área total dos objetos: "+totalArea+"\n");
    }
    
}
