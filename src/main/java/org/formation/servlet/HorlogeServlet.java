package org.formation.servlet;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.awt.Label;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.PushBuilder;

@WebServlet("/HorlogeJSP")
public class HorlogeServlet extends HttpServlet {
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
		Label timeLabel = new Label(LocalTime.now().format(dtf));

		req.setAttribute("heure", timeLabel);
		req.getRequestDispatcher("/jsp/HorlogeJSP.jsp").forward(req, resp);
	}
}
