package com.cg.onlineWallet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.onlineWallet.dao.OnlineWalletDao;
import com.cg.onlineWallet.entity.WalletTransaction;
import com.cg.onlineWallet.exception.OnlineWalletException;

public class OnlineWalletServiceImpl implements OnlineWalletService{

	@Autowired
	OnlineWalletDao onlineWalletDao;
	
	@Override
	public List<WalletTransaction> findAllTransactionsById(int accountId) throws OnlineWalletException {
		
		List<WalletTransaction> walletTransactions = null;
		if( onlineWalletDao.existsById(accountId))
		{
			walletTransactions=onlineWalletDao.findAllTransactionsById(accountId);
			
//			walletTransaction= onlineWalletDao.findById(accountId).get();
			
		}
		else
		{
			throw new OnlineWalletException(accountId+ " ID NOT FOUND ");
		}
		return walletTransactions ; 
		
		
	}

}
