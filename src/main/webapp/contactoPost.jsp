<%-- 
    Document   : contactoPost
    Created on : Apr 19, 2023, 6:52:36 PM
    Author     : JuaN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Pagina de Registro de Contacto</h1>
        <form action="<%= request.getContextPath() %>/ContactoServlet" method="POST">
            <label> Nombre:</label> <input type="text" name="nombre">
            <br>
            <label>Apellido:</label> <input type="text" name="apellido">
            <br>
            <label>EmailId:</label><input type="email" name="email">
            <br>
            <label>Descripcion:</label><input type="text" name="descripcion">
            <br>
            <input type="submit" value="Registrar">
        </form>
    </body>
</html>
