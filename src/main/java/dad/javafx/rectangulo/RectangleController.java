package dad.javafx.rectangulo;

import javafx.beans.binding.Binding;
import javafx.beans.binding.Bindings;

public class RectangleController {

	private RectangleModel model;
	private RectangleView view;
	
	public RectangleController() {
		
		model = new RectangleModel();
		view = new RectangleView();
		
		model.widthProperty().bind(Bindings.selectDouble(view.getWidthTxt().textProperty()));
		model.heightProperty().bind(Bindings.selectDouble(view.getHeightTxt().textProperty()));
		view.getAreaTxt().textProperty().bind(Bindings.selectString(model.areaProperty()));
	}
	
	public RectangleView getRoot() {
		return view;
	}
}
