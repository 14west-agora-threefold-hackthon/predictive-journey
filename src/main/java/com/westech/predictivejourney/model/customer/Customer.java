package com.westech.predictivejourney.model.customer;

public class Customer {

	private String emailAddress;
	private String bsLastPurchaseAt;
	private String bsLifetimeRevenue;
	private String bsLifetimeVisits;
	private Integer bsPredictiveEngagementPercentile;
	private Integer bsPredictivePurchaseIntent;
	private Integer bsPredictiveRetention;
	private Integer mwSubsCount;
	private Integer mwListsCount;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getBsLastPurchaseAt() {
		return bsLastPurchaseAt;
	}

	public void setBsLastPurchaseAt(String bsLastPurchaseAt) {
		this.bsLastPurchaseAt = bsLastPurchaseAt;
	}

	public String getBsLifetimeRevenue() {
		return bsLifetimeRevenue;
	}

	public void setBsLifetimeRevenue(String bsLifetimeRevenue) {
		this.bsLifetimeRevenue = bsLifetimeRevenue;
	}

	public String getBsLifetimeVisits() {
		return bsLifetimeVisits;
	}

	public void setBsLifetimeVisits(String bsLifetimeVisits) {
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
}
