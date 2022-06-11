
package listasimpleenlazada;

public class Empleado {
    int Codigo;
    String Nombre;
    TiposContrato Tipo_Contrato;
    float Sueldo;
    float MontoAsignadoPorMovilidad;
    int MinutosDeTardanza;

    public Empleado(int Codigo, String Nombre, TiposContrato Tipo_Contrato, float Sueldo, float MontoAsignadoPorMovilidad, int MinutosDeTardanza) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Tipo_Contrato = Tipo_Contrato;
        this.Sueldo = Sueldo;
        this.MontoAsignadoPorMovilidad = MontoAsignadoPorMovilidad;
        this.MinutosDeTardanza = MinutosDeTardanza;
    }
}
enum TiposContrato {
    AplazoFijo,
    ServiciosNoPersonales,
    Service
}

