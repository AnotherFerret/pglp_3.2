package employe;

public class SalaireVendeur extends SalaireEmploye
{
	int commission;
	public SalaireVendeur(String nom, String adresse, int annee, int commission)
	{
		super(nom, adresse, annee);
		this.commission = commission;
	}

	public String getAll()
	{
		return super.getAll() + commission;
	}
	
	@Override
	public int CalculSalaire() {return super.CalculSalaire() + commission;}
}