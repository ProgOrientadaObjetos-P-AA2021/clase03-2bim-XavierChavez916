/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;
        double mat, suel;
        String ran;
        System.out.println("Ingrese 1 para ingresar estudiante\n"
                + "Ingrese 2 para ingresar docente\n"
                + "Ingrese 3 para ingresar policia");
        op = entrada.nextInt();
        if (op == 1 && op == 2 && op == 3) {
            entrada.nextLine();
            System.out.println("Ingrese el nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese el apellido");
            String apell = entrada.nextLine();
            System.out.println("Ingrese la edad");
            int edad = entrada.nextInt();
            entrada.nextLine();
            if (op == 1) {
                System.out.println("Ingrese el valor de matricula");
                mat = entrada.nextDouble();
                Estudiante e = new Estudiante(nombre, apell, edad, mat);
                System.out.println(e);
            } else if (op == 2) {
                System.out.println("Ingrese el sueldo");
                suel = entrada.nextDouble();
                Docente d = new Docente(nombre, apell, edad, suel);
                System.out.println(d);
            } else if (op == 3) {
                System.out.println("Ingrese el rango");
                ran = entrada.nextLine();
                Policia p = new Policia(nombre, apell, edad, ran);
                System.out.println(p);
            }

        } else {
            System.out.println("Error");
        }

        /*    
        // TODO code application logic here
        Estudiante e = new Estudiante("René", "Elizalde", 33, 100.2);
        System.out.println(e);
        // Un docente hereda de una Persona y adicionalmente tiene 
        // la característia sueldo
        Docente d = new Docente("Luis", "Alvarez", 40, 900); // falta implementar
        System.out.println(d);
        
        // Un policia hereda de una Persona y adicionalmente tiene 
        // la característia rango
        Policia p = new Policia("ALEX", "MENDOZA", 35, "Cabo"); // falta implementar
        System.out.println(p);
         */
    }

}
