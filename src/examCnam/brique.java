package examCnam;

public class brique extends elementFixe{
	//propriétés
	private int niveau;
	private boolean aAfficher;
	
	//constructeur vide
	public brique(){
		super();
		niveau= 0;
		this.setAAfficher();
	}
	//constructeur initialisé
	public brique(String cNom, int cHauteur,int cLargeur, int cPositionX, int cPositionY, int cNiveau){
		super(cNom, cHauteur, cLargeur, cPositionX, cPositionY);
		niveau = cNiveau;
		this.setAAfficher();
	}
	//getteur
	public int getNiveau(){
		return niveau;
	}
	public boolean getAAfficher(){
		return aAfficher;
	}
	//setteur
	public void setNiveau(int pNiveau){
		niveau= pNiveau;
		this.setAAfficher();
	}
	public void setAAfficher(){
		if(this.niveau == 0){
			aAfficher = false;	
		}else{
			aAfficher = true;
		}
		
	}
	
	//méthodes
	public boolean estMoinsAbimeeQue(brique Pbrik){
		boolean bmaq;
		
		if(Pbrik.getNiveau() < this.getNiveau()){
			bmaq= false;
		}else {
			bmaq= true;
		}
		return bmaq;
	}
	
	public String decrire(){
		String bmaq1 = super.decrire()+" dont le niveau est de "+this.getNiveau();
		return bmaq1;		
	}
}
