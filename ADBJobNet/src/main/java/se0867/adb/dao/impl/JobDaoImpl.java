package se0867.adb.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import se0867.adb.dao.IJobDao;
import se0867.adb.model.Job;

@Repository
public class JobDaoImpl implements IJobDao {
	
	@Autowired
	private SessionFactory factory;
	
	protected Session getSession() {
		return factory.getCurrentSession();
	}

	@Override
	public boolean insertJob(Job job) {
		// TODO Auto-generated method stub
		return (getSession().save(job) != null)? true : false;
	}

}
