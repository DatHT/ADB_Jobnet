package se0867.adb.dao;

import se0867.adb.model.Account;
import se0867.adb.model.Member;

public interface IAccountDao {
	Account getAccountById(long id);
	Member checkLogin(String username, String password);
}
