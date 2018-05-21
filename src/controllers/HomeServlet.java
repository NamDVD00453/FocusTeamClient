package controllers;

import utility.Viewer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomeServlet extends Viewer {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> extraCss = new ArrayList<>();
        List<String> extraJS = new ArrayList<>();
        responseView(request, response, "Default Page", "/default.jsp", extraJS, extraCss);
    }
}
