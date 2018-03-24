package com.hamduraiyu.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;


public class Account {
	@NotNull(message="Account# can't be null")
	private Integer accountNo;
	
	@NotNull(message="Account Holder Name can't be blank")
	private String accountHolderName;
	
	@NotNull(message="Balance Amount is required")
	private Integer balance;
	
	@NotNull(message="Account type can't be null")
	private String accountType;
	
	@DateTimeFormat(pattern="MM/dd/yyyy")
	@NotNull(message="Date of birth can't be null")
	private Date dateOfBirth;
	
	@NotNull(message="PS Code is required")
	private String psCode;
	
	public Account() {
		accountNo = 0;
		accountHolderName = "";
		balance = 0;
	}

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPsCode() {
		return psCode;
	}

	public void setPsCode(String psCode) {
		this.psCode = psCode;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", balance=" + balance
				+ ", accountType=" + accountType + ", dateOfBirth=" + dateOfBirth + ", psCode=" + psCode + "]";
	}
}
