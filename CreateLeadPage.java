

package pages;

import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers  {
	public CreateLeadPage enterCompanyName(String data){
		enterById("createLeadForm_companyName",data);
		return this;
	}
	public CreateLeadPage enterFirstName(String data){
		enterById("createLeadForm_firstName",data);
		return this;
	}
	public CreateLeadPage enterLastName(String data){
		enterById("createLeadForm_lastName",data);
		return this;
	}
	public ViewLeadPage clickCreateLeadButton(){
		clickByClassName("smallSubmit");
		return new ViewLeadPage();
	}

		
	}
