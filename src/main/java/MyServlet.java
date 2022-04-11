import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyServlet extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        if (req instanceof HttpServletRequest) {
            HttpServletRequest httpServletRequest = (HttpServletRequest) req;
            String method = httpServletRequest.getMethod();

            if (method == "GET") {
                res.getWriter().println("This is GET request");
            }
        }
    }
}
