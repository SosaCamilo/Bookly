/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sosapawlowicz.booklyv2;


import java.util.Date;
import com.sosapawlowicz.booklyv2.Cliente;
import com.sosapawlowicz.booklyv2.Libro;

public class Prestamo {
    private int idPrestamo;
    private Date fechaRetiro;
    private Date fechaVencimiento;
    private String estado;
    private Cliente cliente;
    private Libro libro;

    public Prestamo(int idPrestamo, Date fechaRetiro, Date fechaVencimiento, String estado, Cliente cliente, Libro libro) {
        this.idPrestamo = idPrestamo;
        this.fechaRetiro = fechaRetiro;
        this.fechaVencimiento = fechaVencimiento;
        this.estado =estado;
        this.cliente=cliente;
        this.libro = libro; 
    }
    
    
    public void devolverLibro(){
    this.estado="Finalizada";
    }
    
    public Date getfechaVencimiento(){
        return fechaVencimiento;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    public String getEstado() {
        return estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Libro getLibro() {
        return libro;
    }
}
