
package listasimpleenlazada;

import java.util.Scanner;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner input = new Scanner(System.in);
        listaSimple listaEnlazada = new listaSimple();
        //datos de prueba
        //listaEnlazada.insertarPrimero(new Empleado(342,"Dani", TiposContrato.AplazoFijo, 1200, 1400, 12));
        //listaEnlazada.insertarPrimero(new Empleado(342,"Daniel", TiposContrato.Service, 1700, 1900, 17));
        //listaEnlazada.insertarPrimero(new Empleado(342,"Alvaro", TiposContrato.ServiciosNoPersonales, 1800, 2000, 18));
        while(true){
            
            System.out.println("Opciones\n1.Registrar Empleado\n2.Salir");
            int opcion = input.nextInt();
            
            if (opcion == 2){
                break;
            }else if (opcion != 1){
                System.out.println("Opcion no válida");
            }else{
                System.out.println("Codigo");
                int Codigo = input.nextInt();;
                System.out.println("Nombre");
                String Nombre = input.next();;
                TiposContrato Tipo_Contrato;
                System.out.println("Tipos de Contraro.\n 1.A plazo fijo\n 2.Servicios no personales\n 3.Service\nIngrese una opción");
                int op = input.nextInt();
                while (op<=0 || op>3) {  
                    System.out.println("Por favor ingrese un tipo de contrato válido");
                    op = input.nextInt();
                }
                if(op==1){
                    Tipo_Contrato = TiposContrato.AplazoFijo;
                }else if(op==2){
                    Tipo_Contrato = TiposContrato.ServiciosNoPersonales;
                }else{
                    Tipo_Contrato = TiposContrato.Service;
                }
                
                System.out.println("Sueldo");
                float Sueldo = input.nextFloat();
                System.out.println("Monto asignado por movilidad");
                float MontoAsignadoPorMovilidad = input.nextFloat();;
                System.out.println("Minutos de tardanza");
                int MinutosDeTardanza = input.nextInt();
                
                Empleado e = new Empleado(Codigo, Nombre, Tipo_Contrato, Sueldo, MontoAsignadoPorMovilidad, MinutosDeTardanza);
                listaEnlazada.insertarPrimero(e);
            } 
        }
        System.out.println("Numero de empleados con mas de 15 minutos de tardanza");
        listaEnlazada.NumeroDeEmpleadosConMasDe15MinutosDeTardanza();
        System.out.println("Nombre del empleado con mayor tiempo de tardanza con tipo de contrato por Service");
        listaEnlazada.NombreDelEmpleadoConMayorTiempoDeTardanzaConContratoService();
        System.out.println("El mayor monto de movilidad asignado a un empleado con contrato a plazo fijo con sueldo menor a 1500 soles");
        listaEnlazada.ElMayorMontoDeMovilidadAsignadoAUnEmpleadoConContratoAPlazoFijoConSueldoMenorA1500Soles();
    }
 
}

