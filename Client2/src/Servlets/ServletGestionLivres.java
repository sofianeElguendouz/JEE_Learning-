package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entites.Auteur;
import entites.Livre;
import session.GestionLivreBeanLocal;



@WebServlet("/ServletGestionLivres")
public class ServletGestionLivres extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	@EJB
	private GestionLivreBeanLocal gestion;
	
    public ServletGestionLivres() {
        super();
    }
/*-------------------------------------------------*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Livre> livres=gestion.ListerTousLesLivres(); 
		request.setAttribute("livres", livres); 
		request.getRequestDispatcher("page.jsp").forward(request, response);
	}
/*-------------------------------------------------*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String code= request.getParameter("code1"); 
		String nom= request.getParameter("nom1"); 
		Auteur auteur1=new Auteur(code,nom); 
		List <Auteur> auteurs = new ArrayList<Auteur>();
		auteurs.add(auteur1); 
		code= request.getParameter("code2"); 
		nom=request.getParameter("nom2"); 
		Auteur auteur2=new Auteur(code,nom); 
		auteurs.add(auteur2); 
		nom=request.getParameter("intitule"); 
		Livre l=new Livre(nom, auteurs); 
		gestion.ajouterLivre(l);
		doGet(request, response);
	}

}
