package personnages;

public class Romain {

	private String nom;
	private int force;

	private Boolean isInveriantVerified() {
		return force >= 0;
	}
	public String getNom() {
		return nom;
	}
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInveriantVerified();
	}
	

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain" + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		
		assert forceCoup > 0;
		int forceAvant = force;
		force -= forceCoup;
		
		if (force > 0) {
			parler("Aïe ");
		} else {
			parler("J'abandonne...");
		}
		
		assert force < forceAvant;
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
	}
}

