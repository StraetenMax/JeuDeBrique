package examCnam;

public class mur extends elementFixe{
     //propriétés
	String couleur;
	
	//constructeur vide
	public mur(){
		super();
		couleur = "aucune";
	}
	
	//constructeur initialisé
	public mur(String cNom, int cHauteur, int cLargeur, int cPositionX, int cPositionY, String cCouleur){
		super(cNom, cHauteur, cLargeur, cPositionX, cPositionY);
		couleur = cCouleur;
	}
	//getteur et setteur
	public String getCouleur(){
		return couleur;
	}
	public void getCouleur(String pCouleur){
		couleur = pCouleur;
	}
	//methodes
	
}
