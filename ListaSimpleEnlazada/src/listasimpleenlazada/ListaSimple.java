
package listasimpleenlazada;


class listaSimple {

        private Nodo primero;
        private int numElem;

        public listaSimple() {
            primero = null;
            numElem = 0;
        }

        public void insertarPrimero(Empleado elemento) {
            Nodo nuevo = new Nodo(elemento, primero);
            primero = nuevo;
            numElem++;
        }

        public void insertarFinal(Empleado elemento) {
            Nodo nuevo = new Nodo(elemento, null);
            if (primero == null) {
                primero = nuevo;
            } else {
                Nodo actual = primero;
                while (actual.getSig() != null) {
                    actual = actual.getSig();

                }
                actual.setSig(nuevo);
                numElem++;
            }
            //System.out.println("Final");
        }

        public void borrar(Empleado elem) {
            if (primero == null) {
                System.out.println("lista vacía");
            } else if (primero.getElemento() == elem) {
                primero = primero.getSig();
                numElem--;
            } else {
                Nodo actual = primero;
                while (actual.getSig() != null && actual.getSig().getElemento() != elem) {
                    actual = actual.getSig();
                }
                if (actual.getSig() == null) {
                    System.out.println("elemento " + elem + " no esta en la lista");
                } else {
                    actual.setSig(actual.getSig().getSig());
                    numElem--;
                }
            }
        }

        public void NumeroDeEmpleadosConMasDe15MinutosDeTardanza() {
            Nodo actual = primero;
            
            int cont = 0;
            if(actual!=null && actual.getElemento().MinutosDeTardanza>15)cont++;
            
            while (actual.getSig() != null) {
                //System.out.println(actual.getElemento());
                actual = actual.getSig();
                
                if(actual.getElemento().MinutosDeTardanza>15){
                    cont++;
                }
            }
            System.out.println(cont);
        }
        public void NombreDelEmpleadoConMayorTiempoDeTardanzaConContratoService() {
            Nodo actual = primero;
            
            String nombre = "";
            int mayorTiempoTardanza = 0;
            if(actual!=null && actual.getElemento().Tipo_Contrato==TiposContrato.Service){
                mayorTiempoTardanza=actual.getElemento().MinutosDeTardanza;
                nombre = actual.getElemento().Nombre;
            }
            
            while (actual.getSig() != null) {
                //System.out.println(actual.getElemento());
                actual = actual.getSig();
                
                if(actual.getElemento().MinutosDeTardanza>mayorTiempoTardanza && actual.getElemento().Tipo_Contrato==TiposContrato.Service){
                    mayorTiempoTardanza = actual.getElemento().MinutosDeTardanza;
                    nombre = actual.getElemento().Nombre;
                }

            }
            System.out.println(nombre);
        }
        public void ElMayorMontoDeMovilidadAsignadoAUnEmpleadoConContratoAPlazoFijoConSueldoMenorA1500Soles(){
            Nodo actual = primero;
            
            float mayorMontoDeMovilidad = 0f;
            if(actual!=null && actual.getElemento().Tipo_Contrato==TiposContrato.AplazoFijo && actual.getElemento().Sueldo<1500){
                mayorMontoDeMovilidad=actual.getElemento().MontoAsignadoPorMovilidad;
            }
            
            while (actual.getSig() != null) {
                //System.out.println(actual.getElemento());
                actual = actual.getSig();
                
                if(actual.getElemento().MontoAsignadoPorMovilidad>mayorMontoDeMovilidad &&actual.getElemento().Tipo_Contrato==TiposContrato.AplazoFijo && actual.getElemento().Sueldo<1500){
                    mayorMontoDeMovilidad = actual.getElemento().MontoAsignadoPorMovilidad;
                }

            }
            System.out.println(mayorMontoDeMovilidad);
        }
    }