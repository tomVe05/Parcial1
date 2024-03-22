/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parcial_tvr_20232007055;

/**
 *
 * @author TOMAS
 */
public class Persona 

{
    
    protected String nombre;
    
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarInformacion()
            
    {
        
        System.out.println("Nombre: " + nombre);
        
        System.out.println("Edad: " + edad);
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
