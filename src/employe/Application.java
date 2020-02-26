package employe;

public class Application {

	public static void main(String[] args) {
		Employe tabEmploye[] = new Employe[3];
		AfficheEmploye affiche = new AfficheEmploye();
		
		int total = 0;
		
		tabEmploye[0] = new SalaireEmploye("name", "name2", 2);
		tabEmploye[1] = new SalaireVendeur("name", "name2", 5, 777);
		tabEmploye[2] = new SalaireManager("nameM", "name2M", 15, 220);
		
		for(Employe i : tabEmploye)
		{
			affiche.SortieEmploye(i);
			total += i.CalculSalaire();
		}
		
		System.out.println(total);

	}

}
