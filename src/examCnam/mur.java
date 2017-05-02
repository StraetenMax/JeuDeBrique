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
	public boolean plusHautQue(mur bMur){
		boolean bhaut;
		if(bMur.getHauteur()>this.getHauteur()){
			bhaut = false;
		}else{
			bhaut = true;
		}
		return bhaut;
	}
	public String decrire(){
		String def = super.decrire()+" qui est de couleur "+this.getCouleur();
		return def;
	}
}
