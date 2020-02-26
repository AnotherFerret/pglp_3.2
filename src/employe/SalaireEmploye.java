package employe;

public class SalaireEmploye extends Employe
{
	int annee;
	public SalaireEmploye(String nom, String adresse, int annee)
	{
		super(nom, adresse);
		this.annee = annee;
	}
	
	public String getAll()
	{
		return super.getAll() + annee + " ";
	}

	@Override
	public int CalculSalaire() {return 1500+ 20*annee;}
}
