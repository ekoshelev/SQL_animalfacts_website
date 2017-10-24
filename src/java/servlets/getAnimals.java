/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tanimallate file, choose Tools | Tanimallates
 * and open the tanimallate in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import src.Animal;

@WebServlet(name = "getAnimals", urlPatterns =
{
    "/getAnimals"
})
public class getAnimals extends HttpServlet
{

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
            throws ServletException, IOException
    {
        Animal p1 = new Animal("Tiger", "images/tiger.jpg","Tigers have stripes","Tigers are orange animals with black stripes.");
        Animal p2 = new Animal("Elephant", "images/elephant.jpg","Elephants are gray.","Elephants are gray and have trunks.");
        Animal p3 = new Animal("Zebra", "images/zebra.jpg","Zebras have stripes.","Zebras, unlike tigers, are white with black stripes.");


        List<Animal> animals = new ArrayList<Animal>();
        animals.add(p1);
        animals.add(p2);
        animals.add(p3);
        
HttpSession session = request.getSession();
        session.setAttribute("list", animals);

        RequestDispatcher dispatcher = request.getRequestDispatcher("animalView.jsp");
        dispatcher.forward(request, response);
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
            throws ServletException, IOException
    {
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
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
