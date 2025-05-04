package iut.gon.tp3;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Label;

public class GrilleModel {
	
	
	public String[][]  tab = new String[3][3];
	public SimpleStringProperty[][] str = new SimpleStringProperty[3][3];
	
	public GrilleModel() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				tab[i][j] = "Bonjour";
			}
		}
	}
	


	public StringProperty[][] getSimpleStringProperty() {
		return str;
	}



	public void setSimpleStringProperty(SimpleStringProperty stringProperty, int lg, int col) {
		this.str[lg][col] =  stringProperty;
	}



	public void setCase(int lg, int col, String texte) {
		tab[lg][col] = texte;
	}
	
	public String getCase(int lg, int col) {
		return tab[lg][col];
	}
	
	public void clicLabel(Label l, int lg, int col) {
		l.setOnMouseClicked(event -> {
			setCase(lg, col, "Au revoir");
			l.setText(getCase(lg,col));
		});
	}
}
