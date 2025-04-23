package iut.gon.tp3;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class GrilleController implements Initializable{
	private @FXML GridPane grille;
	
	@Override
	public void initialize(URL url, ResourceBundle ressource) {
		grille.setStyle("-fx-background-color: seashell");
		Label tabLabel[][] = new Label[3][3];
		for(int i =0; i<3; i++) {
			for(int j=0; j<3; j++) {
				tabLabel[i][j] =  new Label();
				tabLabel[i][j].setText(String.format("L%dC%d", j, i));
				tabLabel[i][j].onMouseClickedProperty();
				grille.add(tabLabel[i][j], i, j);
				
			}
		}
	}
}
