package ProjetGestionCuisine;

public class Recette {
	 protected float farine;
	    protected float sucre;
	    protected float oeuf;
	    protected float nombrePersonne;
	    protected float beurre;
	    protected float levureBoulanger;
	    protected float sel;
	    protected String garniture;
	    protected float quantite;
	    protected float Lait;
	    protected float huile;
	    protected float levure_chimique;
	    protected String rec;

	    public Recette(float farine, float sucre, float oeuf, float nombrePersonne, float beurre, float levureBoulanger, float sel, String garniture, float quantite, float Lait, float huile, float levure_chimique,String rec) {
	        this.farine = farine;
	        this.sucre = sucre;
	        this.oeuf = oeuf;
	        this.nombrePersonne = nombrePersonne;
	        this.beurre = beurre;
	        this.levureBoulanger = levureBoulanger;
	        this.sel = sel;
	        this.garniture = garniture;
	        this.quantite = quantite;
	        this.Lait = Lait;
	        this.huile = huile;
	        this.levure_chimique = levure_chimique;
	        this.rec="";
	    }

	    // Getters
	    public float getFarine() {
	        return this.farine;
	    }

	    public float getSucre() {
	        return this.sucre;
	    }

	    public float getOeuf() {
	        return this.oeuf;
	    }
	    public String getRec() {
	        return this.rec;
	    }

	    public float getNombrePersonne() {
	        return this.nombrePersonne;
	    }

	    public float getBeurre() {
	        return this.beurre;
	    }

	    public float getLevureBoulanger() {
	        return this.levureBoulanger;
	    }

	    public float getSel() {
	        return this.sel;
	    }

	    public String getGarniture() {
	        return this.garniture;
	    }

	    public float getQuantite() {
	        return this.quantite;
	    }

	    public float getLait() {
	        return this.Lait;
	    }

	    public float getHuile() {
	        return this.huile;
	    }

	    public float getLevure_chimique() {
	        return this.levure_chimique;
	    }

	    // Setters
	    public void setFarine(float farine) {
	        this.farine = farine;
	    }

	    public void setSucre(float sucre) {
	        this.sucre = sucre;
	    }

	    public void setOeuf(float oeuf) {
	        this.oeuf = oeuf;
	    }

	    public void setNombrePersonne(float nombrePersonne) {
	        this.nombrePersonne = nombrePersonne;
	    }

	    public void setBeurre(float beurre) {
	        this.beurre = beurre;
	    }

	    public void setLevureBoulanger(float levureBoulanger) {
	        this.levureBoulanger = levureBoulanger;
	    }

	    public void setSel(float sel) {
	        this.sel = sel;
	    }

	    public void setGarniture(String garniture) {
	        this.garniture = garniture;
	    }

	    public void setQuantite(float quantite) {
	        this.quantite = quantite;
	    }

	    public void setLait(float Lait) {
	        this.Lait = Lait;
	    }

	    public void setHuile(float huile) {
	        this.huile = huile;
	    }

	    public void setLevure_chimique(float levure_chimique) {
	        this.levure_chimique = levure_chimique;
	    }
	    public void setRec(String rec) {
	        this.rec = rec;
	    }

	}
	

