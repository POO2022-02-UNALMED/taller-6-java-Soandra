package vehiculos;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    public int vendidos=0;
    public static ArrayList<Pais> listaPaises = new ArrayList<Pais>();

    public Pais(String nombre) {
        super();
        this.nombre = nombre;
        this.vendidos = 0;
        listaPaises.add(this);
    }

    public static Pais paisMasVendedor() {
        Pais vendedor = null;
        int vendidos=0;
        for (Pais pais: listaPaises) {
            if(pais.vendidos>vendidos) {
                vendidos = pais.vendidos;
                vendedor = pais;
            }
        }
        return vendedor;
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getVendidos() {
        return vendidos;
    }
    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }



}
