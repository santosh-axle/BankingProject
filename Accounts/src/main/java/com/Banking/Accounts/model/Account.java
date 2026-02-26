package com.Banking.Accounts.model;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {
	@Id
	private int id;
	private String holderName;
	private int accountNumber;
	
	private Date openDate;
	private String branch;
	
	public Account(String holderName, int accountNumber, Date openDate, String branch) {
		super();
		this.holderName = holderName;
		this.accountNumber = accountNumber;
		this.openDate = openDate;
		this.branch = branch;
	}

	public Account() {
		super();
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Account [holderName=" + holderName + ", accountNumber=" + accountNumber + ", branch=" + branch + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, branch, holderName, id, openDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return accountNumber == other.accountNumber && Objects.equals(branch, other.branch)
				&& Objects.equals(holderName, other.holderName) && id == other.id
				&& Objects.equals(openDate, other.openDate);
	}
	
	

}
