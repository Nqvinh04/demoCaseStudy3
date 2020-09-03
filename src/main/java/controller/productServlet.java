package controller;

import Dao.productDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "productServlet", urlPatterns = "/product")
public class productServlet extends HttpServlet {
    private final productDao products = new productDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                insertProduct(request,response);
                break;
            case"edit":
                updateProduct(request,response);
                break;

        }
    }




    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                showProduct(request,response);
                break;
            case "edit":
                see_after_update(request,response);
                break;
            case "delete":
                deleteProduct(request,response);
                break;
        }
    }

    private void see_after_update(HttpServletRequest request, HttpServletResponse response) {
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showProduct(HttpServletRequest request, HttpServletResponse response) {
    }

    private void insertProduct(HttpServletRequest request, HttpServletResponse response) {
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) {
    }

}
