package pages;

import wrappers.OpentapsWrappers;

public class MergeLeadPage extends OpentapsWrappers{
	
	public MergeLeadPage enterFromToMerge(String data) {
		enterById("ComboBox_partyIdFrom", data);
		return this;
	}
	 
	public MergeLeadPage enterToToMerge(String data) {
		enterById("ComboBox_partyIdTo", data);
		return this;
	}

	public MergeLeadPage clickMerge() {
		clickByLink("Merge");
		return this;
	}
	
	public FindLeadPage clickFindLeadsinMerge(){
		clickByLink("Find Leads");
		return new FindLeadPage();
	}
	
}
