package ch.fhnw.oop2.module07.ab3;

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.Stage;

public class Starter extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent rootParent = new ApplicationUI();
		Scene scene = new Scene(rootParent);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Arbeitsblatt 2 - Slider");
		primaryStage.setWidth(400);
		primaryStage.setHeight(250);
		primaryStage.show();
			
	}
	
	
	public static void main(String[] args) {
		Starter.launch(args);
		
	}
}
