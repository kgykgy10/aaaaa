package omok_gy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello");

	Point p = new Point(1,2);
	
	Point p2 = new Point();
	
	
	
	Player player1 = new Player("kgy");
	
	player1.showPlayerName();
	
	
	Point p3 = new Point(player1,1,1);
	p3.owner.showPlayerName();
	
	p.printPoint();
	p2.printPoint();

	}

}
