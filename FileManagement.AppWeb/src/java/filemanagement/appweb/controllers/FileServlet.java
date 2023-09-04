package filemanagement.appweb.controllers;

import filemanagement.accesoadatos.FileDAL;
import filemanagement.appweb.utils.Utilidad;
import filemanagement.entidadessdeenegocioss.FileA;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

@WebServlet(name = "FileServlet", urlPatterns = {"/File"})
public class FileServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        try {
            if ("create".equals(action)) {
                request.getRequestDispatcher("Views/Files/create.jsp").forward(request, response);
            } else {
                ArrayList<FileA> files = FileDAL.getAllFiles();
                request.setAttribute("files", files);
                // var filess = files;

                //var archivos = filess
                // prviate String Attribute;
                // controlar String Attribute
                // this.Attribute = Attribute
                //  public String getFiles() {
                //return Attribute;
                //}
                //public void setAttribute(String Attribute) {
                //this.Attribute = Attribute;
                //}
                //
                request.getRequestDispatcher("Views/Files/index.jsp").forward(request, response);

            }
        } catch (Exception ex) {
            Utilidad.enviarError(ex.getMessage(), request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        try {
            String nameFile = request.getParameter("name");
            String extension = request.getParameter("extension");
            String mimeType = request.getParameter("typeMime");
            String creationDate = request.getParameter("date");
            String Format = "yyyy-MM-dd";
            SimpleDateFormat dateFormat = new SimpleDateFormat(Format);
            String file = request.getParameter("file");

            String url = request.getParameter("url");
            String typeStorage = request.getParameter("typeStorage");

            FileA fileA = new FileA(0, nameFile, extension, mimeType, dateFormat.parse(creationDate), file == null?null:file.getBytes(), url, typeStorage);

            if ("create".equals(action)) {
                int result = FileDAL.addFile(fileA);
                if (result > 0) {
                    response.sendRedirect("File");
                }
            } else {
                request.getRequestDispatcher("Views/Files/index.jsp").forward(request, response);

            }
        } catch (Exception ex) {
            Utilidad.enviarError(ex.getMessage(), request, response);
        }
    }
    // </editor-fold>

}
