package oop.inheritance;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape();

		s.area();

		Rectangle r = new Rectangle();
		
		r.setLength(5);
		
		r.setWidth(5);

		r.area();
	
		Shape shape = new Rectangle();
		
		shape.setColour("Red");
		shape.setBorderWidth("Five");
		System.out.println(shape.getColour() + " " + shape.getBorderWidth());

		Rectangle rectangle = (Rectangle) shape;

		rectangle.setLength(5);
		rectangle.setWidth(5);
		
		rectangle.area();
		shape.area();

	}
}
