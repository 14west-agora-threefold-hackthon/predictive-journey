package com.westech.predictivejourney.model.marketing;

public class Score {

	private int marketingScore = 10;

	public void increaseScore(int point) {
		marketingScore += point;
	}

	public void decreaseScore(int point) {
		marketingScore -= point;
	}
}
