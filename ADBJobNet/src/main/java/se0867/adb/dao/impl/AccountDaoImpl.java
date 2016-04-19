package se0867.adb.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import se0867.adb.dao.IAccountDao;
import se0867.adb.model.Account;
import se0867.adb.model.Member;

@Repository
public class AccountDaoImpl implements IAccountDao{

	@Autowired
	private SessionFactory factory;
	
	protected Session getSession() {
		return factory.getCurrentSession();
	}
	
	
	@Override
	public Account getAccountById(long id) {
		// TODO Auto-generated method stub
		return (Account) getSession().get(Account.class, id);
	}

	@Override
	public Member checkLogin(String username, String password) {
		String sql = "Select e from Member e where e.email = :name and e.password = :pass";
		Query query = getSession().createQuery(sql);
		query.setParameter("name", username);
		query.setParameter("pass", password);
		Member account = (Member) query.uniqueResult();
		return account;
	}

}
