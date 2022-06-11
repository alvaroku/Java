
package palindromo;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la frase ");
        String frase = entrada.nextLine().toLowerCase();
       
   
        if(palindromo(frase)){
            System.out.println("Es palindromo"); 
        }else{
            System.out.println("No es palindromo");
        }

    }
    
    
    
 public static boolean palindromo(String frase){
    String invertido = "";
    frase = frase.replace(" ", "");
    
    for(int i = frase.length()-1;i>=0;i--){
     invertido+=frase.charAt(i);
    }
    invertido = invertido.replace(" ", "");
    
 
    if(invertido.equals(frase)){
        return true;
    }else{
     return false;
 }
    
}
}
