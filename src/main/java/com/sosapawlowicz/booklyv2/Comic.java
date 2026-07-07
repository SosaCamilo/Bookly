package com.sosapawlowicz.booklyv2;

public class Comic extends Libro {
    private String ilustrador;

    public Comic(String titulo, String genero, String autor, String descripcion, int paginas, String ilustrador) {
        super(titulo, genero, autor, descripcion, paginas);
        this.ilustrador = ilustrador;
    }
    
    public void mostrarDatos(){
        System.out.println("");
        System.out.println("-- Novela: " + titulo);
        System.out.println("Genero: " + genero);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
        System.out.println("Ilustrador: " + ilustrador);
        System.out.println("Descripcion" + descripcion);
        System.out.println("");
    }
}
