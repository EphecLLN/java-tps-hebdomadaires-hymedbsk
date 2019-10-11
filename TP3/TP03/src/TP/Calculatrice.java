package TP;

public class Calculatrice {
	private double valeurCourante;
	private double n;
	

	public  Calculatrice(double value) {
		this.valeurCourante = value;
		
		
	}
	

	public double ajoute(double n) {
		this.valeurCourante += n;
		
		return this.valeurCourante;
	}
	
	public double soustrait(double n) {
		this.valeurCourante -= n;
		return this.valeurCourante;
	}
	
	public double carre(double n) {
		this.valeurCourante = Math.pow(this.valeurCourante, 2);
		return this.valeurCourante;
	}
	
	public   String toString() {
		
		return ("La réponse = "+ this.valeurCourante );
	}
	
	
	public double getValeurCourante() {
		return valeurCourante;
	}

	public void setValeurCourante(double valeurCourante) {
		this.valeurCourante = valeurCourante;
	}

	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}

	public static void main (String [] args) {
		
		Calculatrice a = new Calculatrice(5);
		
		
		 System.out.println(a);
	}
}
