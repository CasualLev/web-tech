package auca.domain;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    // Expected valid Email and Password
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hard-coded email and password (replace with your own)
        String Email = "levy@auca.ac.rw";
        String Password = "123456789";

        // Get user-entered credentials
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (email.equals(Email) && password.equals(Password)) {
            // Successful login, redirect to the home page or another protected resource
            response.sendRedirect("homePage.html");
        } else {
            // Incorrect credentials, redirect to the forgot password page
            response.sendRedirect("PassRcover.html");
        }
    }
}

