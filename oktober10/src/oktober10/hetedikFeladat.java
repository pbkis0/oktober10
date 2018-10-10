package oktober10;

public class hetedikFeladat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Készíts programot, amely a paraméterben megadott tetszoleges számú
paraméternek számítja ki a számtani közepét!*/
		
		
		if(args.length > 0) {
			int osszeg = 0;
			for (int i = 0; i < args.length; i++) {
				int szam = Integer.parseInt(args[i]);
				osszeg += szam;
			}
			System.out.println((double) osszeg / args.length);
		}
		
		
	}

}
