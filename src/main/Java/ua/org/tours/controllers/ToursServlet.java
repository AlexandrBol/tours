package ua.org.tours.controllers;


import ua.org.tours.model.Tour;
import ua.org.tours.service.impl.TourServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
@WebServlet(name = "ToursServlet", urlPatterns={"/tours"})
public class ToursServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();
        List<Tour> tourList = TourServiceImpl.getInstance().getAll();
        request.setAttribute("tourList", tourList);

        request.getRequestDispatcher("/pages/common/tours.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}


