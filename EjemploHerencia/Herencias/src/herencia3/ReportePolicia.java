/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

import herencias2.Policia;
import java.util.ArrayList;

/**
 *
 * @author xavierchavez
 */
public class ReportePolicia extends Reporte {

    private double promedioEdad;
    private ArrayList<Policia> lista;

    public ReportePolicia(String n, ArrayList<Policia> lis) {
        super(n);
        setLista(lis);
    }

    public void setLista(ArrayList<Policia> s) {
        lista = s;
    }

    public void setPropmedioEdad() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getEdad();
        }
        promedioEdad = suma / lista.size();
    }

    public ArrayList<Policia> getLista() {
        return lista;
    }

    public double getPromedioEdad() {
        return promedioEdad;
    }

    @Override
    public String toString() {
        String cadena = String.format("\t\t\tPOLICIA\nCodigo: %s",
                super.toString());
        for (int i = 0; i < getLista().size(); i++) {
            cadena = String.format("%s\nNombre: %s - Apellido: %s - Edad: %s",
                    cadena,
                    getLista().get(i).getNombre(),
                    getLista().get(i).getApellido(),
                    getLista().get(i).getEdad());
        }
        cadena = String.format("%s\nPromedio de edades: %.2f", cadena,
                getPromedioEdad());

        return cadena;
    }
}
