<%-- 
    Document   : index
    Created on : 29 ago. 2023, 18:59:00
    Author     : kevin
--%>

<%@page import="filemanagement.entidadessdeenegocioss.FileA"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%ArrayList<FileA> files = (ArrayList<FileA>) request.getAttribute("files");%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Archivos</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Extensión</th>
                    <th>Tipo MIME</th>
                    <th>Fecha de Creación</th>
                    <th>Archivo</th>
                    <th>URL</th>
                    <th>Tipo Storage</th>


                </tr>
            </thead>
            <tbody>
                <%

                    for (FileA file : files) {
                %>
                <tr>
                    <td><%=file.getNameFile() %></td>
                    <td><%=file.getExtension() %></td>
                    <td><%=file.getMimeType() %></td>
                    <td><%=file.getCreationDate() %></td>
                    <td><%=file.getFiles() %></td>
                    <td><%=file.getUrl() %></td>
                    <td><%=file.getTypeStorage() %></td>
                </tr>
                <%}%>
            </tbody>
        </table>
            
            
            <a href="File?action=create">Crear Archivo</a>
    </body>
</html>
