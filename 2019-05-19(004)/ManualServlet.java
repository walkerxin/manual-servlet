import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ManualServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        System.out.println("MyServlet 在处理 get() 请求...");
        response.setContentType("text/html;charset=utf-8");
        // setContentType 放在 response.getWriter() 前面才能生效，中文不乱码。
        PrintWriter out = response.getWriter();
        out.println("<strong>不错，是Manual Servlet!</strong>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("MyServlet 在处理 post() 请求...");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=utf-8");
        out.println("<strong>是的，Manual Servlet!</strong>");
    }

}