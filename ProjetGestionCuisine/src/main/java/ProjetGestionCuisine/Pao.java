package ProjetGestionCuisine;

public class Pao extends Recette {
    // Constructeur de la classe Pao
	 public Pao(float farine, float sucre, float oeuf, float nombrePersonne, float beurre, float levureBoulanger, float sel, String garniture, float quantite, float Lait, float huile, float levure_chimique,String rec) {
         super(farine, sucre, oeuf, nombrePersonne, beurre, levureBoulanger, sel, garniture, quantite,Lait,huile,levure_chimique,rec);
}
    // Méthodes spécifiques à la classe Pao
      public Pao(float farine, float sucre, float oeuf,int nombrePersonne,float levureBoulanger,float sel,String garniture,float quantite,float Lait, float huile) {
        this(farine, sucre, oeuf, nombrePersonne, 0, levureBoulanger, sel,garniture,quantite, Lait,huile,0,""); // Utilise des valeurs par défaut pour les attributs non fournis
    }
}