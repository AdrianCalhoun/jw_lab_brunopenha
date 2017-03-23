/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.java.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author escm
 */
public class PrimeiroServlet extends HttpServlet{
    public void doGet (HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter saída = resp.getWriter();
        Date hoje = new Date();
        saída.println("<html>" +
                        "<body>" +
                         "<h1 align=center> Nosso primeiro servlet </h1>" +
                         "<br />" + hoje +
                        "</body>" +
                      "</html>");
    }
}
