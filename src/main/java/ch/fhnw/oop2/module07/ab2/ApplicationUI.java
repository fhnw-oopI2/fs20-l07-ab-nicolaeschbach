package ch.fhnw.oop2.module07.ab2;

import java.text.DecimalFormat;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class ApplicationUI extends VBox {
	private Slider slider;
	private Label labelValue;
	private static DecimalFormat df = new DecimalFormat("0.00");

	
	public ApplicationUI() {
		// TODO Auto-generated constructor stub
		initializeControls();
		layoutControls();
	}


	private void initializeControls(){
	
		slider = new Slider(1,10,5.5);
		labelValue = new Label(String.valueOf(slider.getValue()));
		slider.valueProperty().addListener((listerner, alt , neu)-> {labelValue.setText(String.valueOf(df.format(neu)));
								});
	}
	
	private void layoutControls() {	
		
		setSpacing(20);
		setAlignment(Pos.TOP_CENTER);
		setPadding(new Insets(50,20,20,20));
		slider.setMajorTickUnit(1);
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		getChildren().addAll(labelValue, slider);
	}

}
