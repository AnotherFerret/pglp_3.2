package employe;

public class SalaireManager extends SalaireEmploye {

	int sousfifre;
	public SalaireManager(String nom, String adresse, int annee, int sousfifre)
	{
		super(nom, adresse, annee);
		this.sousfifre = sousfifre;
	}
	
	public String getAll()
	{
		return super.getAll() + sousfifre;
	}

	@Override
	public int CalculSalaire() {return super.CalculSalaire() + sousfifre*100;}
}
