package ua.org.tours.controllers;//package ua.org.tours.controllers;
//
//
//import ua.org.tours.model.Flight;
//import ua.org.tours.model.Tour;
//import ua.org.tours.service.impl.FlightServiceImpl;
//import ua.org.tours.service.impl.TourServiceImpl;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.sql.Time;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Date;
//
//
//
//@WebServlet(name = "FlightServlet", urlPatterns={"/FlightServlet"})
//public class FlightServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("pages/common/addFlight.jsp").forward(request, response);
//
////(int transferId, double price, String arrivalPoint, String destinationPoint, Time time, LocalDateTime arrivalTime) {
//        DateFormat formatTime = new SimpleDateFormat("HH:mm:ss");
//        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss");
//
//        int transferId = Integer.parseInt(request.getParameter("transferId"));
//        double price = Double.parseDouble(request.getParameter("price"));
//        String arrivalPoint = request.getParameter("arrivalPoint");
//        String destinationPoint = request.getParameter("destinationPoint");
//
//        Time time = null;
//        try {
//            time = new Time(formatTime.parse(request.getParameter("time")).getTime());
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        LocalDateTime  arrivalTime = (LocalDateTime) formatDate.parse(request.getParameter("arrivalTime"));
//        Flight flight = new Flight(transferId,price,arrivalPoint,destinationPoint,time,arrivalTime);
//
//        FlightServiceImpl.getInstance().update(flight);
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doPost(request, response);
//    }
//}
