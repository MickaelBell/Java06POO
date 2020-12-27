package Main;

import Wilders.Wilder;

public class Classroom {

	public static void main(String[] args) {
		
		
		Wilder sandra = new Wilder("Sandra", true);
		Wilder christophe = new Wilder("Christophe", false);
		Wilder malik = new Wilder("Malik", true);
		Wilder hugo = new Wilder("Hugo", false);
		Wilder lendel = new Wilder("Lendel", true);
		Wilder valentin = new Wilder("Valentin", false);
		
		sandra.whoAmI();
		christophe.whoAmI();
		malik.whoAmI();
		hugo.whoAmI();
		lendel.whoAmI();
		valentin.whoAmI();
		
	}

}
