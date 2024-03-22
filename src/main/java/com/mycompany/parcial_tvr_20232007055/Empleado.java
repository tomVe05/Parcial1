/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial_tvr_20232007055;

import java.util.Scanner;

/**
 *
 * @author TOMAS
 */
public class Empleado extends Persona
        
{
    
    private double Salario;
    
    private String cargo;

    public Empleado(String nombre, int edadEmpleado, String cargoEmpleado, double salario) 
    
    {
        
        super(nombre, edadEmpleado);
        
        this.Salario = Salario;
        
        this.cargo = cargo;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void responderPreguntas()
            
    {
        
        System.out.println("¿Cuál es la diferencia entre una clase ''Persona'' y ''Empleado'' en atributos?\r");
        
        System.out.print("En la clase ''Persona'', utilizamos dos atributos que son heredados ");
        
        System.out.println("por la clase ''Empleado''.\r");
        
        System.out.println("¿Cómo se establece la relación de herencia entre `Empleado` y `Persona` en Java?\r");
        
        System.out.print("Para que exista la herencia, se debe realizar utilizando ''extends'' en la clase ");
        
        System.out.println("en la cual vamos a heredar.\r");
        
        System.out.println("¿Qué es un constructor en Java y cuál es su propósito?\r");
        
        System.out.print("Los constructores son un método especial utilizado cuando creamos ");
        
        System.out.print("una instancia de una clase. Su finalidad principal es la de inicializar ");
        
        System.out.println("los atributos de los objetos.\r");
        
        System.out.println("¿Por qué es útil utilizar la herencia en la programación orientada a objetos?\r");
        
        System.out.println("Por nombrar algunas razones, la reutilización de código, el polimorfismo, la abstracción  y la jerarquía.\r");
        
        System.out.println("¿Cómo se llama el proceso de crear un objeto a partir de una clase en Java?\r");
        
        System.out.println("Se denomina ''creación de instancia'', también conocido como ''instanciación'' o ''creación de objetos.");
    
    }
    
    
}
