package lab2;

public class Asztal {
	Jatekos jatekosok[] = new Jatekos[10];
	double tet;
	int korok;

	public Asztal() {
		for (int i = 0; i < 10; i++) {
			jatekosok[i] = null;
		}
		// TODO Auto-generated constructor stub
	}

	public void addJatekos(Jatekos j) {
		for (int i = 0; i < 10; i++) {
			if (jatekosok[i] == null) {
				jatekosok[i] = j;
				j.setAsztal(this);
				break;
			}
		}

	}

	public void ujJatek() {
		tet = 0;
		korok = 0;
	}

	public void Kor() {
		for (int i = 0; i < 10; i++) {
			if (jatekosok[i] != null) {

			jatekosok[i].lep();
			
			}
			
		}
		System.out.println("Tet = " + tet);
		korok++;
	}
	public void emel(double b){
		tet = tet + b;
		
	}
	public int getKor(){
		return korok;
	}
}
