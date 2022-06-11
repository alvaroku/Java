
package listasimpleenlazada;

class Nodo {

        private Empleado elemento;
        private Nodo siguiente;

        public Nodo(Empleado elem, Nodo sig) {
            elemento = elem;
            siguiente = sig;
        }

        public Empleado getElemento() {
            return elemento;
        }

        public Nodo getSig() {
            return siguiente;
        }

        public void setElemento(Empleado elem) {
            elemento = elem;
        }

        public void setSig(Nodo sig) {
            siguiente = sig;
        }
    }