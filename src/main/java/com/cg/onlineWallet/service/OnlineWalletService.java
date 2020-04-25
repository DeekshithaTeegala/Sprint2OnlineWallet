package com.cg.onlineWallet.service;

import java.util.List;

import com.cg.onlineWallet.entity.WalletTransaction;
import com.cg.onlineWallet.exception.OnlineWalletException;



public interface OnlineWalletService {
	
	public List<WalletTransaction>  findAllTransactionsById(int accountId) throws OnlineWalletException;

}
