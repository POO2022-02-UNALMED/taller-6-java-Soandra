package vehiculos;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private int unidadesPais;
    private static ArrayList<Pais> listaPaises = new ArrayList<>();

    public Pais(String nombre) {
        this.nombre = nombre;
        listaPaises.add(this);
    }

    public static Pais  paisMasVendedor(){
        Pais paisMayor = null;
        int contador = 0;
        for (int i = 0; i < listaPaises.size(); i++) {
            if (listaPaises.get(i).unidadesPais > contador){
                contador = listaPaises.get(i).unidadesPais;
                paisMayor = listaPaises.get(i);
            }
        }
        return paisMayor;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidadesPais() {
        return unidadesPais;
    }

    public void setUnidadesPais(int unidadesPais) {
        this.unidadesPais = unidadesPais;
    }

    public static ArrayList<Pais> getListaPaises() {
        return listaPaises;
    }

    public static void setListaPaises(ArrayList<Pais> listaPaises) {
        Pais.listaPaises = listaPaises;
    }
}
