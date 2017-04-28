package examCnam;

public class elementGraphique {
	//propriétés
	private String nom;
	private int hauteur, largeur;
	
	//constructeur vide
	public elementGraphique(){
		System.out.println("Installer les bases du jeu de briques");
		nom = "inconnu";
		hauteur = 0;
		largeur = 0;
	}	
	//constructeur initialisé
	public elementGraphique(String cNom, int cHauteur, int cLargeur){
		System.out.println("Installer les bases initialées des jeux de briques");
		nom = cNom;
		hauteur = cHauteur;
		largeur = cLargeur;
	}
	
	//getteur
	public String getNom(){
		return nom;
	}
	
	public int getHauteur(){
		return hauteur;
	}
	
	public int getLargeur(){
		return largeur;
	}
	
	//setteur
	public void setNom(String vNom){
		nom = vNom;
	}
	
	public void setHauteur(int vHauteur){
		hauteur = vHauteur;
	}
	
	public void setLargeur(int vLargeur){
		largeur = vLargeur;
	}
	
	//methodes
	public String afficher(){
		String txt = "Element affiché";
		return txt;
	}
	
	public String masquer(){
		String txt1 = "Element masqué";
		return txt1;	
	}
	
	public String decrire(){
		String txt2 = "Element graphique nommé : "+this.getNom()+" qui a "+this.getHauteur()+" pixels de haut et "+this.getLargeur()+" pixels de large ou "+this.getNom()+" est le nom, "+this.getHauteur()+" la hauteur et "+this.getLargeur()+" la largeur";
		return txt2;
	}
	
	
	
	
}
