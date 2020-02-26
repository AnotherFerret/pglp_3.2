package employe;

public class SalaireManager extends CalculSalaire {

	@Override
	public int calcul_salaire(Employe e) {return 1500+e.getSousfifre();}
}
