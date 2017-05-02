package examCnam;

public class elementFixe extends elementGraphique{
	//propriétés
	private int positionX, positionY;
	
	//constructeur vide
	public elementFixe(){
		super();
		positionX = 0;
		positionY = 0;
	}
	//constructeur initialisé
	public elementFixe(String cNom, int cHauteur, int cLargeur, int cPositionX, int cPositionY){
		super(cNom, cHauteur, cLargeur);
		positionX = cPositionX;
		positionY = cPositionY;
	}
	 //getteur
	public int getPositionX(){
		return positionX;
	}	
	
	public int getPositionY(){
		return positionY;
	}
	//setteur
	public void setPositionX(int pPositionX){
		positionX=pPositionX;
	}
	public void setPositionY(int pPositionY){
		positionY=pPositionY;
	}
	//méthodes
	public String afficher(){
		String str= "Elément fixe affiché";
		return str;
	}
	public String decrire(){
		String str1 = super.decrire()+" qui est en position "+this.getPositionX()+" et position "+this.getPositionY();
		return str1;
	}
	
	
	
	
}
