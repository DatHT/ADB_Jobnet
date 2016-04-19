package se0867.adb.service;

import se0867.adb.model.Account;
import se0867.adb.model.Member;

public interface IAccountManager {
	Account getAccount(long id);
	Member checkLogin(String username, String pass);
}
