/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acme.model;

/**
 *
 * @author JuaN
 */
public class Contacto {
    //Atributos del modelo
    private String nombre;
    private String apellido;
    private String email;
    private String descripcion;
    
    //Constructor vacio
    public Contacto(){
        
    }
        
    //getters y setters
    public void setNombre(String name){
        this.nombre = name;
    }
    
    public String getNombre(){
        return nombre;
    }
}
