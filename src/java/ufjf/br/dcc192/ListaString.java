package ufjf.br.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ListaString", urlPatterns = {"/lista.html"})
public class ListaString extends HttpServlet {

    private List<String> frutas = new ArrayList<String>();
    private LengthComparator c = new LengthComparator();

    public ListaString() {

        String s1 = "banana";
        String s2 = "pera";
        String s3 = "maça";
        String s4 = "uva";
        String s5 = "morango";
        String s6 = "laranja";
        frutas.add(s1);
        frutas.add(s2);
        frutas.add(s3);
        frutas.add(s4);
        frutas.add(s5);
        frutas.add(s6);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet InicialServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2> Lista de Frutas </h2>");
        out.println("<ul>");
        switch (request.getParameter("ordenacao")) {
            case "true":
                Collections.sort(frutas);

                break;
            case "numletras":
                Collections.sort(frutas, c);

                break;
            case "aleatoria":
                Collections.shuffle(frutas);

                break;
        }
        for (String fruta : frutas) {
            out.println("<li><h4>" + fruta + "</h4></li>");
        }
        out.println("</ul>");
        out.println("</br>");
        out.println("<a href = '?ordenacao=true'>Lista Ordem Alfabética</a>");
        out.println("<a href = '?ordenacao=numletras'>Lista por número de letras</a>");
        out.println("<a href = '?ordenacao=aleatoria'>Lista Aleatória</a>");
        out.println("</body>");
        out.println("</html>");

    }

}
