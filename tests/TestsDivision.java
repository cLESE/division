package tests;
import classes.Division;
public class TestsDivision {

	public TestsDivision() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//*************   test de la méthode par défaut   *************
		Division div = new Division();
		//*************   affichage de la méthode par défaut   *************
		System.out.println(div.toString());
		//*************   test de la méthode   *************
		Division madiv = new Division(9,"test");
		//*************   affichage de la méthode par défaut   *************
		System.out.println(madiv.toString());


	}

}
