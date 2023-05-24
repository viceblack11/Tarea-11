

<%@page language ="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>JSP Page</title>    
       <link rel="stylesheet" href="<%=request.getContextPath()%> /webjars/bootstrap/5.3.0-alpha3/dist/css/bootstrap.min.css"/>
       <script defer src = "<%=request.getContextPath() %> /webjars/bootstrap/5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"> </script>
    </head>
    <body>
        
        
        <nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">PV</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Contacto</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
        <h1>Pagina de Registro de Contacto</h1>
        <div class="container">

            
            
            
        <form action="<%= request.getContextPath() %>/ContactoServlet?action=create" method="POST">
            <div class="mb-3">
            <label for="nombre" class="form-label"> Nombre:</label> <input type="text" name="nombre">
            <input type="email" class="form-control" id="nombre" placeholder="introducir nombre" type="text" name="nombre">
            </div>
            <br>
            <label>Apellido:</label> <input type="text" name="apellido">
            <br>
            <label>EmailId:</label><input type="email" name="email">
            <br>
            <label>Descripcion:</label><input type="text" name="descripcion">
            <br>
            <button type="submit" class="btn btn-primary">Registrar</button>
        </form>
            </div>
    </body>
</html>
