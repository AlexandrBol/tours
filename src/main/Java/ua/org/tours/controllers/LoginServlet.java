package ua.org.tours.controllers;//package ua.org.tours.controllers;
//
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
////@WebServlet("/login")
//public class LoginServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String login = request.getParameter("email");
//        String password = request.getParameter("password");
//        User user = UserServiceImpl.getInstance().UserGetByEmail(login);
//
//        if (user != null && user.getPassword().equals(password)) {
//            request.getSession().setAttribute("user", user);
//            response.sendRedirect(request.getSession().getAttribute("url").toString());
//        } else {
//            request.getSession().setAttribute("message", "Wrong users name or password");
//            response.sendRedirect(request.getContextPath() + "/pages/common/login.jsp");
//        }
//
//
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doPost(request, response);
//    }
//}
