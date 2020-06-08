/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author carlo
 */
@WebServlet(urlPatterns = {"/prueba"})
public class prueba extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Operaciones Basicas</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet prueba at " + request.getContextPath() + "</h1>");
            out.println("<h1>OPERACIONES BASICAS</h1>");
            out.println(" <form name='operacionesBasicas' > "); 
            out.println("<label for='Name1'>Numero 1 : </label>");
            out.println("<input type='Text' name='num1' value='0' size='13'>");
            out.println("<br>");
            out.println("<label for='Name2'>Numero 2 : </label>");
            out.println("<input type='Text' name='num2' value='0' size='13'>");
            out.println("<br>");
            out.println("<label for='Name3'>Operaciones : </label>");
            out.println(" <select name='operaciones' >");
            out.println("<option value=' '>  </option>" );
            out.println("<option value=' + '>  suma</option>" );
            out.println("<option value=' - ' >  resta</option>" );
            out.println("<option value=' * '>  multiplicacion</option>" );
            out.println("<option value=' / '>  division</option>" );
            out.println("</select>");
            out.println("<br>");
            out.println( "<input type ='Button' name='Procesar' value=' Procesar' size='13' onclick=calcular(document.operacionesBasicas.operaciones.value)>");
            out.println(" <input type='Text' name='resultado' value='0' size='13' readonly>");
            out.println("<br>");
            out.println("</form>");
            
            out.println("<script>");
             out.println("function calcular(operacion){\n" +
"    var num1 = document.operacionesBasicas.num1.value    \n" +
"    var num2 = document.operacionesBasicas.num2.value   \n" +
"    var result = eval(num1 + operacion + num2)\n" +
"    document.operacionesBasicas.resultado.value = result}");
            
            out.println("</script>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        processRequest(request, response);
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
        processRequest(request, response);
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
