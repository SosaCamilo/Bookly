/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sosapawlowicz.Bookly;

/**
 *
 * @author zantomfg
 */
public class Novela extends Libro {
    int capitulos;

    public Novela(int capitulos) {
        super (titulo, genero, autor, paginas, capitulos, descripcion);
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
