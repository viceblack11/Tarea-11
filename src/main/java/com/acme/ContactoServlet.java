/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acme;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author JuaN
 */
@WebServlet(urlPatterns = "/ContactoServlet")
public class ContactoServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String nombre = req.getParameter("nombre");
        String emailId = req.getParameter("emailId");
        String telefono = req.getParameter("telefono");
        String descripcion = req.getParameter("descripcion");
        
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<h1> Datos de Registro de Contacto </h1>");
        printWriter.print("<p>Nombre: " +nombre +"</p>");
        printWriter.print("<p>Email: " +emailId +"</p>");
        printWriter.print("<p>Telefono: " +telefono +"</p>");
        printWriter.print("<p>Descripcion: " +descripcion +"</p>");
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException{
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String email = req.getParameter("email");
        String descripcion = req.getParameter("descripcion");
        
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.print("<html>");
        pw.print("<body>");
        pw.print("<h1>Datos de Contacto </h1>");
        pw.print("<p> Nombre: " + nombre +"</p>");
        pw.print("<p> Apellido: " + apellido +"</p>");
        pw.print("<p> Email: " + email +"</p>");
        pw.print("<p> Descripcion: " + descripcion +"</p>");
        pw.print("</body>");
        pw.print("</html>");
        pw.close();
    }
}
