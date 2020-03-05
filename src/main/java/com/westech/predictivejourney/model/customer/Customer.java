package com.westech.predictivejourney.model.customer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	private String emailAddress;
	//private String bsLastPurchaseAt;
	private Integer bsLastPurchaseSince = 0;
	private Integer bsLifetimeRevenue = 0;
	private Integer bsLifetimeVisits = 0;
	private Integer bsPredictiveEngagementPercentile = 0;
	private Integer bsPredictivePurchaseIntent = 0;
	private Integer bsPredictiveRetention = 0;
	private Integer mwSubsCount = 0;
	private Integer mwListsCount = 0;
	private float marketingScore = 0;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Integer getBsLastPurchaseSince() {
		return bsLastPurchaseSince;
	}

	public void setBsLastPurchaseSince(Integer bsLastPurchaseSince) {
		this.bsLastPurchaseSince = bsLastPurchaseSince;
	}

	public Integer getBsLifetimeRevenue() {
		return bsLifetimeRevenue;
	}

	public void setBsLifetimeRevenue(Integer bsLifetimeRevenue) {
		this.bsLifetimeRevenue = bsLifetimeRevenue;
	}

	public Integer getBsLifetimeVisits() {
		return bsLifetimeVisits;
	}

	public void setBsLifetimeVisits(Integer bsLifetimeVisits) {
		this.bsLifetimeVisits = bsLifetimeVisits;
	}

	public Integer getBsPredictiveEngagementPercentile() {
		return bsPredictiveEngagementPercentile;
	}

	public void setBsPredictiveEngagementPercentile(Integer bsPredictiveEngagementPercentile) {
		this.bsPredictiveEngagementPercentile = bsPredictiveEngagementPercentile;
	}

	public Integer getBsPredictivePurchaseIntent() {
		return bsPredictivePurchaseIntent;
	}

	public void setBsPredictivePurchaseIntent(Integer bsPredictivePurchaseIntent) {
		this.bsPredictivePurchaseIntent = bsPredictivePurchaseIntent;
	}

	public Integer getBsPredictiveRetention() {
		return bsPredictiveRetention;
	}

	public void setBsPredictiveRetention(Integer bsPredictiveRetention) {
		this.bsPredictiveRetention = bsPredictiveRetention;
	}

	public Integer getMwSubsCount() {
		return mwSubsCount;
	}

	public void setMwSubsCount(Integer mwSubsCount) {
		this.mwSubsCount = mwSubsCount;
	}

	public Integer getMwListsCount() {
		return mwListsCount;
	}

	public void setMwListsCount(Integer mwListsCount) {
		this.mwListsCount = mwListsCount;
	}

	public float getMarketingScore() {
		return marketingScore;
	}

	public void setMarketingScore(float marketingScore) {
		this.marketingScore = marketingScore;
	}
}
