package oktober10;

public class negyedikFeladat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Írj olyan programot, amely kiírja a paraméterként megadott szám osztóit!
Ha a szám prím, errol is tájékoztassa a felhasználót! A megoldáshoz
használj for-ciklust! */
		if(args.length == 1) {
			int szam = Integer.parseInt(args[0]);
			int oszto = 0;
			
			System.out.println(szam + " osztói: ");
			for (int i = 1; i <= szam; i++) {
				if(szam % i == 0) {
					System.out.println(i + " ");
					oszto++;
				}
			}
			if(oszto == 2) {
				System.out.println("A szám prímszám!");
			} else {
				System.out.println("A szám !prímszám.");
			}
		}
		
		
	}

}
