package dad.javafx.circulo;

import java.text.DecimalFormat;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.ReadOnlyFloatProperty;
import javafx.beans.property.ReadOnlyFloatWrapper;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleFloatProperty;

public class CircleModel {

	private FloatProperty radius = new SimpleFloatProperty();
	
	private ReadOnlyFloatWrapper area = new ReadOnlyFloatWrapper();
	private ReadOnlyFloatWrapper perimeter = new ReadOnlyFloatWrapper();
	
	
	public CircleModel() {
		
		area.bind(radius.multiply(Math.PI).multiply(radiusProperty())); // PI * r^2 
		perimeter.bind(radius.multiply(Math.PI*2)); // 2*PI*r
	}


	public final FloatProperty radiusProperty() {
		return this.radius;
	}
	


	public final float getRadius() {
		return this.radiusProperty().get();
	}
	


	public final void setRadius(final float radius) {
		this.radiusProperty().set(radius);
	}
	


	public final ReadOnlyFloatProperty areaProperty() {
		return this.area;
	}
	


	public final float getArea() {
		return this.areaProperty().get();
	}
	


	public final ReadOnlyFloatProperty perimeterProperty() {
		return this.perimeter;
	}
	


	public final float getPerimeter() {
		return this.perimeterProperty().get();
	}
	


	
	
	
	
	
	
}
