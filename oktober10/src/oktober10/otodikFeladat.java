package oktober10;

public class otodikFeladat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Írj programot, mely két paraméterrel muködik. Az elso egy karakterlánc, a
második pedig egy szám, amely azt adja meg, hányszor íródjon ki
lépcsozetesen a képernyore az elso paraméter.*/
		if(args.length == 2) {
			String szo = args[0];
			int szam = Integer.parseInt(args[1]);
			
			for (int i = 0; i <szam; i++) {
				for (int j=0; j<i; j++) {
					System.out.print(" ");
				}
				System.out.println(szo);
			}
		} else {
			System.err.println("Két paramétert várok!");
		}
		
	}

}
