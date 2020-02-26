package employe;

public class SalaireVendeur extends CalculSalaire
{
	@Override
	public int calcul_salaire(Employe e) {return 1500+e.getCommission();}
}