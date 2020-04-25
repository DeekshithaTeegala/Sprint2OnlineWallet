package com.cg.onlineWallet.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.onlineWallet.entity.WalletAccount;
import com.cg.onlineWallet.entity.WalletTransaction;
import com.cg.onlineWallet.exception.OnlineWalletException;

@Repository
public interface OnlineWalletDao extends JpaRepository<WalletAccount,Integer>{


	
//	@Query(" FROM WalletTransaction where WalletAccount.accountId=:id")
	@Query(" FROM WalletAccount where WalletTransaction.accountId=:id")
	public List<WalletTransaction>  findAllTransactionsById(@Param("id") int id) throws OnlineWalletException;
	
//	@Query(" FROM Employee where department.departmentId=:id")
//	public List<Employee>  findByDepartmentId(@Param("id") int id);
}
