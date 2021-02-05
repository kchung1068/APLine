public class APLine {
	private int a;
	private int b;
	private int c;

	private double slope;

	public APLine(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;

	}

	public double getSlope() {
		return (double)(a) * -1 / (double)(b);
	}

	public boolean isOnLine(int x, int y) {
		if ((a * x) + (b * y) + c == 0) {
			return true;
		} else {
			return false;
		}
	}
}
