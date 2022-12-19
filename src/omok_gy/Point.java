package omok_gy;

public class Point {

	private int x;
	private int y;
	
	protected Player owner;
	
	
	public Point()
	{
		x = 0;
		y = 0;
	}
	
	public Point(int xx, int yy) {
		x = xx;
		y = yy;
	}
	
	public Point(Player p, int xx, int yy) {
		owner = p;
		x = xx;
		y = yy;
	}
	
	protected void printPoint() {
		System.out.printf("(%d,%d)\n",x,y);
	}
}
