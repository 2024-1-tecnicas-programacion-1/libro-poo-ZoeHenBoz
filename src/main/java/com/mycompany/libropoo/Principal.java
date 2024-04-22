package com.mycompany.libropoo;

import java.util.Scanner;

public class Principal {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el título del libro:");
        String titulo= sc.nextLine();
        
        System.out.println("Ingrese el autor del libro:");
        String autor= sc.nextLine();
        
        System.out.println("Ingrese el año de publicación del libro:");
        int aniopubli= sc.nextInt();
        
        boolean leido=false;
        
        Libro libro = new Libro (titulo, autor,aniopubli, leido);
        
        libro.mostrarInformacion();
        System.out.println(libro.mostrarInformacion());
        
        libro.marcarLeido();
        if (libro.isLeido()==true){
            System.out.println("El libro "+ titulo+ " ya fue leido");
        } else {
            System.out.println("El libro "+ titulo+ " no ha sido leido");
        }
        
        if (libro.esAntiguo()==true){
            System.out.println("El libro "+ titulo+ " es antiguo");
        }
        
        
     }//Cierro el main
}//Cierro la clase
