package com.cg.onlineWallet.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="walletAccount_tbl")
public class WalletAccount {
	
	@Id
	@GeneratedValue
	@Column(name="accountId")
	private int accountId; 
	
	@Column(name="accountBalance")
    private double accountBalance;
	
	@Column(name="status")
	private String status;
	
	@OneToMany(mappedBy="WalletAccount")
	@JsonIgnore
	List<WalletTransaction> list=new ArrayList<WalletTransaction>();

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<WalletTransaction> getList() {
		return list;
	}

	public void setList(List<WalletTransaction> list) {
		this.list = list;
	}
	
	
}
