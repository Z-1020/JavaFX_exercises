package iut.gon.tp3;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class GrilleController implements Initializable{
	private @FXML GridPane grille;
	public GrilleModel gm;
	
	public GrilleController(GrilleModel g) {
		this.gm = g;
	}
	
	@Override
	public void initialize(URL url, ResourceBundle ressource) {
		
		grille.setStyle("-fx-background-color: seashell");
		Label tabLabel[][] = new Label[3][3];
		for(int i =0; i<3; i++) {
			for(int j=0; j<3; j++) {
				Label l = new Label();
				l.setMaxSize(1000, 1000);
				l.setAlignment(Pos.CENTER);
				l.setTextAlignment(TextAlignment.CENTER);
				l.setText(gm.getCase(j, i));
				gm.clicLabel(l, i, j);
				 tabLabel[i][j] = l;
				grille.add(l, i, j);
			}
		}
	}
}
