package vehiculos;

public class Automovil extends Vehiculo{
     int puestos;
    static int cantidadAutomoviles;


    public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        Automovil.cantidadAutomoviles++;
    }

    //getters y setters
    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public static int getCantidadAutomoviles() {
        return cantidadAutomoviles;
    }

    public static void setCantidadAutomoviles(int cantidadAutomoviles) {
        Automovil.cantidadAutomoviles = cantidadAutomoviles;
    }
}
