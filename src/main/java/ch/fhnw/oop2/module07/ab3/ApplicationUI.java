package ch.fhnw.oop2.module07.ab3;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.util.converter.NumberStringConverter;

public class ApplicationUI extends VBox {
	private Slider slider;
	private TextField valueField;

	public ApplicationUI() {
		// TODO Auto-generated constructor stub
		initializeControls();
		layoutControls();
	}


	private void initializeControls(){
		
		slider = new Slider(1,10,5.5);
		valueField = new TextField();
		valueField.textProperty().bindBidirectional(slider.valueProperty(), new NumberStringConverter());
	}
	
	private void layoutControls() {	
		
		setSpacing(20);
		setAlignment(Pos.CENTER);
		setPadding(new Insets(20,20,20,20));
		slider.setMajorTickUnit(1);
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		getChildren().addAll(valueField, slider);
	}

}
