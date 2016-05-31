package pages;

import wrappers.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers  {
	public ViewLeadPage verifyFirstName(){
		verifyFirstName();
		return this;
	}
		public FindLeadPage clickOnFindLead(){
			clickByLink("Find Leads");
			return new FindLeadPage();
		
	}
       
		public ViewLeadPage clickOnEdit() {
			clickByLink("Edit");
			return this;
		}
		
		public ViewLeadPage selectSource(String data) {
			selectById("addDataSourceForm_dataSourceId", data);
			return this;
		}
		
		public ViewLeadPage addSource() {
			clickByXpath("//form[@id='addDataSourceForm']/input[2]");
			return this;
		}

		public ViewLeadPage selectMarketingCampaign(String data) {
			selectById("addMarketingCampaignForm_marketingCampaignId", data);
			return this;
		}
		
		public ViewLeadPage addMarketingCampaign() {
			clickByXpath("//form[@id='addMarketingCampaignForm']/input[2]");
			return this;
		}
		
		public ViewLeadPage verifySource(String data){
			verifyTextByXpath("//*[@id='listDataSources_dataSourceId_o_0_sp']", data);
			return this;
		}
		
		public ViewLeadPage verifyMarketingCampaign(String data){
			verifyTextByXpath("//table[@class='crmsfaListTable']/a", data);
			return this;
		}
		
		public MergeLeadPage clickMergeLead() {
			clickByLink("Merge Leads");
			return new MergeLeadPage();
		}
		
		public ViewLeadPage deleteLead() {
			clickByLink("Delete");
			return this;
		}
		
		
		
	/*	public ViewLeadPage enterFirstNameToFind(String data) {
			enterByXpath("//input[@name='firstName']",data);
			return this;
		}

		public ViewLeadPage clickFindLeads() {
			clickByClassName("x-btn-center");
			return this;
		}
		
		public ViewLeadPage clickOnFirstResult() {
			clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
			return new ViewLeadPage();
		}*/
}