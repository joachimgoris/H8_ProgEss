package opdracht;

public class RectangleApp {

	public static void main(String[] args) {
		System.out.println("This program uses a rectangle");
		
		Rectangle rect1 = new Rectangle();
		System.out.println("Rect1\t"+rect1.getX()+"\t"+rect1.getY()+"\t"+rect1.getHeight()+"\t"+rect1.getWidth());
		rect1.setX(0);
		rect1.setY(0);
		rect1.setHeight(10);
		rect1.setWidth(10);
		System.out.println("Rect1\t"+rect1.getX()+"\t"+rect1.getY()+"\t"+rect1.getHeight()+"\t"+rect1.getWidth());
		
		Rectangle rect2 = new Rectangle();
		rect2.setX(11);
		rect2.setY(11);
		rect2.setHeight(5);
		rect2.setWidth(5);
		System.out.println("Rect2\t"+rect2.getX()+"\t"+rect2.getY()+"\t"+rect2.getHeight()+"\t"+rect2.getWidth());
		
		System.out.println("Rect1\t"+rect1.getArea()+"\t"+rect2.getArea());
		System.out.println("Rect1\t"+rect1.getPerimeter()+"\t"+rect2.getPerimeter());
		
		rect2.grow(-8, -8);
		System.out.println("Rect2\t"+rect2.getX()+"\t"+rect2.getY()+"\t"+rect2.getHeight()+"\t"+rect2.getWidth());
		
		Rectangle rect3 = new Rectangle();
		rect3.setX(0);
		rect3.setY(0);
		rect3.setHeight(-7);
		rect3.setWidth(-7);
		System.out.println("Rect3\t"+rect3.getX()+"\t"+rect3.getY()+"\t"+rect3.getHeight()+"\t"+rect3.getWidth());
		rect3.grow(5);
		System.out.println("Rect3\t"+rect3.getX()+"\t"+rect3.getY()+"\t"+rect3.getHeight()+"\t"+rect3.getWidth());
		
		Rectangle rect4 = new Rectangle(5,5);
		System.out.println("Rect4\t"+rect4.getX()+"\t"+rect4.getY()+"\t"+rect4.getHeight()+"\t"+rect4.getWidth());
		
		Rectangle rect5 = new Rectangle(5,5,5,5);
		System.out.println("Rect5\t"+rect5.getX()+"\t"+rect5.getY()+"\t"+rect5.getHeight()+"\t"+rect5.getWidth());
		
		Rectangle rect6 = new Rectangle(rect5);
		System.out.println("Rect6\t"+rect6.getX()+"\t"+rect6.getY()+"\t"+rect6.getHeight()+"\t"+rect6.getWidth());
		
	}
}
