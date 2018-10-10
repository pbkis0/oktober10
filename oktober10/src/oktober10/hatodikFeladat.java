package oktober10;

public class hatodikFeladat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Írj programot, amely a paraméterben megadott számról eldönti, hogy
tökéletes-e!
Segítség: egy szám tökéletes, ha a nálánál kisebb osztóinak összege
megegyezik önmagával.
pl. 6 osztói: 1+2+3=6;
28 osztói: 1+2+4+7+14=28.*/
		if(args.length == 1) {
			int szam = Integer.parseInt(args[0]);
			int osztosum = 0;
			
			for (int i = 1; i < szam; i++) {
				if(szam % i == 0) {
					osztosum +=i;
				}
			}
			if (szam == osztosum) {
				System.out.println("A szám tökéletes!");
			} else {
				System.out.println("A szám nem tökéletes!");
			}
		} else {
			System.out.println("Egy paramétert adj meg!");
		}
		
	}

}
