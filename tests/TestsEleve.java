package tests;
import classes.Eleve;
public class TestsEleve {

	public TestsEleve() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//*************   test de la méthode par défaut   *************
		Eleve eleve = new Eleve();
		//*************   affichage de la méthode par défaut   *************
		System.out.println(eleve.toString());
		//*************   test de la méthode   *************
		Eleve moneleve = new Eleve(9,"arrow","the flash","20-11-1990");
		//*************   affichage de la méthode par défaut   *************
		System.out.println(moneleve.toString());


	}

}
