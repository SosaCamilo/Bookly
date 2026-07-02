package com.sosapawlowicz.Bookly;

public class Novela extends Libro {
    /*String titulo;
    String genero;
    String autor;
    String descripcion;
    int paginas;*/
    int capitulos;

    public Novela(String titulo, String genero, String autor,  String descripcion, int paginas, int capitulos) {
        super (titulo, genero, autor, descripcion, paginas);
        this.capitulos = capitulos;
    }
    
    
    public void mostrarDatos(){
        System.out.println("");
        System.out.println("-- Novela: " + titulo);
        System.out.println("Genero: " + genero);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
        System.out.println("Capitulos: " + capitulos);
        System.out.println("Descripcion" + descripcion);
        System.out.println("");
    }
}
