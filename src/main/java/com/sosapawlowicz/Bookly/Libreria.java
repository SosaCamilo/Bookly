package com.sosapawlowicz.Bookly;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Libreria {
    private ArrayList<Cliente> clientes;
    private ArrayList<Libro> libros;
    private ArrayList<Prestamo> prestamos;
    private Administrador admin;

    public Libreria(String emailIngresado, String passwordIngresada) {

        // ── Admins ──────────────────────────────────────────────
        Administrador admin1 = new Administrador("Camilo",  "Sosa",       "camilososa420@gmail.com",  "contrasena");
        Administrador admin2 = new Administrador("Lautaro", "Pawlowicz",  "flautypawlo@gmail.com",    "1234");
        Administrador admin3 = new Administrador("Claudio", "Antropico",  "claudantropic@gmail.com",  "sacado");
        Administrador admin4 = new Administrador("Nahuel",  "Desarrollo", "profenahu@gmail.com",      "kekw");
        ArrayList<Administrador> admins = new ArrayList<>(List.of(admin1, admin2, admin3, admin4));

        for (Administrador a : admins) {
            if (a.getEmail().equals(emailIngresado) && a.getPassword().equals(passwordIngresada)) {
                this.admin = a;
                break;
            }
        }

        // ── Fechas de nacimiento (para clientes) ────────────────
        Calendar cal = Calendar.getInstance();

        cal.set(1995, Calendar.MARCH, 14);
        Date nac1 = cal.getTime();

        cal.set(1988, Calendar.JULY, 22);
        Date nac2 = cal.getTime();

        cal.set(2001, Calendar.NOVEMBER, 5);
        Date nac3 = cal.getTime();

        cal.set(1979, Calendar.JANUARY, 30);
        Date nac4 = cal.getTime();

        // ── Clientes ────────────────────────────────────────────
        Cliente cliente1 = new Cliente("Gael",    "Lapeyre",     "gaellapeyre123@gmail.com",  12345678, 1134567890, "Av. Siempreviva 123", nac1);
        Cliente cliente2 = new Cliente("Lautaro", "Geli",        "gelilautaro67@gmail.com",   23456789, 1145678901, "Calle Falsa 456",     nac2);
        Cliente cliente3 = new Cliente("Enzo",    "Cerobulgoat", "enzocerobulgoat@gmail.com", 34567890, 1156789012, "Rivadavia 789",       nac3);
        Cliente cliente4 = new Cliente("Chad",    "Cito",        "chadcito@gmail.com",        45678901, 1167890123, "Corrientes 1011",     nac4);
        this.clientes = new ArrayList<>(List.of(cliente1, cliente2, cliente3, cliente4));

        // ── Libros ──────────────────────────────────────────────
        Novela novela1 = new Novela("Cien Años de Soledad", "Realismo Magico", "Garcia Marquez",  "Una saga familiar colombiana",    400, 32);
        Novela novela2 = new Novela("El Aleph",             "Fantastico",      "Jorge Luis Borges","Cuentos breves y laberinticos",  200, 18);
        Comic  comic1  = new Comic ("Watchmen",             "Superheroes",     "Alan Moore",       "Superheroes en un mundo oscuro", 350, "Dave Gibbons");
        Comic  comic2  = new Comic ("Maus",                 "Historico",       "Art Spiegelman",   "El holocausto en historieta",    296, "Art Spiegelman");
        this.libros = new ArrayList<>(List.of(novela1, novela2, comic1, comic2));

        // ── Fechas de préstamos (retiro + vencimiento 3 meses después) ──
        cal.set(2026, Calendar.JANUARY, 10);
        Date retiro1 = cal.getTime();
        cal.set(2026, Calendar.APRIL, 10);
        Date venc1 = cal.getTime();

        cal.set(2026, Calendar.FEBRUARY, 3);
        Date retiro2 = cal.getTime();
        cal.set(2026, Calendar.MAY, 3);
        Date venc2 = cal.getTime();

        cal.set(2026, Calendar.MARCH, 18);
        Date retiro3 = cal.getTime();
        cal.set(2026, Calendar.JUNE, 18);
        Date venc3 = cal.getTime();

        cal.set(2026, Calendar.APRIL, 1);
        Date retiro4 = cal.getTime();
        cal.set(2026, Calendar.JULY, 1);
        Date venc4 = cal.getTime();

        // ── Prestamos ───────────────────────────────────────────
        Prestamo prestamo1 = new Prestamo(1, retiro1, venc1, "Activo",    cliente1, novela1);
        Prestamo prestamo2 = new Prestamo(2, retiro2, venc2, "Activo",    cliente2, comic1);
        Prestamo prestamo3 = new Prestamo(3, retiro3, venc3, "Finalizado",cliente3, novela2);
        Prestamo prestamo4 = new Prestamo(4, retiro4, venc4, "Activo",    cliente4, comic2);
        this.prestamos = new ArrayList<>(List.of(prestamo1, prestamo2, prestamo3, prestamo4));
    }

    public boolean estaLogueado() {
        return this.admin != null;
    }
}