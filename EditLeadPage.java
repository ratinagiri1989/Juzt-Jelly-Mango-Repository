package pages;

import wrappers.OpentapsWrappers;

public class EditLeadPage extends OpentapsWrappers{
	
	public EditLeadPage selectSource(String data) {
		selectById("addDataSourceForm_dataSourceId", data);
		return this;
	}

}
