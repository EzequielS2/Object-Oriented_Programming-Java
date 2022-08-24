/*
 Escreva um programa Java para contar as ocorrências da letra “a” na frase:
“Os nomes das classes em Java precisam começar com uma letra e depois
desta quaisquer combinações de letras e dígitos. Como padrão, os nomes são
substantivos que iniciam com uma maiúscula. Para as constantes é costume
utilizar sempre maiúsculas nos nomes”.
 */
package ex2;

/**
 *
 * @author EZEQUIEL
 */
public class Ex2 {

    
    public static void main(String[] args) {
        
        String frase="Os nomes das classes em Java precisam começar com uma letra e depois\n" +
"desta quaisquer combinações de letras e dígitos. Como padrão, os nomes são\n" +
"substantivos que iniciam com uma maiúscula. Para as constantes é costume\n" +
"utilizar sempre maiúsculas nos nomes";
		 
        int ocr=0;  // Ocorrencias da letra "a" na frase
	   
        for(int i=0; i<frase.length();i++){  
 
	    char aux = frase.charAt(i);  
	    String aux2 = String.valueOf(aux); 

            // String.ValueOf(aux) passa aux de -char- para -String-  
              
	    if(aux2.equalsIgnoreCase("a")){  
	       ocr++;  
	   
            }  
        }  
        
        System.out.print("Número de ocorrencias da letra a na frase: ");
	System.out.println(ocr);  
    }
    
}


