<%-- 
    Document   : create
    Created on : 30 ago. 2023, 10:46:25
    Author     : kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Agregar Archivo</h1>
        <form action="File" method="post" enctype="multipart/form-data">
            <input type="hidden" name="action" value="create">
            Nombre: <input type="text" name="name" required><br>
            Extensión <input type="text" name="extension"  required><br>
            Tipo MIME <input type="text" name="typeMime"  required><br>
            Fecha de Creación: <input type="datetime-local" name="date"  required><br>
            File: <input type="file" name="file" multiple=""  required><br>
            URL: <input type="text" name="url"  required><br>
            Tipo Storage: <input type="text" name="typeStorage"  required><br>       
            <input type="submit" value="Agregar ">
        </form>
        <br>
        <a href="File">Lista de Archivos</a>
    </body>
</html>
