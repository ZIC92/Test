package com.example.banking;

public class Customer {
	private int CmsId;
	private String CmsName;
	private CheckingAccount[] AccArray = new CheckingAccount[20];
	private int AccCounter = 0;

	public void setCmsId(int cmsId) {
		CmsId = cmsId;
	}

	public int getCmsId() {
		return CmsId;
	}

	public void setCmsName(String cmsName) {
		CmsName = cmsName;
	}

	public String getCmsName() {
		return CmsName;
	}

	public void addAccount(CheckingAccount Acc) {
		this.AccArray[this.AccCounter] = Acc;
		this.AccCounter += 1;
	}

	public Account getAccount(int AccId) {
		int AccGet = 0;
		for (int i = 0; i < this.AccCounter; i++) {
			if (this.AccArray[i].getId() == AccId) {
				AccGet = this.AccArray[i].getId();
				break;
			}
		}
		return this.AccArray[AccGet];
	}
}
