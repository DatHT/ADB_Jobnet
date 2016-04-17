package se0867.adb.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import se0867.adb.dao.IFriendShipDao;
import se0867.adb.model.FriendShip;

@Repository
public class FriendShipDaoImpl implements IFriendShipDao {

	@Autowired
	private SessionFactory factory;
	
	protected Session getSession() {
		return factory.getCurrentSession();
	}
	
	@Override
	public List<FriendShip> getFriends(String userEmail) {
		// TODO Auto-generated method stub
		String sql = "Select e from FriendShip e where e.memberEmail1 = :email Or e.memberEmail2 = :email2";
		Query query = getSession().createQuery(sql);
		query.setParameter("email", userEmail);
		query.setParameter("email2", userEmail);
		
		List<FriendShip> list = query.list();
		return list;
	}

}
