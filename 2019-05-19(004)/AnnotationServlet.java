import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/annotation")
public class AnnotationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        System.out.println("Servlet（3.0 注解方式） 在处理 get() 请求...");
        response.setContentType("text/html;charset=utf-8");
        // setContentType 放在 response.getWriter() 前面才能生效，中文不乱码。
        PrintWriter out = response.getWriter();
        out.println("<strong>不错，是Annotation Servlet!</strong>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("servlet（3.0 注解方式） 在处理 post() 请求...");
        response.setContentType("text/html;charset=utf-8");
        // setContentType 放在 response.getWriter() 前面才能生效，中文不乱码。
        PrintWriter out = response.getWriter();
        out.println("<strong>是的，Annotation Servlet!</strong>");
    }

}