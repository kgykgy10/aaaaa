package kgy_project;

public class Xi implements win_lose_check {
	
	@Override
	public String getCheck(int score) {
		String check;
		
		if(score>=60)
	     check = "win";
		else 
		check = "fail";
		return check;
		
	}

}
