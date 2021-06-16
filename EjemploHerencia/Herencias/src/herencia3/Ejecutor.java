/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

import herencias2.Docente;
import herencias2.Estudiante;
import herencias2.Policia;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author xavierchavez
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        Estudiante est1 = new Estudiante("René", "Elizalde", 33, 100.2);
        Docente doc1 = new Docente("José", "Hincapié", 40, 1000); 
        Policia pol1 = new Policia("María", "MENDOZA", 35, "Cabo");
        Estudiante est2 = new Estudiante("Patricia", "Velez", 31, 100.2);
        Docente doc2 = new Docente("Luis", "Alvarez", 38, 1000); 
        Policia pol2 = new Policia("ALEX", "Medina", 33, "Cabo");
        
        ArrayList listaDocente = new ArrayList<>();
        ArrayList listaEstudiante = new ArrayList<>();
        ArrayList listaPolicia = new ArrayList<>();
        listaDocente.add(doc1);
        listaDocente.add(doc2);
        listaEstudiante.add(est1);
        listaEstudiante.add(est2);
        listaPolicia.add(pol1);
        listaPolicia.add(pol2);
        
        ReporteDocente rd = new ReporteDocente("0001Doc", listaDocente);
        rd.setPromedioSueldo();
        
        ReporteEstudiante re = new ReporteEstudiante("0001Est", 
                listaEstudiante);
        re.setPromedioMatriculas();
        
        ReportePolicia rp = new ReportePolicia("0001Pol", listaPolicia);
        rp.setPropmedioEdad();
       
        System.out.println(rd);
        System.out.println(re);
        System.out.println(rp);
        
    }
}
