
package registrohotel;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistroHotel {
    static ArrayList<hotel> arrayHoteles;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        arrayHoteles = new ArrayList<hotel>();
        
        while(true){
            System.out.println("Que desea hacer? 1)Agregar hotel 2)Ver hotel 3)Modificar hotel 4)Borrar hotel 5)Salir");
            int o = entrada.nextInt();
            entrada.nextLine(); 
            if(o==1){
                crearHotel();
            }else if(o==2){
                System.out.println("nombre a buscar mostrar: ");
                String nom = entrada.next();
                veureHotel(nom);
            }else if(o==3){
                System.out.println("nombre a modificar: ");
                String nom = entrada.next();
                modificarHotel(nom);
            }else if(o==4){
                System.out.println("nombre a eliminar: ");
                String nom = entrada.next();
                donarDeBaixaHotel(nom);
            }else if(o==5){
                break;
            }
            
        }
        

        //System.out.println("hoteles "+arrayHoteles.size());
    }
    static void crearHotel(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre del hotel: ");
        String nombre = entrada.nextLine();
        System.out.println("Número de habitaciones: ");
        int numHab = entrada.nextInt();
        System.out.println("Número de plantas: ");
        int numPlantas = entrada.nextInt();
        System.out.println("Supericie: ");
        float superficie = entrada.nextFloat();
        
        hotel h = new hotel(nombre, numHab, numPlantas, superficie);
        arrayHoteles.add(h);
    }
    static void donarDeBaixaHotel(String nombre){
        for(int i=0;i<arrayHoteles.size();i++){
            if(arrayHoteles.get(i).getNombre().equals(nombre)){
                arrayHoteles.remove(i);
                System.out.println("Hotel elminado");
            }else{
                System.out.println("No se encontró el hotel");
            }
        }  
    }
    static void veureHotel(String nombre){
        for(int i=0;i<arrayHoteles.size();i++){
            if(arrayHoteles.get(i).getNombre().equals(nombre)){
                hotel h = arrayHoteles.get(i);
                System.out.println("Nombre: "+h.getNombre());
                System.out.println("Numero de habitaciones: "+h.getNumHab());
                System.out.println("Numero de plantas: "+h.getNumPlantas());
                System.out.println("Superficie: "+h.getSuperficie());
                h.calcularMantenimiento();
            }else{
                System.out.println("No se encontró el hotel");
            }
        }  
    }
    static void modificarHotel(String nombre){
         for(int i=0;i<arrayHoteles.size();i++){
             if(arrayHoteles.get(i).getNombre().equals(nombre)){
                 Scanner entrada = new Scanner(System.in);
                 System.out.println("Qué desea modificar? 1)Numero de habitaciones 2)Numero de plantas 3)Superficie");
                 int op = entrada.nextInt();
                 if(op==1){
                     System.out.println("Ingrese el número de habitaciones");
                     int numHab = entrada.nextInt();
                     arrayHoteles.get(i).setNumHab(numHab);
                     System.out.println("Numero de habitaciones modificado");
                 }else if(op==2){
                     System.out.println("Ingrese el número de plantas");
                     int numPlantas = entrada.nextInt();
                     arrayHoteles.get(i).setNumPlantas(numPlantas);
                     System.out.println("Numero de plantas modificado");
                 }else if(op==3){
                     System.out.println("Ingrese el número de habitaciones");
                     float superficie = entrada.nextFloat();
                     arrayHoteles.get(i).setSuperficie(superficie);
                     System.out.println("Valor de superficie modificado");
                 }else{
                     System.out.println("Opcion no válida");
                 }
             }else{
                 System.out.println("No se encontró el hotel");
             }
         }
    }
}


class hotel{
    String nombre;
    int numHab;
    int numPlantas;
    float superficie;
    
    public hotel(String nombre, int numHab, int numPlantas, float superficie){
        this.nombre = nombre; 
        this.numHab = numHab;
        this.numPlantas = numPlantas;
        this.superficie = superficie;
    }
    //setters
    void setNombre(String nombre){
        this.nombre = nombre; 
    }
    void setNumHab(int numHab){
        this.numHab = numHab;
    }
    void setNumPlantas(int numPlantas){
        this.numPlantas = numPlantas;
    }
    void setSuperficie(float superficie){
        this.superficie = superficie;
    }
    //getters
    String getNombre(){
       return this.nombre; 
    }
    int getNumHab(){
       return this.numHab;
    }
    int getNumPlantas(){
       return this.numPlantas;
    }
    float getSuperficie(){
        return this.superficie;
    }
    
    void calcularMantenimiento(){
        int numPersonas = numHab/20;
        float total = numPersonas*1500;
        System.out.println("Número de personas necesarias: "+numPersonas);
        System.out.println("Coste total: "+total);
    }
}

