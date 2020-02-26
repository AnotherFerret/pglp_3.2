package employe;

public class SalaireEmploye extends CalculSalaire
{
	@Override
	public int calcul_salaire(Employe e) {return 1500+ 20*e.getAnnee();}
}
