package oktober10;

public class harmadikFeladat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Módosítsuk az elozo programot úgy, hogy ne az 1 és 20 közé eso páros,
hanem a paraméterként megadott két szám közé eso 3-mal osztható
számokat listázzuk ki! */
			if(args.length == 2) {
			int tol = Integer.parseInt(args[0]);
			int ig = Integer.parseInt(args[1]);
			
			System.out.println("3mal osztható számok: " + tol + " és " + ig + " között:");
			for (int i = tol; i <= ig; i++) {
				if(i %3 == 0) {
					System.out.println(i + " ");
				}
			}
		}else {
			System.err.println("Két paramétert várok!");
		}
		
		
		
		}
	}


