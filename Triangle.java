package exceptionHandling_ex5;

public class Triangle {
	private int side1;
	private int side2;
	private int side3;

	public Triangle(int side1, int side2, int side3)
			throws IllegalTriangleException {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		if ((side1 + side2 < side3) || (side1 + side3 < side2)
				|| (side2 + side3 < side1)) {
			throw new IllegalTriangleException("IllegalTriangleException");
		}
	}

}
