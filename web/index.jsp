<%-- 
    Document   : index
    Created on : 10 may. 2020, 17:29:28
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
                <li><a class="navbar-brand" href="addFolder.jsp">Agregar carpeta con documentos</a></li>
            </ul>
        </nav>
        </header>
        <section>
            
        <div class="page-header" >
            <h1 class="title">Motor de búsqueda Vectorial</h1>
        </div>
        <form class="form" accept-charset="UTF-8" method="post" action=<c:url value="/buscar"/>
            <div class="col-lg-6">
                <div class="input-group">
                    <input name="txt_buscar" type="text" class="form-control" placeholder="Ingrese una palabra" value="${texto}"  > 
                    <span class="input-group-btn">
                        <a type="submit" class="btn btn-primary" href="results.jsp" id ='btn' >Buscar</a>
                    </span>
                </div>
            </div>
        </form>
        <section>
            
        <script>            
            $(document).ready(function () {
                $(".btn").click(function () {
                    $(this).button('loading');
                });
            });  
        </script>
    </body>
</html>
