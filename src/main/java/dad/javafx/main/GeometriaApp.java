package dad.javafx.main;

import dad.javafx.rectangulo.RectangleController;
import dad.javafx.shapes.Polyhedron;
import dad.javafx.shapes.Triangle;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GeometriaApp extends Application {
	
	private RectangleController rectangleController;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		rectangleController = new RectangleController();
		
		TabPane root = new TabPane();
		root.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE); // Para evitar que se cierren
		
		Tab tab1 = new Tab("Rectángulo");
		tab1.setContent(rectangleController.getRoot());
		
		Tab tab2 = new Tab("Círculo");
		Tab tab3 = new Tab("Triángulo");
		Tab tab4 = new Tab("Hexágono");
		root.getTabs().addAll(tab1, tab2, tab3, tab4);
		
		Scene scene = new Scene(root, 512, 256);
		primaryStage.setTitle("Geometría");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
