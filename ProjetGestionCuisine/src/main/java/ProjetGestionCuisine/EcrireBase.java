
package ProjetGestionCuisine;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import ProjetGestionCuisine.Recette;
import ProjetGestionCuisine.Baba;
import ProjetGestionCuisine.Pao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.io.IOException;
public class EcrireBase {
	private static final Recette pao = null;

	public static void recupevalue(String recette,int numprs,HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException,IOException {
		 	PrintWriter p = response.getWriter();
		 	 response.setContentType("text/html");
		 	 p.println("<head><link rel ='stylesheet href = 'style.css'></head>");
		 	String url = "jdbc:mysql://localhost:3306/recette";
	        String user = "mit";
	        String password = "123456";
	try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
         
	        // Établir la connexion
	        Connection connection = DriverManager.getConnection(url, user, password);
	       
//	        String sql = "SELECT * FROM listepatisserie " +
//                    "INNER JOIN Recette ON listepatisserie.id_recette = Recette.id_recette " +
//                    "INNER JOIN garniture ON Recette.id_patisserie = garniture.id_patisserie " +
//                    "WHERE patisser = ?;";
	       
	        PreparedStatement preparedStatement = connection.prepareStatement(" SELECT * FROM listepatisserie INNER JOIN Recette ON listepatisserie.id_recette = Recette.id_recette INNER JOIN garniture ON Recette.id_patisserie = garniture.id_patisserie WHERE patisser =?");
	        preparedStatement.setString(1, recette);

	        // Créer une instruction SQL
	       
	       // Statement statement = connection.createStatement();

	        // Exécuter la requête SQL
	        ResultSet resultSet = preparedStatement.executeQuery();
	        
	        // Parcourir et afficher les résultats
	        String rec="";
            float farine =0;
            float sucre=0 ;
            float oeuf=0;
            int  nombrePersonne=0 ;
            float beurre=0 ;
            float levureBoulanger=0 ;
            float sel=0 ;
            String garniture="";
            float quantite=0;
            float Lait=0;
            float huile =0;
            p.println("<body bgcolor='tomato'>");
           p.println("<div style=\" display: flex;justify-content:'center';\"'>");
           p.println("<div class ='decorer'>");
           p.println("<center style=\"font-size: 20px; color: black; font-family: Arial, sans-serif;\">");
          // p.println("<font >");
	        while (resultSet.next()) {
	            // Récupérer les valeurs de la base de données
	        	
	        	 rec = resultSet.getString("Patisser");
	             farine = resultSet.getFloat("Farine");
	             sucre = resultSet.getFloat("sucre");
	             oeuf = resultSet.getFloat("oeuf");
	              nombrePersonne = resultSet.getInt("nombre_personne");
	             beurre = resultSet.getFloat("beurre");
	             levureBoulanger = resultSet.getFloat("levure_boulanger");
	             sel = resultSet.getFloat("sel");
	             garniture = resultSet.getString("fruit_autre");
	             quantite = resultSet.getFloat("quantite");
	             Lait = resultSet.getFloat("Lait");
	             huile = resultSet.getFloat("huile");
	             Pao pao = new Pao(farine, sucre, oeuf, nombrePersonne,levureBoulanger, sel,garniture,quantite, Lait,huile);
	             Tarte tarte = new Tarte(farine, sucre, oeuf, nombrePersonne,beurre);
	             Panini panini = new Panini(farine, sucre, oeuf, nombrePersonne,levureBoulanger, sel, huile);
	             Baba baba = new Baba(farine, sucre, oeuf, nombrePersonne, beurre, levureBoulanger, sel, garniture, quantite,Lait);


	             if(numprs<=0){
	                    p.println("Pour le nombre de personne il faut qu'il soit supérieur à 0 merci!!");
	                }
	             else {
	             //Créer une instance de Baba et utiliser les méthodes set pour définir les attributs
	            if(recette.equals("Baba")) {

	            	
	               // Baba baba = new Baba(farine, sucre, oeuf, nombrePersonne, beurre, levureBoulanger, sel, garniture, quantite,Lait);

	                // Utiliser les méthodes get pour récupérer et afficher les valeurs
	              
	                if(numprs>=nombrePersonne || numprs<=nombrePersonne){
	
		                   p.println("Farine : " + (baba.getFarine()*numprs)/nombrePersonne +"g" + "<br>");
		                   p.println("Sucre : " + (baba.getSucre()*numprs)/nombrePersonne + "g"+ "<br>");
		                   p.println("Oeuf : " + (baba.getOeuf()*numprs)/nombrePersonne + "pcs" +"<br>");
		                   p.println("Nombre de personnes : " + (baba.getNombrePersonne()*numprs)/nombrePersonne + "<br>");
		                   p.println("Beurre : " + (baba.getBeurre()*numprs)/nombrePersonne + "g"+ "<br>");
		                   p.println("Levure boulanger : " + (baba.getLevureBoulanger()*numprs)/nombrePersonne + "g" + "<br>");
		                   p.println("Sel : " + (baba.getSel()*numprs)/nombrePersonne + "g"+ "<br>");
		                   p.println("Garniture : " + baba.getGarniture() + "<br>");
		                   p.println("Quantité : " + (baba.getQuantite()*numprs)/nombrePersonne + "g ou ml"+ "<br>");
	             
	                  
	                }
	            }
	    if(recette.equals("Pao")){
	        if(numprs >= nombrePersonne || numprs <= nombrePersonne){
	            // Ajustez les calculs en fonction de la classe Pao et de ses méthodes get
	            p.println("Farine : " + (pao.getFarine() * numprs) / nombrePersonne +"g" + "<br>");
	            p.println("Sucre : " + (pao.getSucre() * numprs) / nombrePersonne +"g" + "<br>");
	            p.println("Oeuf : " + (pao.getOeuf() * numprs) / nombrePersonne+"pcs" + "<br>");
	            p.println("Nombre de personnes : " + (pao.getNombrePersonne() * numprs) / nombrePersonne +"prs" + "<br>");
	            p.println("Levure boulanger : " + (pao.getLevureBoulanger() * numprs) / nombrePersonne +"g" + "<br>");
	            p.println("Sel : " + (pao.getSel() * numprs) / nombrePersonne +"g" + "<br>");
	            p.println("Garniture : " + pao.getGarniture()+"<br>");
	            p.println("Quantité : " + (pao.getQuantite() * numprs) / nombrePersonne +"g ou ml" + "<br>");
	            p.println("Huile : " + (pao.getHuile() * numprs) / nombrePersonne +"g ou ml" + "<br>" );
	            p.println("Lait : " + (pao.getLait() * numprs) / nombrePersonne +"g ou ml" + "<br>");
		 	       
	        }
	    }
//	   
	if(recette.equals("Tarte")) {
	   
	   // Tarte tarte = new Tarte(farine, sucre, oeuf, nombrePersonne,beurre);
	    if(numprs >= nombrePersonne || numprs <= nombrePersonne){
	        p.println("Farine : " + (tarte.getFarine() * numprs) / nombrePersonne +"g" + "<br>");
	        p.println("Sucre : " + (tarte.getSucre() * numprs) / nombrePersonne+"g" + "<br>");
	        p.println("Oeuf : " + (tarte.getOeuf() * numprs) / nombrePersonne +"pcs" + "<br>");
	        p.println("Nombre de personnes : " + (tarte.getNombrePersonne() * numprs) / nombrePersonne +"pcs" + "<br>");
	        p.println("Beurre : " + (tarte.getBeurre() * numprs) / nombrePersonne+"g" + "<br>");
	      
	    }
	}
	if(recette.equals("panini")) {
		 nombrePersonne = numprs;
	     if(numprs >= nombrePersonne || numprs <= nombrePersonne){
	        // Ajustez les calculs en fonction de la classe Panini et de ses méthodes get
	        p.println("Farine : " + (panini.getFarine() * numprs) / nombrePersonne +"g" + "<br>");
	        p.println("Sucre : " + (panini.getSucre() * numprs) / nombrePersonne +"g" + "<br>");
	        p.println("Oeuf : " + (panini.getOeuf() * numprs) / nombrePersonne +"pcs" + "<br>");
	       
	        p.println("Nombre de personnes : " + panini.getNombrePersonne()+"prs" + "<br>");
	        p.println("Beurre : " + (panini.getBeurre() * numprs) / nombrePersonne+"g" + "<br>");
	        p.println("Levure boulanger : " + (panini.getLevureBoulanger() * numprs) / nombrePersonne+"g" + "<br>");
	        p.println("Sel : " + (panini.getSel() * numprs) / nombrePersonne+"g" + "<br>");
	        p.println("Huile : " + (panini.getHuile() * numprs) / nombrePersonne+"ml" + "<br>");
	        // Supposons que Panini n'a pas de garniture ou quantité, ou que ces méthodes ne sont pas définies.
	    }
	}
	             }
	             p.println("</div>");
	             p.println("</div>");
	           
	        // Fermer les ressources
	        resultSet.close();
	        //statement.close();
	        connection.close();
	             
	
	        }
	        p.println("</center>");
	        p.println("</body>");
	}
	    catch (SQLException e) {
	        e.printStackTrace();
	    }
	    
	}
}

