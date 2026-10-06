package personnages;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;

	public boolean resterPotion() {
		return quantitePotion != 0;
	}
	
	public void remplirChaudron(int quantite, int forcePotion) {
		this.forcePotion = forcePotion;
		this.quantitePotion = quantite;
	}
	
	public int prendreLouche() {
		quantitePotion--;
		if (quantitePotion == 0) {
			forcePotion = 0;
		}
		return forcePotion;
	}
}
