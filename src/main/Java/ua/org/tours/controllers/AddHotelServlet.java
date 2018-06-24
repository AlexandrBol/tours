package ua.org.tours.controllers;//package ua.org.tours.controllers;
//
//import ua.org.tours.model.Hotel;
//import ua.org.tours.service.impl.HotelServiceImpl;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet(name = "AddHotelServlet", urlPatterns={"/addHotel"})
//public class AddHotelServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        request.getRequestDispatcher("pages/admin/addTHotel.jsp").forward(request, response);
//
//      //  String name, String adress, int stars, String description, double price
//
//        String name = request.getParameter("name");
//        String adress = request.getParameter("adress");
//        int stars = Integer.parseInt(request.getParameter("stars"));
//        String description = request.getParameter("description");
//       double price = Double.parseDouble(request.getParameter("price"));
//
//        Hotel hotel = new Hotel(name,adress,stars,description,price);
//
//        HotelServiceImpl.getInstance().update(hotel);
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doPost(request, response);
//    }
//}
