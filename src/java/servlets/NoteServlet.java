/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author Diego Maia
 */
public class NoteServlet extends HttpServlet {



    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");     
        System.out.println(title);
        System.out.println(content);
        if (title == null && content == null){
            // to read files
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        title = br.readLine();
        content = br.readLine();       
        }
        request.setAttribute("titleBuffered", title);
        request.setAttribute("contentBuffered", content);
       
        if (request.getQueryString() == null || !request.getQueryString().equals("edit")){
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);           
            
        }else{
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);   
        }
        
        return;
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        
        
        request.setAttribute("titleBuffered", title);
        request.setAttribute("contentBuffered", content);
        
        
         getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);         
        return;
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
