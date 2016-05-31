package pages;

import wrappers.OpentapsWrappers;

public class CRMHomePage extends OpentapsWrappers {
	public MyLeadsPage clickLead(){
		clickByLink("Leads");
		return new MyLeadsPage();
		
	}

}
