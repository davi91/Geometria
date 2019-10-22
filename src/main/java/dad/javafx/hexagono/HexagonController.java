package dad.javafx.hexagono;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class HexagonController {

	private HexagonModel model;
	private HexagonView view;
	
	public HexagonController() {
		
		model = new HexagonModel();
		view = new HexagonView();
		
		// Usamos bind bidireccionales para transformar el texto en un número que el modelo pueda interpretar
		view.getRadiusTxt().textProperty().bindBidirectional(model.radiusProperty(), new NumberStringConverter());
		
		view.getAreaTxt().textProperty().bind(Bindings.selectString(model.areaProperty()));
		view.getPerimeterTxt().textProperty().bind(Bindings.selectString(model.perimeterProperty()));
	}
	
	public HexagonView getRoot() {
		return view;
	}
}
