
package ordenamiento_seleccion_insercion;

import java.util.Arrays;
import java.util.Scanner;
public class Ordenamiento_seleccion_insercion {
    
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        //tamaño del arreglo
        System.out.println("Ingrese el número de elementos: ");
        int n = input.nextInt();  
        //crear el arreglo
        int[] arreglo = new int[n];
        //obtener datos
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese los valores: ");
            arreglo[i] = input.nextInt();    
       }
        System.out.println("Menu\n   1.Seleción\n   2.Inserción\nEscoja una opción: ");
        
        int o = input.nextInt();
        if (o ==1) {
            seleccion(arreglo);
        }else if (o == 2) {
            insercionDirecta(arreglo);
        }
         
    }
    
    public static void seleccion(int[]a){
        for(int i=0;i<a.length;i++){
             for (int j=i;j<a.length;j++){
                 if (a[i] > a[j]){ 
                     int aux = a[j];
                     System.out.println(Arrays.toString(a)+"i="+i+" j="+j+" A="+a[i]+" B="+aux+" minimo="+a[j]);
                     a[j] = a[i];
                     a[i] = aux;  
                 }  
             }
        }
         System.out.println("Arreglo Final: "+Arrays.toString(a));
    }
    
    public static void insercionDirecta(int[]a){  
       int i, k = 0;
       int x;
       for (i = 1; i < a.length; i++) {
           x = a[i];
           k = i - 1;
           while (k >= 0 && x < a[k]) {
               System.out.println(Arrays.toString(a)+"i="+k+" j="+i+" A="+a[k]+" B="+a[i]);
               a[k + 1] = a[k]; // hacer hueco para poder insertar
               k--;
           }
           a[k + 1] = x; // insertamos x en su lugar
       }
       System.out.println("Arreglo Final: "+Arrays.toString(a));
    }
}
    

