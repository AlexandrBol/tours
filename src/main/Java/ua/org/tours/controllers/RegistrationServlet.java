package ua.org.tours.controllers;//package ua.org.tours.controllers;
//
//import ua.org.tours.model.Preferences;
//import ua.org.tours.model.User;
//import ua.org.tours.service.impl.UserServiceImpl;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//
////@WebServlet(name = "RegistrationServlet", urlPatterns={"/register"})
//public class RegistrationServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
//
//        String email = request.getParameter("email");
//        String password = request.getParameter("password");
//        String name = request.getParameter("name");
//        String phone = request.getParameter("phone");
//        Date DOB = null;
//        try {
//            DOB = (Date) format.parse(request.getParameter("DOB"));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        Preferences preferences = new Preferences("user");
//        request.getRequestDispatcher("pages/common/register.jsp").forward(request, response);
//
//       User user = new User(name,(Date) DOB,phone,email,preferences,password);
//
//    UserServiceImpl.getInstance().update(user);
//
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doPost(request, response);
//    }
//}
