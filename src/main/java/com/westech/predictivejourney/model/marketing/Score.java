package com.westech.predictivejourney.model.marketing;

public class Score {

	private int acquire;
	private int convert;
	private int adopt;
	private int engage;

	public int getAcquire() {
		return acquire;
	}

	public void setAcquire(int acquire) {
		this.acquire = acquire;
	}

	public int getConvert() {
		return convert;
	}

	public void setConvert(int convert) {
		this.convert = convert;
	}

	public int getAdopt() {
		return adopt;
	}

	public void setAdopt(int adopt) {
		this.adopt = adopt;
	}

	public int getEngage() {
		return engage;
	}

	public void setEngage(int engage) {
		this.engage = engage;
	}
}
