package lab2;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		Asztal a1 = new Asztal();
		Jatekos j1 = new Kezdo();
		Jatekos j3 = new Kezdo();
		Jatekos j2 = new Robot();

		a1.addJatekos(j1);
		a1.addJatekos(j3);
		a1.addJatekos(j2);
		for ( int i=0;i<3;i++){
			a1.Kor();
		}
			
		
	}

}
