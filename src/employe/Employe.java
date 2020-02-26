package employe;

public class Employe {

	private final String nom;
	private final String adresse;
	private int annee;
	private int commission;
	private int sousfifre;
	
	public Employe(String nom, String adresse, int annee)
	{
		this.nom = nom;
		this.adresse = adresse;
		this.annee = annee;
		this.commission = 655;
	}
	public void affiche_coordonnees(){ System.out.println(nom + "   " + adresse); }
	public int getAnnee() {return this.annee;}
	public int getCommission() {return this.commission;}
	public int getSousfifre() {return this.sousfifre;}
}