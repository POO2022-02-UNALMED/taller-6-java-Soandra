package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    public int vendidosFabrica;
    public static ArrayList<Fabricante> listaFabricas = new ArrayList<Fabricante>();

    public Fabricante(String nombre, Pais pais) {
        super();
        this.nombre = nombre;
        this.pais = pais;
        this.vendidosFabrica = 0;
        listaFabricas.add(this);
    }

    public static Fabricante fabricaMayorVentas() {
        Fabricante mayorVendedor = null;
        int vendidos=0;
        for (Fabricante fabricante: listaFabricas) {
            if(fabricante.vendidosFabrica>vendidos) {
                vendidos = fabricante.vendidosFabrica;
                mayorVendedor = fabricante;
            }
        }
        return mayorVendedor;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getVendidosFabrica() {
        return vendidosFabrica;
    }

    public void setVendidosFabrica(int vendidosFabrica) {
        this.vendidosFabrica = vendidosFabrica;
    }

    public static ArrayList<Fabricante> getListaFabricas() {
        return listaFabricas;
    }

    public static void setListaFabricas(ArrayList<Fabricante> listaFabricas) {
        Fabricante.listaFabricas = listaFabricas;
    }
}
