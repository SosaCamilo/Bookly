package com.sosapawlowicz.booklyv2;

import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

public class Booklyv2 {
    
    public static void main (String[] args){
        
        
        int aux=1;
        Scanner sc = new Scanner(System.in);

        System.out.println("-- Bookly!"); 
        
        while(aux==1){

            System.out.println("Login:"); 
            System.out.print("email: "); 
            String user = sc.nextLine();
            System.out.print("password: "); 
            String passw = sc.nextLine();

            Libreria sesion = new Libreria (user, passw);
            if (sesion.estaLogueado()){
                System.out.println("Bienvenido, " + sesion.getAdmin().getNombre() + "!");
                aux=2;
            } else {
                System.out.println("-- CREDENCIALES INCORRECTAS --");
                System.out.println("Por favor, re-ingrese las credenciales:");
                System.out.println(""); 
            }
        while (aux==2){
            
            String userinput = "0" ;
            System.out.println(""); 
            System.out.println("-- Bookly!"); 
            System.out.println(""); 
            System.out.println("1) Agregar Cliente."); 
            System.out.println("2) Agregar Libro."); 
            System.out.println("3) Registrar un prestamo."); 
            System.out.println("4) Buscar Cliente"); 
            System.out.println("5) Buscar Libro"); 
            System.out.println("6) Reportes"); 
            System.out.println("0) Salir DEL KEKE"); 
            System.out.println(""); 
            System.out.print(sesion.getAdmin().getNombre() + ": ");
            userinput = sc.nextLine();
            System.out.println(""); 
            
            
            switch (userinput){
                case "1":
                    System.out.println("Agregar Cliente");
                    System.out.println("");
                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();
                    
                    System.out.print("Apellido: ");
                    String apellido = sc.nextLine();
                    
                    System.out.print("email: ");
                    String email = sc.nextLine();
                    
                    System.out.print("DNI: ");
                    int dni = sc.nextInt();
                    
                    System.out.print("Telefono: ");
                    int telefono = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Domicilio: ");
                    String domicilio = sc.nextLine();
                    
                    System.out.print("Anio de nacimiento: ");
                    int anio = sc.nextInt();
                    
                    System.out.print("Mes de nacimiento (numero): ");
                    int mes = sc.nextInt();
                    
                    System.out.print("Dia de nacimiento: ");
                    int dia = sc.nextInt();
                    sc.nextLine();
                    
                    sesion.addCliente(nom, apellido, email, dni, telefono, domicilio, new Date(anio,mes,dia));
                    
                    
                    System.out.print("");
                    System.out.print("-- Cliente "+ apellido + " "+ nom +" agregado con exito!");
                    System.out.print("");
                    
                    break;
                    
                    case "2":
                    System.out.println("Agregar Libro");
                    System.out.println("");
                    
                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();
                    
                    System.out.print("Genero: ");
                    String genero = sc.nextLine();
                    
                    System.out.print("Paginas: ");
                    int paginas = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    
                    System.out.print("Descripcion: ");
                    String descripcion = sc.nextLine();
                    
                    System.out.print("Su libro es: ");
                    System.out.print("1) Novela. ");
                    System.out.print("2) Comic. ");
                    
                    int userinput2=0;
                    while (userinput2!=1 && userinput2!=2){
                        System.out.print("-- Ans:  ");
                        userinput2 = sc.nextInt();
                        if (userinput2!=1 && userinput2!=2){
                            System.out.print("Comando no reconocido, por favor reingreselo.");
                        }
                    }
                    sc.nextLine();
                    String diferente;
                    if (userinput2==1){
                            System.out.print("Cantidad de capitulos:");
                            diferente = sc.nextLine();
                            sesion.addNovela(titulo, genero, autor, descripcion, paginas, Integer.parseInt(diferente));
                            
                        } else {
                        System.out.print("Ilustrador:");
                            diferente = sc.nextLine();
                            sesion.addComic(titulo, genero, autor, descripcion, paginas, diferente);
                    }
                    
                    
                    
                    
                    System.out.print("");
                    System.out.print("-- Libro "+ titulo + " agregado con exito!");
                    System.out.print("");
                    
                    break;

                case "3":
                    System.out.println("Registrar Prestamo");
                    System.out.println("");

                    System.out.print("DNI del cliente: ");
                    int dniPrestamo = sc.nextInt();
                    sc.nextLine();

                    Cliente clienteEncontrado = sesion.buscarClientePorDni(dniPrestamo);

                    if (clienteEncontrado == null) {
                        System.out.println("-- No se encontro ningun cliente con ese DNI --");
                        break;
                    }

                    System.out.print("Titulo del libro: ");
                    String tituloPrestamo = sc.nextLine();

                    Libro libroEncontrado = sesion.buscarLibroPorTitulo(tituloPrestamo);

                    if (libroEncontrado == null) {
                        System.out.println("-- No se encontro ningun libro con ese titulo --");
                        break;
                    }

                    Calendar calRetiro = Calendar.getInstance();
                    Date fechaRetiro = calRetiro.getTime();

                    Calendar calVencimiento = Calendar.getInstance();
                    calVencimiento.add(Calendar.MONTH, 3);
                    Date fechaVencimiento = calVencimiento.getTime();

                    int idNuevoPrestamo = sesion.addPrestamo(clienteEncontrado, libroEncontrado, fechaRetiro, fechaVencimiento);

                    System.out.println("");
                    System.out.println("-- Prestamo #" + idNuevoPrestamo + " registrado con exito! Vence: " + fechaVencimiento);
                    System.out.println("");

                    break;

                case "4":
                    System.out.println("Buscar Cliente");
                    System.out.println("");
                    System.out.print("DNI del cliente: ");
                    int dniBusqueda = sc.nextInt();
                    sc.nextLine();

                    Cliente clienteBuscado = sesion.buscarClientePorDni(dniBusqueda);

                    if (clienteBuscado != null) {
                        clienteBuscado.mostrarDatos();
                    } else {
                        System.out.println("-- No se encontro ningun cliente con ese DNI --");
                    }

                    break;

                case "5":
                    System.out.println("Buscar Libro");
                    System.out.println("");
                    System.out.print("Titulo del libro: ");
                    String tituloBusqueda = sc.nextLine();

                    Libro libroBuscado = sesion.buscarLibroPorTitulo(tituloBusqueda);

                    if (libroBuscado != null) {
                        libroBuscado.mostrarDatos();
                    } else {
                        System.out.println("-- No se encontro ningun libro con ese titulo --");
                    }

                    break;

                case "6":
                    System.out.println("Reportes");
                    System.out.println("");
                    System.out.println("1) Prestamos Activos");
                    System.out.println("2) Prestamos Vencidos");
                    System.out.println("3) Listado de Clientes");
                    System.out.println("4) Listado de Libros");
                    System.out.print("-- Ans: ");
                    String reporteInput = sc.nextLine();

                    switch (reporteInput) {
                        case "1":
                            sesion.mostrarPrestamosActivos();
                            break;
                        case "2":
                            sesion.mostrarPrestamosVencidos();
                            break;
                        case "3":
                            sesion.mostrarTodosLosClientes();
                            break;
                        case "4":
                            sesion.mostrarTodosLosLibros();
                            break;
                        default:
                            System.out.println("Comando no reconocido.");
                            break;
                    }

                    break;

                case "0":
                    System.out.println("-- Gracias por usar Bookly! Hasta pronto, " + sesion.getAdmin().getNombre() + ". --");
                    aux = 0;
                    break;

                default:
                    System.out.println("Comando no reconocido, por favor ingrese un comando valido."); 
                    break;
            }
        }


        }
    }
}
