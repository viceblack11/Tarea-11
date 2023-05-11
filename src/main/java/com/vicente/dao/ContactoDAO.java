/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vicente.dao;
import com.acme.model.Contacto;
import java.util.List;

/**
 *
 * @author vicen
 */
public interface ContactoDAO {
    //metodo que devuelve el listado de objetos
    //importar el model
    public List<Contacto> findAll();
    //Metodo que inserta un objeto en la base de datos
    public Contacto insert (Contacto objcontacto);
    //Metodo que devuelve un objeto en base a su ID
    public Contacto findById(Integer id);
    //Metodo que modifica un objeto en la base de datos en base a su ID
    public Contacto updateById(Integer id, Contacto objContacto);
    //Metodo que elimina un objeto en la base de datos en base a su ID
    public Boolean deleteById(Integer id);
}
