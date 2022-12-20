package kgy_project;

import java.util.ArrayList;

public class Person {
	private int personId;
	private String personName;
	
	private ArrayList<Score> scoreList =  new ArrayList<Score>(); // 청약자의 청약점수 리스트
	
		public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}

		public void addScore(Score score) {
			scoreList.add(score); // ********* 청약자의 청약점수를 등록하는 메서드
		}
		
		public int getPersonId() {
			return personId;
		}

		public void setPersonId(int personId) {
			this.personId = personId;
		}

		public String getPersonName() {
			return personName;
		}

		public void setPersonName(String personName) {
			this.personName = personName;
		}

		public ArrayList<Score> getScoreList() {
			return scoreList;            // 청약자 점수 목록 조회
		}

		public void setScoreList(ArrayList<Score> scoreList) {
			this.scoreList = scoreList;
		}
		
}
