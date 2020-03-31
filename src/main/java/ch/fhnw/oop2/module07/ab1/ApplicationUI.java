package ch.fhnw.oop2.module07.ab1;

import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;


public class ApplicationUI extends FlowPane {
	private Button addButton;
	private int labelCounter = 0;

	public ApplicationUI() {
		// TODO Auto-generated constructor stub
		initializeControls();
		layoutControls();
		
	}

	private void initializeControls(){
		addButton = new Button("Add Label");
		addButton.setOnAction(event -> {
				labelCounter++;
				getChildren().add(new Label("Label " + labelCounter));
			});
	}
	
	private void layoutControls() {
		setPadding(new Insets(10));
		getChildren().add(addButton);
		setVgap(5);
		setHgap(10);
	}
	
}
