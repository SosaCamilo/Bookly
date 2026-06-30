/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sosapawlowicz.Bookly;


public abstract class Libro {

    protected String titulo;
    protected String genero;
    protected String autor;
    protected String descripcion;
    protected int paginas;

    public Libro(String titulo, String genero, String autor, String descripcion, int paginas) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.descripcion = descripcion;
        this.paginas = paginas;
    }

    
    
    public abstract void mostrarDatos();
    
}
