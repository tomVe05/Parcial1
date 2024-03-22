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
public class Main 

{
    
    public static void main(String[] args)
            
    {
        
        Scanner parcial = new Scanner(System.in);
        
        System.out.println("Nombre: ");
        
        String nombrePersona = parcial.nextLine();
        
        System.out.println("Edad: ");
        
        int edadPersona = parcial.nextInt();
        
        parcial.nextLine();
        
        Persona persona = new Persona(nombrePersona, edadPersona);
        
        System.out.println("Información de la persona:\r");
        
        persona.mostrarInformacion();
        
        System.out.println("Ingrese el nombre del empleado:\t ");
        
        String nombreEmpleado = parcial.nextLine();
        
        System.out.println("Ingrese la edad del empleado:\t ");
        
        int edadEmpleado = parcial.nextInt();
        
        parcial.nextLine();
        
        System.out.println("Ingrese el cargo del empleado:\t");
        
        String cargoEmpleado = parcial.nextLine();
        
        System.out.println("Ingrese el salario del empleado:\t");
        
        double salarioEmpleado = parcial.nextDouble();
        
        Empleado empleado = new Empleado(nombreEmpleado, edadEmpleado, cargoEmpleado, salarioEmpleado);
        
        System.out.println("Información del empleado: ");
        
        empleado.mostrarInformacion();
        
    }
    
}
