package opdracht;

public class Rectangle {
	private int x;
	private int y;
	private int height;
	private int width;
	
	//Constructors
	public Rectangle(int x, int y, int width, int height) {
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
	}
	
	public Rectangle() {
		this(0,0,0,0);
	}
	
	public Rectangle(int width, int height) {
		this(0,0,width,height);
	}
	
	public Rectangle(Rectangle rect) {
		this(rect.getX(),rect.getY(),rect.getWidth(),rect.getHeight());
	}
	
	//getters
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public double getArea() {
		return (double)height*width;
	}
	
	public int getPerimeter() {
		return (width+height)*2;
	}

	//setters
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setHeight(int height) {
		if(height<0) {
			this.height = -height;
		}
		else {
			this.height = height;
		}
	}
	
	public void setWidth(int width) {
		if(width<0)
		{
			this.width = -width;
		}
		else {
			this.width = width;
		}
		
	}
	
	public void setPosition(int x, int y) {
		setX(x);
		setY(y);
	}
	
	//Methods
	public void grow(int dw, int dh) {
		if((this.width+dw)<0) {
			setWidth(this.width+-dw);
		}
		else {
			setWidth(this.width+dw);
		}
		if((this.height+dh)<0) {
			setHeight(this.height+-dh);
		}
		else {
			setHeight(this.height+dh);
		}
		
	}
	
	public void grow(int d) {
		if((this.width+d)<0) {
			setWidth(this.width+-d);
		}
		else {
			setWidth(this.width+d);
		}
		if((this.height+d)<0) {
			setHeight(this.height+-d);
		}
		else {
			setHeight(this.height+d);
		}
	}
}