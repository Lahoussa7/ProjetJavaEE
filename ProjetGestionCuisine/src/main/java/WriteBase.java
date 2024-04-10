

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import ProjetGestionCuisine.EcrireBase;
/**
 * Servlet implementation class WriteBase
 */
public class WriteBase extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WriteBase() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
		PrintWriter p = response.getWriter();

		String recette= request.getParameter("choix");
		String numPerson = request.getParameter("nombre");
		p.println("<head><link rel='stylesheet' href='style.css'></head>");
		p.println("<body bgcolor='tomato'>");
		p.println("<div class='titre'>");
		p.println("Recette de: "+ recette + " pour " + numPerson +" personne(s)");
		p.println("</div>");
		p.println("</body>");
		//p.println(numPerson);
		// EcrireBase ecrire = new  EcrireBase();
		try {
			EcrireBase.recupevalue(recette,Integer.parseInt(numPerson),request,response);
		} catch (NumberFormatException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
