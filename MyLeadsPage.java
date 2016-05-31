package pages;

import wrappers.OpentapsWrappers;

public class MyLeadsPage extends OpentapsWrappers  {
	public CreateLeadPage clickCreateLead(){
		clickByLink("Create Lead");
		return new CreateLeadPage();
		
	}

	
	public FindLeadPage clickOnFindLead(){
		clickByLink("Find Leads");
		return new FindLeadPage();
	
}
	
	public MergeLeadPage clickOnMergeLead(){
		clickByLink("Merge Leads");
		return new MergeLeadPage();
	
}

}
