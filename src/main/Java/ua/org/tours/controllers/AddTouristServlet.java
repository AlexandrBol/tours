package ua.org.tours.controllers;//package ua.org.tours.controllers;
//import ua.org.tours.model.Tourist;
//import ua.org.tours.service.impl.TouristServiceImpl;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
////TODO ADD DOB
////String name, String surname, String phone, String email, int group_id
//@WebServlet(name = "AddTouristServlet", urlPatterns={"/AddTourist"})
//public class AddTouristServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        request.getRequestDispatcher("pages/admin/addTourist.jsp").forward(request, response);
//
//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");
//        String phone = request.getParameter("phone");
//        String email = request.getParameter("email");
//        int group_id = Integer.parseInt(request.getParameter("group_id"));
//
//
//       Tourist tourist = new Tourist(name,surname,phone,email,group_id);
//
//    TouristServiceImpl.getInstance().update(tourist);
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doPost(request, response);
//    }
//}
