package se0867.adb.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se0867.adb.dao.IAccountDao;
import se0867.adb.dao.impl.AccountDaoImpl;
import se0867.adb.model.Account;
import se0867.adb.model.Member;
import se0867.adb.service.IAccountManager;

@Service
public class AccountManager implements IAccountManager {
	@Autowired
	private IAccountDao dao;

	@Override
	@Transactional
	public Account getAccount(long id) {
		// TODO Auto-generated method stub
		return dao.getAccountById(id);
	}

	@Override
	@Transactional
	public Member checkLogin(String username, String pass) {
		// TODO Auto-generated method stub
		return dao.checkLogin(username, pass);
	}

}
