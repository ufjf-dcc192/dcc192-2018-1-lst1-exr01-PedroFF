/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.br.dcc192;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author Pedro
 */
@WebServlet(name = "ListaString", urlPatterns = {"/lista.html"})
public class ListaString extends HttpServlet {
    
    List <String> frutas = new ArrayList<String>();
   
    
}
