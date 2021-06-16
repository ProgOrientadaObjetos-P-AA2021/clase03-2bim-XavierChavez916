/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

import herencias2.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author xavierchavez
 */
public class ReporteEstudiante extends Reporte {

    private ArrayList<Estudiante> lista;
    private double promedioMatriculas;

    public ReporteEstudiante(String n, ArrayList<Estudiante> lis) {
        super(n);
        setLista(lis);
    }

    public void setLista(ArrayList<Estudiante> s) {
        lista = s;
    }

    public void setPromedioMatriculas() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getMatricula();
        }
        promedioMatriculas = suma / lista.size();
    }

    public ArrayList<Estudiante> getLista() {
        return lista;
    }

    public double getPromedioMatricula() {
        return promedioMatriculas;
    }

    @Override
    public String toString() {
        String cadena = String.format("\t\t\tESTUDIANTE\nCodigo: %s",
                super.toString());
        for (int i = 0; i < getLista().size(); i++) {
            cadena = String.format("%s\nNombre: %s - Apellido: %s - Edad: %s "
                    + "- Precio Matricula: %.2f",
                    cadena,
                    getLista().get(i).getNombre(),
                    getLista().get(i).getApellido(),
                    getLista().get(i).getEdad(),
                    getLista().get(i).getMatricula());

        }
        cadena = String.format("%s\nPromedio de matriculas: %.2f", cadena,
                getPromedioMatricula());

        return cadena;
    }
}
