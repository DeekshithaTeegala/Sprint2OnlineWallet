package com.cg.onlineWallet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineWallet.entity.WalletTransaction;
import com.cg.onlineWallet.exception.OnlineWalletException;
import com.cg.onlineWallet.service.OnlineWalletService;


@RestController
@CrossOrigin("*")
public class OnlineWalletController {
	
	@Autowired
	OnlineWalletService onlineWalletService;
	
	@GetMapping("WalletTransactions")
	public ResponseEntity<List<WalletTransaction>> findAllTransactionsById(@PathVariable("id")  int id) throws OnlineWalletException
	{
		List<WalletTransaction> list = onlineWalletService.findAllTransactionsById(id);
		ResponseEntity<List<WalletTransaction>>  rt = new ResponseEntity<List<WalletTransaction>>(list,HttpStatus.OK);
		return rt;
			}

}
