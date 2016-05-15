/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATOS;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author LAURA
 */
public class Evento {
    public String nombre; 
    public String tipo; 
    public Usuario creador; 
    Date fecha; 
    private Image image; 
    private Comentario descripcion = new Comentario(); 
    ArrayList<Usuario> asistentes= new ArrayList<Usuario>(); 

    public Evento(String nombre, String tipo, Usuario creador, Date fecha, Image image) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.creador = creador;
        this.fecha = fecha;
        this.image = image;
    }
    
    
    
    
    
    
}
