/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

import herencias2.Docente;
import java.util.ArrayList;

/**
 *
 * @author xavierchavez
 */
public class ReporteDocente extends Reporte {

    private ArrayList<Docente> lista;
    private double promedioSueldo;

    public ReporteDocente(String n, ArrayList<Docente> lis) {
        super(n);
        setLista(lis);
    }

    public void setLista(ArrayList<Docente> s) {
        lista = s;
    }

    public void setPromedioSueldo() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getSueldo();
        }
        promedioSueldo = suma / lista.size();
    }

    public ArrayList<Docente> getLista() {
        return lista;
    }

    public double getPromedioSueldo() {
        return promedioSueldo;
    }

    @Override
    public String toString() {
        String cadena = String.format("\t\t\tDOCENTE\nCodigo: %s",
                super.toString());
        for (int i = 0; i < getLista().size() ; i++) {
            cadena = String.format("%s\nNombre: %s - Apellido: %s - "
                    + "Edad: %s - Sueldo: %.2f",
                cadena,
                getLista().get(i).getNombre(),
                getLista().get(i).getApellido(),
                getLista().get(i).getEdad(),
                getLista().get(i).getSueldo());
            
                
        }
        cadena = String.format("%s\nPromedio de sueldos: %.2f", cadena,
                getPromedioSueldo());
        

        return cadena;
    }
}
