package ua.org.tours.controllers;//package ua.org.tours.controllers;
//
//
//import ua.org.tours.model.Preferences;
//import ua.org.tours.model.Tour;
//import ua.org.tours.service.impl.TourServiceImpl;
//import ua.org.tours.service.impl.UserServiceImpl;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.time.format.DateTimeFormatter;
//import java.util.Date;
//
//
////(int numberOfPerson, int numberKids, int hotelId, Date startDate, Date endDate, int transferId, double price) {
////
//@WebServlet(name = "AddTourServlet", urlPatterns={"/addTourServlet"})
//public class AddTourServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("pages/common/addTour.jsp").forward(request, response);
//
//
//        DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
//
//        int numberOfPerson = Integer.parseInt(request.getParameter("numberOfPerson"));
//        int numberKids = Integer.parseInt(request.getParameter("numberKids"));
//        int hotelId = Integer.parseInt(request.getParameter("hotelId"));
//
//        Date startDate = null;
//        try {
//            startDate = (Date) format.parse(request.getParameter("startDate"));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//      Date endDate = null;
//        try {
//            startDate = (Date) format.parse(request.getParameter("endDate"));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        int transferId = Integer.parseInt(request.getParameter("transferId"));
//        double price = Double.parseDouble(request.getParameter("price"));
//
//        Tour tour = new Tour(numberOfPerson,numberKids,hotelId,startDate,endDate,transferId,price);
//
//        TourServiceImpl.getInstance().update(tour);
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doPost(request, response);
//    }
//}
