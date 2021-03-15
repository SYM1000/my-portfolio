package com.google.sps.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/** Servlet that returns HTML that contains the page view count. */
@WebServlet("/random-string")
public class RandomStringServlet extends HttpServlet {
    
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    ArrayList<String> messages = new ArrayList<String>();
    messages.add("Say hello to my little friend");
    messages.add("May the Force be with you.");
    messages.add("Why so serious?");

    String json = new Gson().toJson(messages);

    // Send the JSON as the response
    response.setContentType("application/json;");
    response.getWriter().println(json);
  }

}