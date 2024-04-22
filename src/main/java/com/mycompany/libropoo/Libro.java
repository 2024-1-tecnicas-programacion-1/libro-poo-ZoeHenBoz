package com.mycompany.libropoo;

public class Libro {
    
    //Atributos
    private String titulo;
    private String autor;
    private String genero;
    private int aniopubli;
    private boolean leido=false;
    
    public Libro( String titulo, String autor, int aniopubli, boolean leido){
        this.titulo = titulo;
        this.autor = autor;
        this.aniopubli = aniopubli;
        this.leido = leido;
    }// Cierro clase Libro
    
    public String mostrarInformacion(){
        return "Título: "+titulo+ ", Autor: "+ autor+ ", Año de ¨Publicación: "+aniopubli+", Género:"+genero;
    }// Cierro metodo montrarInformacion
    
    public void marcarLeido(){
        leido=true;
    }// Cierro metodo marcarLeido

    public boolean isLeido() {
        return leido;
    }

    public boolean esAntiguo(){
        if (aniopubli<1974){
        return true;
        }else{
        return false;
        }
    }
    
}//Cierro Clase
