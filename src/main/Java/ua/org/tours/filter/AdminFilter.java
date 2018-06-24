package ua.org.tours.filter;//package ua.org.tours.filter;
//
//import ua.org.tours.model.User;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebFilter(filterName = "AdminFilter", urlPatterns = "/pages/admin/*")
//public class AdminFilter implements Filter {
//    public void destroy() {
//    }
//
//    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
//        HttpServletRequest request = (HttpServletRequest) req;
//        HttpServletResponse response = (HttpServletResponse) resp;
//
//        User user = (User) request.getSession().getAttribute("user");
//        if (user != null && user.getPreferences().getName().equals("Admin")) {
//            chain.doFilter(req, resp);
//        } else {
//            request.getSession().setAttribute("url", request.getRequestURI());
//            request.getSession().setAttribute("message", "You have to be admin");
//            response.sendRedirect(request.getContextPath() + "/pages/common/login.jsp");
//        }
//    }
//    public void init(FilterConfig config) throws ServletException {
//
//    }
//
//}
