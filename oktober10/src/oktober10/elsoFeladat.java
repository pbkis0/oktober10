package oktober10;

public class elsoFeladat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Írj programot, amely kiírja a felhasználó által adott összes paramétert!
Segítség: a paraméterek számát az args tömb hosszából tudjuk meg, amit
az args.length hivatkozás ad meg. */
		System.out.println("Paraméterek: ");
		if(args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i] + " ");
			}
		}else
			System.out.println("Nem adtál meg paramétert.");
			
	}

}
