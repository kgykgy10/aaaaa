package kgy_project;



public class Ramian implements win_lose_check {
	
	@Override
	public String getCheck(int score) {
		String check;
		
		if(score>=70)
	     check = "win";
		else
		check = "fail";
		return check;
		
	}

}
