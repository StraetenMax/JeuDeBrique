package examCnam;

public class leJeu {

	public static void main(String[] args) {
		elementGraphique E1 = new elementGraphique("balle",80,80);
		elementFixe F1 = new elementFixe("Titre",40,1000,150,1300);
		brique B1 = new brique("Brique 1", 40, 200, 300, 300, 0);
		brique B2 = new brique("Brique 2", 40, 200, 700, 300, 0);
		mur M1 = new mur("Mur 1", 40, 20000, 1, 1,"Bleu");
		mur M2 = new mur("Mur 2", 20000, 40,1, 1,"Bleu");
	
		System.out.println(E1.decrire());
		System.out.println(F1.decrire());
		System.out.println(B1.decrire());
		
		System.out.println(B1.estMoinsAbimeeQue(B2));
		System.out.println(M1.plusHautQue(M2));
	}

}
