package oktober10;

public class nyolcadikFeladat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Legyen a paraméter egy 100 és 9999 közé eso szám! Írasd ki a képernyore a
számjegyek összegét! A megoldáshoz használj ciklust!*/
		System.out.println("8. feladat");
		String szam = "123456";
		int sum = 0;
		for (int i = 0; i < szam.length(); i++) {
			String temp = "" + szam.charAt(i);
			sum += Integer.parseInt(temp);
		}
		System.out.println(sum);
		
	}

}
