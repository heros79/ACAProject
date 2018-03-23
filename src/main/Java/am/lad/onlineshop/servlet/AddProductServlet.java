package am.lad.onlineshop.servlet;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import java.io.*;
import java.util.Properties;
import java.util.Random;


/**
 * Created by David on 3/23/2018.
 */


@MultipartConfig
public class AddProductServlet extends HttpServlet {

    public static String getPath() throws IOException {
        Properties properties=new Properties();
//        Reader reader = new InputStreamReader(getClass().getClassLoader().getResourceAsStream("config.properties"));
        Reader reader=new FileReader("D:\\OnlineShop\\src\\main\\resources\\config.properties");
        properties.load(reader);
        return (String)properties.get("root.dir");
    }

    Random random = new Random();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final Part filePart = req.getPart("file");
        final String fileName = getFileName(filePart);
        final String path=getPath() + random.nextInt(100);

        OutputStream out = null;
        InputStream filecontent = null;

        final PrintWriter writer = resp.getWriter();

        try {
            out = new FileOutputStream(new File(fileName));
            filecontent = filePart.getInputStream();

            int read = 0;
            final byte[] bytes = new byte[1024];

            while ((read = filecontent.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
        } catch (FileNotFoundException fne) {
            writer.println("You either did not specify a file to upload or are "
                    + "trying to upload a file to a protected or nonexistent "
                    + "location.");
            writer.println("<br/> ERROR: " + fne.getMessage());
        } finally {
            if (out != null) {
                out.close();
            }
            if (filecontent != null) {
                filecontent.close();
            }
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("index.html");
        writer.println("<font color=blue> New file " + path + "<font>");
        dispatcher.include(req,resp);
    }

    private String getFileName(final Part part) {
        final String partHeader = part.getHeader("content-disposition");
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }

}
