package vehiculos;


public class Vehiculo {
    public String placa;
    public int puertas;
    public int velocidadMaxima;
    public String nombre;
    public int precio;
    public int peso;
    public String traccion;
    public Fabricante fabricante;
    public static int CantidadVehiculos;
    public static int cantidadAutomoviles;
    public static int cantidadCamiones;
    public static int cantidadCamionetas;



    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,
                    String traccion, Fabricante fabricante) {
        super();
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        CantidadVehiculos++;
        fabricante.getPais().vendidos++;
        fabricante.vendidosFabrica++;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getPuertas() {
        return puertas;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public String getTraccion() {
        return traccion;
    }
    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
    public Fabricante getFabricante() {
        return fabricante;
    }
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    public static int getCantidadVehiculos() {
        return CantidadVehiculos;
    }
    public static void setCantidadVehiculos(int cantidadVehiculos) {
        CantidadVehiculos = cantidadVehiculos;
    }

    public static String vehiculosPorTipo(){
        return "Automoviles:"+cantidadAutomoviles+"\n"+"Camionetas:"+cantidadCamionetas+"\n"+"Camiones:"+cantidadCamiones;
    }
}
