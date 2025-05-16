package fr.unicaen.iut.tp5;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ControllerDemineur implements Initializable {
	public ModeleDemineur modele;
	
	@FXML private GridPane gridPane;
	@FXML private VBox vBox;
	@FXML private TextField textFieldInconnu;
	@FXML private TextField textFielMarque;
	@FXML private ToggleGroup groupe;
	@FXML private HBox hbox;
	@FXML private BorderPane borderPane;
	@FXML private Menu menuJeu;
	@FXML private Menu menuChoixDifficulte;
	@FXML private MenuBar menuBar;
	@FXML private MenuItem menuQuitter;
	@FXML private RadioMenuItem menuFacile;
	@FXML private RadioMenuItem menuMoyen;
	@FXML private RadioMenuItem menuDifficile;
	

	public ControllerDemineur(ModeleDemineur modeleDemineur) {
		this.modele = modeleDemineur;
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("controller");
		textFieldInconnu.textProperty().bind(modele.nbInconnuesProperty().asString());
		textFielMarque.textProperty().bind(modele.nbMarquesProperty().asString());
	
		
		
	}

}
