<%-- 
    Document   : addFile
    Created on : 10 may. 2020, 18:49:48
    Author     : Georgina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
         <header>
            
            <nav class="nav nav-tabs nav-justified">
            <a href="index.jsp"><img src="https://pngimage.net/wp-content/uploads/2018/06/inicio-icono-png-6.png" class="logo"></a>
            <ul>
                <li><a class="navbar-brand" href="addDocument.jsp">Agregar documento</a></li>
                <li><a class="navbar-brand" href="addFile.jsp">Agregar carpeta con documentos</a></li>
            </ul>
        </nav>
        </header>
        <section>
            <div class="page-header">
            <h2 class="title">Agregar carpeta con documentos</h2>
        </div>
        <form class="form" accept-charset="UTF-8" method="post" action=<c:url value="/loadFolder"/>>
            <div class="col-lg-6">
                <div class="input-group">
                    <input name="agregarDirectorio" Placeholder=" Ingrese URL del Directorio.." type="text"  value="${url}" class="form-control"/>
                    <span class="input-group-btn">
                        <button type="submit" class="btn btn-primary">Agregar directorio</button>
                    </span>
                </div>
            </div>
        </form>
        </section>
    </body>
</html>
