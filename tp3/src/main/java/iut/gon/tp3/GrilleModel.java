package iut.gon.tp3;

public class GrilleModel {
	
	
	public String[][]  tab = new String[3][3];
	public void creerTableau(){
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				tab[i][j] = "Bonjour";
			}
		}
	}
	
	public void setCase(int lg, int col, String texte) {
		tab[lg][col] = texte;
	}
	
	public String getCase(int lg, int col) {
		return tab[lg][col];
	}
}
