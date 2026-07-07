/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sosapawlowicz.booklyv2;

import java.util.Date;


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

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public int getDni() {
        return dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void mostrarDatos(){
        System.out.println("");
        System.out.println("-- Cliente: " + nombre + " " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Email: " + email);
        System.out.println("Telefono: " + telefono);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Nacimiento: " + nacimiento);
        System.out.println("");
    }

}
