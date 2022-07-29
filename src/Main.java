
public class Main {
	public static void main(String[] args) {
		StdDraw.setXscale(-10.0,10.0);
		StdDraw.setYscale(-10.0,10.0);
		StdDraw.setPenRadius(2.0/1000.0);
		StdDraw.setPenColor(StdDraw.BLACK);
		drawGrid(-10, -10, 10, 10);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledSquare(0, 0, 5);
	}
	
	public static void drawGrid(int minX, int minY, int maxX, int maxY) {
		for(int i = minX; i<=maxX; i++) {
			StdDraw.line(i, minY, i, maxY);
			StdDraw.line(minX, i, maxX, i);
		}
	}
}
