
package obrenermayormenorarreglo;

import java.util.Scanner;

public class ObrenerMayorMenorArreglo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] arreglo = new int[7];
        
        arreglo[0] = 23;
        arreglo[1] = 45;
        arreglo[2] = 68;
        arreglo[3] = 99;
        arreglo[4] = 10;
        arreglo[5] = 15;
        arreglo[6] = 4;
        
        int mayor = arreglo[0];//se toma el primer numero con la posicion 0 en este caso es el 23
        int menor = arreglo[0];//23
        
        int posicionMayor = 0;
        int posicionMenor = 0;
        for (int i = 1; i < arreglo.length; i++) {//empieza desde la pisicion 1
            //para mayor
            if (arreglo[i]>mayor) {//si el numero de la posicion i es mayor, reemplaza el mayor con el numero de esa pisicion
                mayor = arreglo[i];
                posicionMayor = i;   
            }
            //para menor
            if (arreglo[i]<menor) {
                menor = arreglo[i];
                posicionMenor = i;   
            } 
            
        }
        
        System.out.println("El mayor es: "+mayor+" posición: "+posicionMayor);
        System.out.println("El menor es: "+menor+" posición: "+posicionMenor);
    } 
}
