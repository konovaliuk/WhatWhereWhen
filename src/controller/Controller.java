package controller;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.ICommand;

import java.io.IOException;

public class Controller extends HttpServlet {
  

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        handleRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        handleRequest(req, resp);
    }

    private void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SessionRequestContent content = new SessionRequestContent(req);
        ICommand command = CommandResolv.getCommand(req);
        ExecuteResult result = command.execute(content);
        result.updateRequest(req);
        if (result.getDirection() == DirectionVariation.FORWARD)
            req.getRequestDispatcher(result.getPage()).forward(req, resp);
        if (result.getDirection() == DirectionVariation.REDIRECT)
            req.getRequestDispatcher(req.getContextPath() + result.getPage());
    }
}
