package com.sosapawlowicz.Bookly;


public class Administrador extends Persona {
    private String password;

    public Administrador(String password, String nombre, String apellido, String email) {
        super(nombre, apellido, email);
        this.password = password;
    }
    
    public void editarDatos (String nombre, String apellido, String email, String password){
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.password=password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    
    
}
