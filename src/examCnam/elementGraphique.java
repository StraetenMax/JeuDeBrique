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
	
	
	
}
