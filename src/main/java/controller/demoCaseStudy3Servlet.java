package controller;

import Dao.demoCS3DAO;
import Dao.productDao;
import model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "demoCaseStudy3Servlet", urlPatterns = "/product")
public class demoCaseStudy3Servlet extends HttpServlet {
    private demoCS3DAO productDaos = new productDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
