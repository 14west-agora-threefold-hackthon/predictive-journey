package com.westech.predictivejourney.model.marketing;

public class Score {

	private float marketingScore = 0;

	public void increase(float point) {
		marketingScore += point;
	}

	public void decrease(float point) {
		marketingScore -= point;
	}

	public float getMarketingScore() {
		return marketingScore;
	}

	public void setMarketingScore(float marketingScore) {
		this.marketingScore = marketingScore;
	}
}
