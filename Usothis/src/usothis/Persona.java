/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usothis;

/**
 *
 * @author Alumno Mañana
 */
  class Persona {
        
       
       String nombre;
       String apellido;

        public Persona(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
            System.out.println("acceso a persona con uso de this"+ this);
            new Imprimir().imprimir(this);
        
        }
       
       
       
        
    }
