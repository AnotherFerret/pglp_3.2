package employe;

public class Employe {

	private final String nom;
	private final String adresse;
	
	public Employe(String nom, String adresse)
	{
		this.nom = nom;
		this.adresse = adresse;

	}
	
	public String getAll()
	{
		return nom + " " + adresse + " ";
	}
	
	public int CalculSalaire()
	{
		System.out.println("erreur : tentativer de lancer fonction pseudo abstraite");
		return 0;
	}
}