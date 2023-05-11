/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vicente.dao;

import com.acme.config.Conexion;
import com.acme.model.Contacto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author vicen
 */
public class ContactoDAOImpl implements ContactoDAO{
private Conexion objconexion;
private Connection objConnection;
//se guarda en esta conexion
public ContactoDAOImpl(){
    objconexion = new Conexion();
}
    @Override
    public List<Contacto> findAll() {
        //Consulta SQL QUE SE QUIERE REALIZAR
       String consulta =  "SELECT * FROM contactos";
       //Listado de datos que se retorna
       List<Contacto> listado  = new LinkedList<>();
       try {
           this.objconexion.conectar();
           this.objConnection = this.objconexion.getJdbcConnection();
           //se prepara la consulta
           PreparedStatement prest = this.objConnection.prepareStatement(consulta);
           //ejecuta la consulta
           ResultSet rs  = prest.executeQuery(consulta);
           Contacto objContacto;
           while (rs.next()){
           objContacto = new Contacto();
           objContacto.setId(rs.getInt("id"));
           objContacto.setNombre(rs.getNString("nombre"));
           objContacto.setApellido(rs.getString("apellido"));
           objContacto.setEmail(rs.getNString("email"));
           objContacto.setDescripcion(rs.getNString("descripcion"));
           listado.add(objContacto);           }
       }catch (Exception e){
           System.out.println("ERROR EN LA CONSULTA");
       }
       return listado;
    }

    @Override
    public Contacto insert(Contacto objcontacto) {
       String consulta = "INSERT INTO contactos (nombre,apellido,email,descripcion) VALUES(?,?,?,?)";
       try{
              this.objconexion.conectar();
               this.objConnection = this.objconexion.getJdbcConnection();
               //inicializacion de la consulta
               PreparedStatement prest = this.objConnection.prepareStatement(consulta);
               //Agregar los datos deentro de la consulta
               prest.setString(1, objcontacto.getNombre());
               prest.setString(2, objcontacto.getApellido());
               prest.setString(3, objcontacto.getEmail());
               prest.setString(4, objcontacto.getDescripcion());
               
               int count  = prest.executeUpdate();
               
               ResultSet rs = null;
               rs = prest.executeQuery("SELECT LAST_INSERT_ID()");
               
               int  autoKey = -1;
               if (rs.next()){
                   autoKey = rs.getInt(1);
                   objcontacto.setId(autoKey);
                   System.out.println("ULTIMO ID INTRODUCIDO" + autoKey);
               }else{
                   System.out.println("NO EXITE DATOS DEL ID");
               }
       }catch(Exception e){
        System.out.println("ERROR AL INSERTAR");
       }
       return objcontacto;
    }

    @Override
    public Contacto findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Contacto updateById(Integer id, Contacto objContacto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean deleteById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
