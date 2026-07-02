package com.sosapawlowicz.Bookly;

import java.util.Date;
import com.sosapawlowicz.Bookly.Cliente;
import com.sosapawlowicz.Bookly.Libro;

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
}
