package ProjetGestionCuisine;

public class Tarte extends Recette {
    // Constructeur de la classe Baba
	 public Tarte(float farine, float sucre, float oeuf, float nombrePersonne, float beurre, float levureBoulanger, float sel, String garniture, float quantite, float Lait, float huile, float levure_chimique,String rec) {
		 super(farine, sucre, oeuf, nombrePersonne, beurre, levureBoulanger, sel, garniture, quantite,Lait,huile,levure_chimique,rec);
	 }

    // Méthodes spécifiques à la classe Baba
    
     public Tarte(float farine, float sucre, float oeuf,float nombrePersonne,float beurre) {
        this(farine, sucre, oeuf, nombrePersonne, beurre, 0, 0, "", 0,0,0,0,""); // Utilise des valeurs par défaut pour les attributs non fournis
    }
}
