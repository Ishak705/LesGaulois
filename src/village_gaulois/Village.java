package village_gaulois;

import personnages.Gaulois;

public class Village {
	private String nom;
	private Gaulois[] chef = new Gaulois[1];
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	
	
	public Village (String nom, Gaulois chef, final int NB_VILLAGEOIS_MAX) {
		this.nom = nom;
		this.chef[0] = chef;
		villageois = new Gaulois[NB_VILLAGEOIS_MAX];
	}
	
	public String getNom() {
		return nom;
	}
	
	public Gaulois[] getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {

		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	
	public Gaulois trouverVillageois(int numVillagois) {
		if(numVillagois > nbVillageois) {
			System.out.println("Il n’y a pas autant d’habitants dans notre village !");
			return null;
		}
		else {
			return villageois[numVillagois - 1];
		}
	}
	
	public void afficherVillage() {
		System.out.println("Dans le village " + nom + " du chef " + chef[0] + " vivent les légendaires gaulois : ");
		for (Gaulois villageois : villageois) {
			System.out.println("- " + villageois);
		}
		
	}
	
	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("le meilleur", abraracourcix, 30);
		village.trouverVillageois(30);
		
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterVillageois(asterix);
		
		Gaulois gaulois =  village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		
		village.afficherVillage();
		
		
	}
}
