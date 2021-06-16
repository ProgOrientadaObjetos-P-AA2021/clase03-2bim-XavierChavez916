/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

/**
 *
 * @author xavierchavez
 */
public class Docente extends Persona{
    
    private double sueldo;
    
    public Docente(String n, String a, int e, double suel) {
        super(n, a, e);
        setSueldo(suel);
    }
    
    public void setSueldo(double suel){
        if(suel < 1000){
            sueldo = 1000;
        }else{
            sueldo = suel;
        }
        
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    @Override
    public String toString(){
        return String.format("---Docente---\n"
                + "%s - %.2f", super.toString(), getSueldo());
    }
    
}
