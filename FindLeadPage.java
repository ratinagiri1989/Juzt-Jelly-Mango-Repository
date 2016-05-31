package pages;

import wrappers.OpentapsWrappers;

public class FindLeadPage extends OpentapsWrappers {

	public FindLeadPage enterFirstName(String data) {
		enterByXpath("//input[@name='firstName']",data);
		return this;
	}

	public FindLeadPage clickFindLeads() {
		clickByClassName("x-btn-center");
		return this;
	}
	
	public ViewLeadPage clickOnFirstResult() {
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		return new ViewLeadPage();
	}
}
