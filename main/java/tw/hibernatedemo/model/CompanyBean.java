package tw.hibernatedemo.model;

import java.io.Serializable;

public class CompanyBean implements Serializable{
	private int companyId;
	private String companyName;
	public CompanyBean() {
		super();
	}
	public CompanyBean(int companyId, String companyName) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
	}
	
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
