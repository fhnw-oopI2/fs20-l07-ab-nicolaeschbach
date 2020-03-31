 package ch.fhnw.oop2.module07.ab1;

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;


public class Starter extends Application {

	@Override
	public void start(Stage stage) {
		// TODO Auto-generated method stub
		Parent rootPane = new ApplicationUI();
		Scene scene = new Scene(rootPane);
		stage.setTitle("Uebung1 - Add Label");
		stage.setWidth(500);
		stage.setHeight(300);
		stage.setScene(scene);
		stage.show();
		
		
	}

	
	public static void main(String[] args) {
		Starter.launch(args);
	}
}
