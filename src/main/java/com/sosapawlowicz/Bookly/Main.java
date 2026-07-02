package com.sosapawlowicz.Bookly;

import com.sosapawlowicz.Bookly.Libreria;
import java.util.Scanner;
import java.util.Date;

public class Main {
    
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
                    
                    System.out.print("Domicilio: ");
                    String domicilio = sc.nextLine();
                    
                    System.out.print("Anio de nacimiento: ");
                    int anio = sc.nextInt();
                    
                    System.out.print("Mes de nacimiento: ");
                    int mes = sc.nextInt();
                    
                    System.out.print("Dia de nacimiento: ");
                    int dia = sc.nextInt();
                    
                    sesion.addCliente(nom, apellido, email, dni, telefono, domicilio, new Date(anio,mes,dia));
                default:
                    System.out.println("Comando no reconocido, por favor ingrese un comando valido."); 
                    break;
            }
        }


        }
    }
}
