package oktober10;

public class kilencedikFeladat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Írj programot, amely kirajzolja az amerikai zászlót! (A bal felso sarokban
csillagok, a többi részen kötojelek.) A megoldáshoz használj egymásba
ágyazott ciklusokat! */
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 40; j++) {
				if(i < 5 && j < 15) {
					System.out.println("*");
				} else {
					System.out.println("-");				}
			}
		}
		System.out.println();
		
	}
}
}
