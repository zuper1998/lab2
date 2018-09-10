package lab2;

abstract public class Jatekos {
	Asztal asztal;
	
	public Jatekos() {

	}
	public void setAsztal(Asztal a){
		asztal = a;
	}
	 public void lep(){
		
		 System.out.println("Kor: "+asztal.korok+" Me is lenni: " +toString());
	 }
	
	
	
}


