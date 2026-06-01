package oop.withoutconstructor;

public class TestShape {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setLength(4);
		r.setWidth(4);

		Circle c = new Circle();
		c.setRadius(2);

		Triangle t = new Triangle();
		t.setBase(3);
		t.setHeight(3);

		r.area();
		c.area();
		t.area();

	}
}
