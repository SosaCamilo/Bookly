package com.sosapawlowicz.Bookly;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String email;

    public Persona(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    

}
