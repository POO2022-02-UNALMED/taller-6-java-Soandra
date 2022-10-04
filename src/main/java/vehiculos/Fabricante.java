package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    public int unidadesFabrica;
    private static ArrayList<Fabricante> listaFabricas = new ArrayList<>();

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        listaFabricas.add(this);
    }

    public static Fabricante fabricaMayorVentas(){
        Fabricante fabricanteMayor = null;
        int contador = 0;
        for (int i = 0; i < listaFabricas.size(); i++) {
            if (listaFabricas.get(i).unidadesFabrica > contador){
                contador = listaFabricas.get(i).unidadesFabrica;
                fabricanteMayor = listaFabricas.get(i);
            }

        }
        return fabricanteMayor;
    }
    //getters y setters
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

    public int getUnidadesFabrica() {
        return unidadesFabrica;
    }

    public void setUnidadesFabrica(int unidadesFabrica) {
        this.unidadesFabrica = unidadesFabrica;
    }

    public static ArrayList<Fabricante> getListaFabricas() {
        return listaFabricas;
    }

    public static void setListaFabricas(ArrayList<Fabricante> listaFabricas) {
        Fabricante.listaFabricas = listaFabricas;
    }
}
