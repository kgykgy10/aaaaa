package kgy_project;

public class Prugio implements win_lose_check {
	
	@Override
	public String getCheck(int score) {
		String check;
		
		if(score>=50)
	     check = "win";
		else
		check = "fail";
		
		return check;
	}

}
