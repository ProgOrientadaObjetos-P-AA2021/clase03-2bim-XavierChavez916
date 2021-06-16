/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

/**
 *
 * @author xavierchavez
 */
public class Reporte {
    protected String codigo;
    
    public Reporte(String n){
        codigo = n;
    }
    
    public void setCodigo(String n){
        codigo = n;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    @Override
    public String toString(){
        return String.format("%s",codigo);
    }
}
