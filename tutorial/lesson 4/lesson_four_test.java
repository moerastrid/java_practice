class Point {
	protected int x, y;
	
	// no-arg constructor
	public Point() {
		x = y = 0;
	}
	
	// constructor with 2 args
	public Point(int a, int b) {
		x = a;
		y = b;
	}
}

class	ColorPoint extends Point {
	protected String color;

	public ColorPoint() {
		color = "red";
	}

	public ColorPoint(int a, int b) {
		super(a, b);
		color = "red";
	}

	public ColorPoint(int a, int b, String col) {
		super(a, b);
		color = col;
	}
}

class TestFour {
	public static void main(String [] args) {
		Point one = new Point();
		Point two = new Point(1, 2);

		System.out.println("Point one: " + one.x + ", " + one.y);
		System.out.println("Point two: " + two.x + ", " + two.y);

		ColorPoint three = new ColorPoint();
		ColorPoint four = new ColorPoint(3, 4);
		ColorPoint five = new ColorPoint(5, 6, "yellow");

		System.out.println("Point three: " + three.x + ", " + three.y + ", " + three.color);
		System.out.println("Point four: " + four.x + ", " + four.y + ", " + four.color);
		System.out.println("Point five: " + five.x + ", " + five.y + ", " + five.color);

		Point six = five;		// why no warning?
		System.out.println("Point six: " + six.x + ", " + six.y);
	}
}
