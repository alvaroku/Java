 
package arrays;

import java.util.ArrayList;

 
public class Arrays {

     
    public static void main(String[] args) {
      

        ArrayList<String> palabras = new ArrayList<String>();
        palabras.add("Antioneta");
        palabras.add("Ferran");
        palabras.add("Mariaaaaaaaaaaaaaa");
        palabras.add("Jose");
        palabras.add("Paco");
        System.out.println("El String mayor es: "+palabras.get(met3(palabras)));

        

    }

   
    public static int met3(ArrayList<String> palabras){
        int mayor = 0;
        int longitud = 0;
        int posMayor=0;
        for (int i = 0; i < palabras.size();i++) {
            longitud = palabras.get(i).length();
        
            if (longitud>mayor) {
                mayor = longitud;
                posMayor=i;
            }
        }
        
        return posMayor;
    }
}
    
