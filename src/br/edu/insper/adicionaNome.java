package br.edu.insper;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
/**
 * Servlet implementation class adicionaNome
 */
@WebServlet("/adicionaNome")
public class adicionaNome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adicionaNome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		String nome = request.getParameter("nome");
		String curso = request.getParameter("curso");
		String email = request.getParameter("email");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>" + "Confirme os seus dados!"+"</h1>");
		out.println("<p> Olá! Obrigado por se cadastrar em nosso sitema! Para maior segunraça, confirme os seus dados a seguir:</p>");
		out.println("<p> Nome: "+ nome + "</p>");
		out.println("<p> Curso: "+ curso + "</p>");
		out.println("<p> E-mail: "+ email + "</p>");
		out.println("</body>");
		out.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		
		
	}

}
