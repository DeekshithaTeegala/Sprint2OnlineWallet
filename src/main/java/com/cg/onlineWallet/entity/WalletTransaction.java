package com.cg.onlineWallet.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="WalletTransaction_tbl")
public class WalletTransaction {
	
	@Id
	@Column(name="transactionId")
	@GeneratedValue(generator="mygen",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="mygen",sequenceName="transaction_sequence",allocationSize=1)
	private int transactionId;
	
	@Column(name="description",length=15)
	private String description;
	
	@Column(name="localDateTime")
	private LocalDate dateOfTransaction;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="accountBalance")
	private double accountBalance;
	
	@ManyToOne
	@JoinColumn(name="accountId",referencedColumnName="accountId")
	private WalletAccount walletAccount;

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDateOfTransaction() {
		return dateOfTransaction;
	}

	public void setDateOfTransaction(LocalDate dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public WalletAccount getWalletAccount() {
		return walletAccount;
	}

	public void setWalletAccount(WalletAccount walletAccount) {
		this.walletAccount = walletAccount;
	}
	
	

}
