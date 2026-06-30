/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sosapawlowicz.Bookly;

import java.util.Date;

/**
 *
 * @author zantomfg
 */

public class Cliente extends Persona {
    private int dni;
    private int telefono;
    private String domicilio;
    private Date nacimiento; 

    public Cliente(String nombre, String apellido, String email, int dni, int telefono, String domicilio, Date nacimiento) {
        super(nombre, apellido, email);
        this.dni = dni;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.nacimiento = nacimiento;
    }
    

    public void editarDatos (int dni, int telefono, String domicilio, Date nacimiento, String nombre, String apellido, String email){
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.dni = dni;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.nacimiento = nacimiento;
    }
    
    
    
    
}
